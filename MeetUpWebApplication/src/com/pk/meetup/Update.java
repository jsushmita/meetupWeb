package com.pk.meetup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Update() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc=getServletContext();
		String name=(String)sc.getAttribute("name");
		System.out.println(name);
		HttpSession session=request.getSession(false);
		PrintWriter out=response.getWriter();
		if(session.getAttribute("name").equals("ok"))
		{
		try {
			    out.println("<html>");
			    out.println("<head>");
			    out.println("<title>Subsribed</title>");
			    out.println("</head>");
			    out.println("<body background='bg.jpg'>YOU ARE SUBSCRIBED!!<br> To go back to your profile, <a href='Profile.jsp'>Click here</a>");
			    out.println("</body>");
			    out.println("</html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	else{
		response.setContentType("text/html");

	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Subsribed</title>");
	    out.println("</head>");
	    out.println("<body background='bg.jpg'>PLease login first!!<br> To login, <a href='Login.jsp'>Click here</a>");
	    out.println("</body>");
	    out.println("</html>");
	}

}
}
