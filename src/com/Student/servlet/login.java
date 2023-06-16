package com.Student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Student.entity.Grade;
import com.Student.entity.Student_User;
import com.Student.service.Student_userdao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		int count=Student_userdao.selectBylogin(userid,password);
		if(count>0) {
			HttpSession session=request.getSession();
			HttpSession session1=request.getSession();
			Student_User user=Student_userdao.selectAdmin(userid,password);
			Grade user1=Student_userdao.selectgrade(userid);
			session.setAttribute("userid", user);
			session1.setAttribute("usergrade", user1);
			session.setAttribute("isLogin", "1");
			
			PrintWriter out =response.getWriter();			
			out.print("<script language='javascript'>"
					+ "alert('µÇÂ¼³É¹¦£¡');"
					+ "window.location.href='student_page.jsp';"
					+ "</script>");
			//response.sendRedirect("student_page.jsp");
			}else {
			PrintWriter out =response.getWriter();			
			out.print("<script language='javascript'>"
					+ "alert('µÇÂ¼Ê§°Ü£¬ÖØÐÂµÇÂ¼');"
					+ "window.location.href='student_login.jsp';"
					+ "</script>");
		
		}
		
	}

}
