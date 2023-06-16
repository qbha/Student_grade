package com.Student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Admin_loginservlet
 */
@WebServlet("/admin/admin_loginservlet")
public class Admin_loginservlet extends HttpServlet {
	   private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out =response.getWriter();
			request.setCharacterEncoding("UTF-8");
			String name=request.getParameter("userid");
			String password=request.getParameter("password");
			out.println("<html><body>");
			if(name== null||name.length()==0)
			{					
				out.print("<script language='javascript'>alert('用户名为空，请重新输入');window.location.href='admin_login.jsp';</script>");
				
			}
			else if(password== null||password.length()==0)
			{
				out.print("<script language='javascript'>alert('密码为空，请重新输入');window.location.href='admin_login.jsp';</script>");
			}
			else if(password.length()>0||password.length()>0)
			{
				if(name.equals("admin")&&password.equals("123456")) {
					out.print("<script language='javascript'>alert('登录成功');window.location.href='admin_page.jsp';</script>");				
				}
				else {
					out.print("<script language='javascript'>alert('信息错误！');window.location.href='admin_login.jsp';</script>");
				}
			}
			out.println("<html><body>");
		}
		
	}


