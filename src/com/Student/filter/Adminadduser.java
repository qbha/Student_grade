package com.Student.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Adminadduser
 */
@WebFilter("/admin/adminadduser")
public class Adminadduser implements Filter {

 

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {		
			HttpServletRequest req =(HttpServletRequest)request;
			HttpServletResponse resp =(HttpServletResponse)response;
			
			req.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html;charset=utf-8");
			
			PrintWriter out = resp.getWriter();
			
			String userName=req.getParameter("username");
			if(userName.equals("")) {
				out.write("<script>");
				out.write("alert('姓名不能为空');");
				out.write("location.href='admin_adduser.jsp';");
				out.write("</script>");
				out.close();
				return;
			}
			
			String userid=req.getParameter("userid");
			if(userid.equals("")||userid.length()<6||userid.length()>16) {
				out.write("<script>");
				out.write("alert('账号长度错误！');");
				out.write("location.href='admin_adduser.jsp';");
				out.write("</script>");
				out.close();
				return;
			}
			
			String password=req.getParameter("password");
			if(password.equals("")||password.length()<6||password.length()>16) {
				out.write("<script>");
				out.write("alert('密码长度错误！');");
				out.write("location.href='admin_adduser.jsp';");
				out.write("</script>");
				out.close();
				return;
			}
			String repassword=req.getParameter("repassword");
			if(!repassword.equals(password)) {
				out.write("<script>");
				out.write("alert('两次密码不一致');");
				out.write("location.href='admin_adduser.jsp';");
				out.write("</script>");
				out.close();
				return;
			}
			String phone=req.getParameter("phone");
			if(phone.equals("")||phone.length()>11) {
				out.write("<script>");
				out.write("alert('电话号码长度错误');");
				out.write("location.href='admin_adduser.jsp';");
				out.write("</script>");
				out.close();
				return;
			}
			
			
			
			
			// pass the request along the filter chain
			chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO 自动生成的方法存根
		
	}

}
