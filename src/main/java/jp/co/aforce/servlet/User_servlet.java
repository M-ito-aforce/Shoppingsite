package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.User_beans;
import jp.co.aforce.dao.User_dao;

/**
 * Servlet implementation class User_servlet
 */
@WebServlet(urlPatterns = {"/views/login-in"})
public class User_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		String MEMBER_id = request.getParameter("MEMBER_id");
		String PASSWORD = request.getParameter("PASSWORD");
		
		

		
		try {
			User_dao dao = new User_dao();
			User_beans user =dao.User_servlet (MEMBER_id,PASSWORD);
			if(user != null){
				HttpSession session = request.getSession();
				
				session.setAttribute("user",user);
				response.sendRedirect("../views/user-menu.jsp");
			}else {
				response.sendRedirect("login-error.jsp");
			}
			}catch (Exception e) {
			e.printStackTrace();
		}
		
			
	}

}
