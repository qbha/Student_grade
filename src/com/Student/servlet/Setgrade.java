package com.Student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Student.entity.Grade;
import com.Student.service.Set_grade;
import com.Student.service.Student_userdao;

/**
 * Servlet implementation class Setgrade
 */
@WebServlet("/admin/setgrade")
public class Setgrade extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String userid=request.getParameter("userid");
		String username=request.getParameter("username");
		String userjava=request.getParameter("userjava");
		String userc=request.getParameter("userc");		
		String userweb=request.getParameter("userweb");
		String userpython=request.getParameter("userpython");
		String usersql=request.getParameter("usersql");
		 //创建用户实体
		Grade u = new Grade(userid,username,userjava,userc,userweb,userpython,usersql);
		
		//加入到数据库表中
		int count = Set_grade.insertgrade(u);
		System.out.print(u);
		//成功失败重定向
		
		if(count>0) {
			PrintWriter out =response.getWriter();
			out.print("<script language='javascript'>alert('添加成功');window.location.href='admin_setgrade.jsp';</script>");	
		//response.sendRedirect("admin_setgrade.jsp");
         
		}else{
			PrintWriter out =response.getWriter();			
			out.print("<script language='javascript'>alert('添加失败');window.location.href='admin_setgrade.jsp';</script>");
		}
		

	}
	}


