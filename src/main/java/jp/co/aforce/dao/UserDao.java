package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.UserBean;

public class UserDao extends DAO {
	//user-login.jspのログインメソッド
	public UserBean userLogin(String MEMBER_id, String PASSWORD)
			throws Exception {
		//UserBeanの6つの要素をusersとして定義
		UserBean users = null;

		//sqlと接続している
		Connection con = getConnection();

		//sql文
		String sql = "select * from users where MEMBER_id= ? and PASSWORD= ? ";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, MEMBER_id);
		ps.setString(2, PASSWORD);
		//クエリを実行した結果を返す
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			users = new UserBean();
			users.setMEMBER_id(rs.getString("MEMBER_id"));
			users.setPASSWORD(rs.getString("PASSWORD"));
			users.setLAST_NAME(rs.getString("LAST_NAME"));
			users.setFIRST_NAME(rs.getString("FIRST_NAME"));
			users.setEMAIL(rs.getString("MAIL_ADDRESS"));
			users.setADDRESS(rs.getString("ADDRESS"));
		}

		rs.close();
		ps.close();
		con.close();
		return users;
	}

	//user-add.jspのユーザー登録メソッド
	public boolean userAdd(UserBean user)
			throws Exception {
		//boolean型のaddUserはfalseという値を持っている
		boolean addUser = false;
		//Connection型のconはgetConnecttionの結果の値を持っている
		Connection con = getConnection();

		String sql = "INSERT INTO users set MEMBER_id=?,PASSWORD=?,LAST_NAME=?,FIRST_NAME=?,ADDRESS=?,MAIL_ADDRESS=? ";
		PreparedStatement ps = con.prepareStatement(sql);

		//sqlインジェクション対策で値を後から入力する
		ps.setString(1, user.getMEMBER_id());
		ps.setString(2, user.getPASSWORD());
		ps.setString(3, user.getLAST_NAME());
		ps.setString(4, user.getFIRST_NAME());
		ps.setString(5, user.getADDRESS());
		ps.setString(6, user.getEMAIL());
		//何行目が変更されたか
		int line = ps.executeUpdate();

		if (line > 0) {
			addUser = true;
		} else {
			addUser = false;
		}

		ps.close();
		con.close();

		return addUser;

	}

	//user-edit.jspの更新メソッド
	public boolean userUpdate(UserBean user)
			throws Exception {
		boolean addUser = false;
		Connection con = getConnection();

		String sql = "UPDATE users set LAST_NAME=?, FIRST_NAME=?, EMAIL=? where MEMBER_id =? ";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, user.getLAST_NAME());
		ps.setString(2, user.getFIRST_NAME());
		ps.setString(3, user.getEMAIL());
		int line = ps.executeUpdate();

		if (line > 0) {
			//lineが追加(処理が実行)された場合
			addUser = true;

		} else {
			addUser = false;
		}

		ps.close();
		con.close();

		return addUser;

	}

	public void deleteUser(UserBean user) {
		try {
				
				String sql= "DELETE from users where MEMBER_id=?";
				Connection con = getConnection(); 
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user.getMEMBER_id());
				
		} catch (Exception e) {
			e.printStackTrace();
	
		}

}

}