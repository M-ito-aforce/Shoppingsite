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
 * Servlet implementation class UserEditServlet
 */
@WebServlet(urlPatterns = {"/view/user-edit"})
public class UserEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		UserBean userBean = (UserBean)session.getAttribute("users");
	    
		//
		userBean.setLAST_NAME(request.getParameter("LAST_NAME"));
		userBean.setFIRST_NAME(request.getParameter("FIRST_NAME"));
		userBean.setEMAIL(request.getParameter("EMAIL"));
		
		UserDao userDao = new UserDao();
		try {
			boolean result = userDao.userUpdate(userBean);
			
			if (result) {
				response.sendRedirect("user-success.jsp");
			}else {
				response.sendRedirect("user-edit-false.jsp");
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			response.sendRedirect("user-edit-false.jsp");
		}
		
	}
}
