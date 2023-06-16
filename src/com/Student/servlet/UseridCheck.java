package com.Student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Student.service.Student_userdao;

/**
 * Servlet implementation class UsernameCheck
 */
@WebServlet("/useridcheck")
public class UseridCheck extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id=request.getParameter("id");
		
		int count =Student_userdao.selectByName(id);
		
		PrintWriter out =response.getWriter();
		if(count>0) {
			out.print("false");
		}else {
			out.print("true");
		}		
		out.close();
	}

	

}
