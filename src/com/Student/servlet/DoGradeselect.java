package com.Student.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Student.entity.Grade;
import com.Student.entity.Student_User;
import com.Student.service.Student_userdao;

/**
 * Servlet implementation class DoGradeselect
 */
@WebServlet("/admin/doGradeselect")
public class DoGradeselect extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		
		
		 int cpage =1;//��ǰҳ
		 int count =8; //ÿҳ��ʾ����
		  //��ȡ�û�ָ��ҳ��
		 String cp =request.getParameter("cp");
		 
		 if(cp!=null) {
			 cpage =Integer.parseInt(cp);
		 }
		 //��ȡ�����û���¼
		 ArrayList<Grade> list =Student_userdao.selectAllGrade(cpage, count);				
		
		 		 
		
		
		 int arr[]=Student_userdao.totalpage_grade(count);
		 	//�ŵ����������			 
		 request.setAttribute("userlist",list);
		 request.setAttribute("tsum", arr[0]);
		 request.setAttribute("tpage", arr[1]);
		 request.setAttribute("cpage", cpage);
		 
		 
		 request.getRequestDispatcher("admin_grade.jsp").forward(request,response);				 
	}

}
