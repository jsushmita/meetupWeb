package com.meetup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CreateMeetup
 */
@WebServlet("/createMeetup")
public class CreateMeetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public CreateMeetup() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter=null;
		RequestDispatcher requestDispatcher=null;
		String mname=request.getParameter("mname");
		String type=request.getParameter("type");
		String city=request.getParameter("city");
		String description=request.getParameter("desc");
		int mobno=Integer.parseInt(request.getParameter("mobno"));
		String dateofm=request.getParameter("date");
		HttpSession session=request.getSession(false);
		try{
			Date date = new SimpleDateFormat("dd-MM-yy").parse(dateofm);
			java.sql.Date mysqldate=new java.sql.Date(date.getTime());
		    session.setAttribute("user", "ok");
		    printWriter.println("Meetup created successfully");
		    printWriter.close();
	}
		catch(Exception e)
		{
			System.out.println("exceptionn!!!");
			System.out.println(e.getMessage());
		}
	}
}
