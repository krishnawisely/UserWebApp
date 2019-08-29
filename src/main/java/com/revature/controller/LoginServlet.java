package com.revature.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.User;
import com.revature.dao.UserLogin;
import com.revature.model.UserModel;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserModel user = new UserModel();
		
		user.setStudentName(userName);
		user.setPassword(password);
		
		User userDAO = new UserLogin();
		
		UserModel userModelObj = new UserModel();
		
		userModelObj = userDAO.userLogin(user);
	
		if(userModelObj.getIsLoggedIn())
		{
			response.sendRedirect("home.jsp?username=" + user.getStudentName());
		}
		else
		{
			response.sendRedirect("index.jsp?errorMsg=Invalid username or password!");
		}
		
	}

}
