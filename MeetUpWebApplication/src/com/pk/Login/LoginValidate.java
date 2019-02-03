package com.pk.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginValidate() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printWriter=null;
		String pwd = request.getParameter("pwd");
		String username = request.getParameter("uname");
		HttpSession session = request.getSession();
		RequestDispatcher requestDispatcher=null;
		response.setContentType("text/html");
		if(pwd.equalsIgnoreCase("admin") && username.equalsIgnoreCase("admin")){
			requestDispatcher=request.getRequestDispatcher("Profile.jsp");
			requestDispatcher.forward(request, response);
		}
		else{
			printWriter=response.getWriter();
			printWriter.println("User is not registered! ");
			printWriter.print("If you wanna sign up," + "<a href='SignUp.jsp'>click here</a>");
			printWriter.close();
		}
	}

}
