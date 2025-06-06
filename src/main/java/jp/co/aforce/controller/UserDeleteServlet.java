package jp.co.aforce.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.UserBean;
import jp.co.aforce.dao.UserDao;

/**
 * Servlet implementation class UserDeleteServlet
 */
@WebServlet(urlPatterns = { "/views/user-delete"})
public class UserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		UserBean userBean = (UserBean)session.getAttribute("user");
	    
		UserDao userDao = new UserDao();
		try {
			boolean result = userDao.userDelete(userBean.getMEMBER_id());

			if (result) {
				session.invalidate();
			}
				
			response.sendRedirect("user-delete.jsp");
				
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			//失敗した時用のjspを作る
			//response.sendRedirect("user-edit-false.jsp");
		}
		
	}

}
