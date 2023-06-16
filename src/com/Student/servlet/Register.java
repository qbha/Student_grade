package com.Student.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Student.entity.Student_User;
import com.Student.service.Student_userdao;

@WebServlet("/register")
public class Register extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String username=request.getParameter("username");
		String usersex=request.getParameter("sex");
		String userid=request.getParameter("userid");
		String pwd=request.getParameter("password");		
		String userphone=request.getParameter("phone");
		 //�����û�ʵ��
		Student_User u = new Student_User(userid,username,pwd,usersex,userphone);
		
		//���뵽���ݿ����
		int count = Student_userdao.insert(u);
		System.out.print(u);
		//�ɹ�ʧ���ض���
		
		if(count>0) {
			PrintWriter out =response.getWriter();
			out.print("<script language='javascript'>alert('ע��ɹ���ǰ����¼');window.location.href='student_login.jsp';</script>");	
		//response.sendRedirect("student_login.jsp");
         
		}else{
			PrintWriter out =response.getWriter();			
			out.print("<script language='javascript'>alert('ע��ʧ�ܣ�����ע��');window.location.href='Student_register.jsp';</script>");
		

	}
	}
}
