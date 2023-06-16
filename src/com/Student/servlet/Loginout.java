package com.Student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Loginout
 */
@WebServlet("/loginout")
public class Loginout extends HttpServlet {


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session=request.getSession();
		session.removeAttribute("userid");
		session.removeAttribute("isLogin");
		
		PrintWriter out =response.getWriter();			
		out.print("<script language='javascript'>"
				+ "alert('×¢Ïú³É¹¦£¡');"
				+ "window.location.href='student_login.jsp';"
				+ "</script>");

		
	}

	

}
