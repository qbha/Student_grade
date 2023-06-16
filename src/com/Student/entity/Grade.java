package com.Student.entity;

public class Grade {
	private String User_id;
	private String User_name; 
	
	private String User_java ;
	private String User_C ;
	private String User_web ;
	private String User_python ;
	private String User_SQL ;
	
	public Grade(String user_id, String user_name, String user_java, String user_C, String user_web, String user_python,
			String user_SQL) {
		super();
		User_id = user_id;
		User_name = user_name;
		User_java = user_java;
		User_C = user_C;
		User_web = user_web;
		User_python = user_python;
		User_SQL = user_SQL;
	}
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getUser_java() {
		return User_java;
	}
	public void setUser_java(String user_java) {
		User_java = user_java;
	}
	public String getUser_C() {
		return User_C;
	}
	public void setUser_C(String user_C) {
		User_C = user_C;
	}
	public String getUser_web() {
		return User_web;
	}
	public void setUser_web(String user_web) {
		User_web = user_web;
	}
	public String getUser_python() {
		return User_python;
	}
	public void setUser_python(String user_python) {
		User_python = user_python;
	}
	public String getUser_SQL() {
		return User_SQL;
	}
	public void setUser_SQL(String user_SQL) {
		User_SQL = user_SQL;
	}



}
