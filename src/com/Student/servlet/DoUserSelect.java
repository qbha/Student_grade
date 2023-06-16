package com.Student.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Student.entity.Student_User;
import com.Student.service.Student_userdao;

@WebServlet("/admin/douserselect")
public class DoUserSelect extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		
		
		 int cpage =1;//当前页
		 int count =8; //每页显示条数
		  //获取用户指定页面
		 String cp =request.getParameter("cp");
		 
		 if(cp!=null) {
			 cpage =Integer.parseInt(cp);
		 }
		 //获取所有用户记录
		 ArrayList<Student_User> list =Student_userdao.selectAll(cpage,count);				
		
		 		 
		
		
		 int arr[]=Student_userdao.totalpage(count);
		 	//放到请求对象里			 
		 request.setAttribute("userlist",list);
		 request.setAttribute("tsum", arr[0]);
		 request.setAttribute("tpage", arr[1]);
		 request.setAttribute("cpage", cpage);
		 
		 
		 request.getRequestDispatcher("admin_view.jsp").forward(request,response);				 
	}

	
}
