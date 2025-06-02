package jp.co.aforce.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.UserBeans;
import jp.co.aforce.dao.UserDao;

@WebServlet(urlPatterns = { "/views/login" })
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		String MEMBER_id = request.getParameter("MEMBER_id");
		String PASSWORD = request.getParameter("PASSWORD");

		try {
			UserDao dao = new UserDao();
			UserBeans user = dao.UserServlet(MEMBER_id, PASSWORD);
			if (user != null) {
				HttpSession session = request.getSession();

				session.setAttribute("user", user);
				response.sendRedirect("user-menu.jsp");
			} else {
				response.sendRedirect("login-error.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}