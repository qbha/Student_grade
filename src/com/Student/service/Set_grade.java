package com.Student.service;

import com.Student.dao.Basedao;
import com.Student.entity.Grade;
public class Set_grade{
	

	
	public static int insertgrade(Grade u) {
		String sql="insert into Grade values(?,?,?,?,?,?,?)";
		
		Object []params = {
				u.getUser_id(),
				u.getUser_name(),
				u.getUser_java(),
				u.getUser_C(),
				u.getUser_web(),
				u.getUser_python(),
				u.getUser_SQL()
		};
		 return Basedao.exectuIUD(sql, params);
}
}
