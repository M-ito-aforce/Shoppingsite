package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.UseBeans;
import jp.co.aforce.tool.DAO;

public class UserDao extends DAO{
	public UseBeans User_servlet (String MEMBER_id, String PASSWORD)
	throws Exception {
		UseBeans users =null;
		
		Connection con = getConnection(); 
		
		
		String sql= "select * from users where MEMBER_id= ? and PASSWORD= ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1,MEMBER_id);
		ps.setString(2,PASSWORD);
		ResultSet rs =ps.executeQuery();
		

		while (rs.next()) {
			users = new UseBeans();
			users.setMEMBER_id(rs.getString("MEMBER_id"));
			users.setPASSWORD(rs.getString("PASSWORD"));
			users.setLAST_NAME(rs.getString("LAST_NAME"));
		}
		
		rs.close();
		ps.close();
		con.close();
		return users;
	}
	
}