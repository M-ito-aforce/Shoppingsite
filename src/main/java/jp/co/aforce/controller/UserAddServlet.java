package jp.co.aforce.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.UserBean;
import jp.co.aforce.dao.UserDao;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/views/register")
public class UserAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		
		UserBean userBean = new UserBean();
		//
		userBean.setMEMBER_id(request.getParameter("MEMBER_id"));
		userBean.setPASSWORD(request.getParameter("PASSWORD"));
		userBean.setLAST_NAME(request.getParameter("LAST_NAME"));
		userBean.setFIRST_NAME(request.getParameter("FIRST_NAME"));
		userBean.setEMAIL(request.getParameter("EMAIL"));
		userBean.setADDRESS(request.getParameter("ADDRESS"));
		
		UserDao userDao = new UserDao();
		try {
			boolean result = userDao.userAdd(userBean);
			
			if (result == true) {
				response.sendRedirect("user-success.jsp");
			}else {
				response.sendRedirect("user-edit-false");
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
		
		
		/*Page.header(out);
		
		Page.footer(out);*/
	}
}
