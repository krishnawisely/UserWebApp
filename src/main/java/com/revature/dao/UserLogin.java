package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.ws.Response;

import com.revature.connection.ConnectionUtil;
import com.revature.model.UserModel;

public class UserLogin implements User {

	public UserModel userLogin(UserModel user)
	{
		Connection conn;
		Boolean isLoggedIn = false;
		UserModel userModelObj = null;
		try {
			
			conn = ConnectionUtil.getConnection();
			String sql_stmt = "select name from users where email=? and password=?";
			PreparedStatement pstmt = conn.prepareStatement(sql_stmt);
			pstmt.setString(1, user.getStudentName());
			pstmt.setString(2, user.getPassword());
			
			ResultSet rs = pstmt.executeQuery();
			userModelObj = new UserModel();
			
			if(rs.next())
			{
				isLoggedIn = true;
				String name = rs.getString("name");
				userModelObj.setStudentName(name);
				userModelObj.setIsLoggedIn(isLoggedIn);
			}
			else {
				isLoggedIn = false;
				userModelObj.setIsLoggedIn(isLoggedIn);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return userModelObj;
	}
}
