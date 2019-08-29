package com.revature.test;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.revature.connection.ConnectionUtil;


public class ConnectionTest {
		
	@Test
	public void testConnection() throws ClassNotFoundException, SQLException
	{
			Connection conn = ConnectionUtil.getConnection();
			assertNotNull(conn);
	}

}
