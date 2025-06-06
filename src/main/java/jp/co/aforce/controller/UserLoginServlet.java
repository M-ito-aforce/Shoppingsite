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

//login-in.jspのアクションでこのサーブレットが起動する
@WebServlet(urlPatterns = { "/views/login" })
//HttpServletを継承している、そのためにpublic classにしている
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//form actionのpostが実行される
	protected void doPost(
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		//jspから持ってくる形式を指定する
		String MEMBER_id = request.getParameter("MEMBER_id");
		String PASSWORD = request.getParameter("PASSWORD");

		try {
			//UserDaoをインスタンス化
			UserDao dao = new UserDao();
			/*UserBeanのuserを変数として指定する
			緑色がUserDaoの関数でMEMBER_idとPASSWORDから
			ユーザーデータを持ってきている*/
			UserBean user = dao.userLogin(MEMBER_id, PASSWORD);
			if (user != null) {
				HttpSession session = request.getSession();

				session.setAttribute("user", user);
				response.sendRedirect("user-menu.jsp");
			} else {
				response.sendRedirect("login-error.jsp");
			}
			//エラーの原因を表示する
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}