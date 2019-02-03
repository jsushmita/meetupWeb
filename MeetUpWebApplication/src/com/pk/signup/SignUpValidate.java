package com.pk.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignUpValidate
 */
@WebServlet("/SignUpValidate")
public class SignUpValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SignUpValidate() {
        super();
        }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter=null;
		RequestDispatcher requestDispatcher=null;
		String pwd=request.getParameter("pwd1");;
		String username=request.getParameter("uname");
		long mobno=Integer.parseInt(request.getParameter("mobno"));
		int age=Integer.parseInt(request.getParameter("age"));
		HttpSession session=request.getSession();
		try{
			ServletContext sc=getServletContext();
			printWriter=response.getWriter();
		    session.setAttribute("user", "ok");
		    requestDispatcher=request.getRequestDispatcher("Profile.jsp");
			requestDispatcher.forward(request, response);
		    printWriter.close();
		}
		catch(Exception e)
		{
			System.out.println("Exceptionnnn!!!!");
		}
	}

}
