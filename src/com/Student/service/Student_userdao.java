package com.Student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Student.dao.Basedao;
import com.Student.entity.Grade;
import com.Student.entity.Student_User;


public class Student_userdao {
	
	/*����*/
	public static int insert(Student_User u) {
		String sql="insert into Student_User values(?,?,?,?,?)";
		
		Object []params = {
				u.getUser_id(),
				u.getUser_name(),
				u.getUser_password(),
				u.getUser_sex(),
				u.getUser_phone()
		};
		 return Basedao.exectuIUD(sql, params);
		
	}
	
	
	/**
	 * ��ȡ�ܼ�¼������ҳ��
	 * */
	public static int[] totalpage(int count) {
		
		int arr[]= {0,1};
		
		
		ResultSet rs =null;		
		Connection conn =Basedao.getconn();		
		PreparedStatement ps =null;	
		
		
		try {
			String sql="select count(*) from Student_User";
			ps=conn.prepareStatement(sql);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				arr[0]=rs.getInt(1);
				if(arr[0]%count==0) {
				arr[1]=arr[0]/count;
				}else {
					arr[1]=arr[0]/count+1;
				}
				
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			Basedao.closeall(rs, ps, conn);
		}
					
		return arr;			
	}
	
	
	
	
	
		
	/*����ѧ����Ϣ*/	
	public static ArrayList<Student_User> selectAll(int cpage,int count){
		
		ArrayList<Student_User> list =new ArrayList<Student_User>();
		//���������
		ResultSet rs =null;		
		
		Connection conn =Basedao.getconn();		
		
		PreparedStatement ps =null;			
		try {
			
		String sql ="select * from Student_User order by User_phone asc limit ?,?";
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, (cpage-1)*count);
			ps.setInt(2, count);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Student_User u=new Student_User(
						rs.getString("User_id"),
						rs.getString("User_name"),
						rs.getString("User_password"),
						rs.getString("User_sex"),
						rs.getString("User_phone")
						);	
			
				list.add(u);
			}			
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			Basedao.closeall(rs, ps, conn);
		}
		return list;		
	}
	
	
	
	
	
	/**
	 * ��ȡ�ܼ�¼������ҳ��
	 * */
	public static int[] totalpage_grade(int count) {
		
		int arr[]= {0,1};
		
		
		ResultSet rs =null;		
		Connection conn =Basedao.getconn();		
		PreparedStatement ps =null;	
		
		
		try {
			String sql="select count(*) from Grade";
			ps=conn.prepareStatement(sql);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				arr[0]=rs.getInt(1);
				if(arr[0]%count==0) {
				arr[1]=arr[0]/count;
				}else {
					arr[1]=arr[0]/count+1;
				}
				
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			Basedao.closeall(rs, ps, conn);
		}
					
		return arr;			
	}
	
	
	
	
	
		
	/*����ѧ���ɼ���Ϣ*/	
	public static ArrayList<Grade> selectAllGrade(int cpage,int count){
		
		ArrayList<Grade> list =new ArrayList<Grade>();
		//���������
		ResultSet rs =null;		
		
		Connection conn =Basedao.getconn();		
		
		PreparedStatement ps =null;			
		try {
			
		String sql ="select * from Grade limit ?,?";
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, (cpage-1)*count);
			ps.setInt(2, count);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Grade u=new Grade(
						rs.getString("User_id"),
						rs.getString("User_name"),
						rs.getString("User_java"),
						rs.getString("User_C"),
						rs.getString("User_web"),
						rs.getString("User_python"),
						rs.getString("User_SQL")
						);	
			
				list.add(u);
			}			
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			Basedao.closeall(rs, ps, conn);
		}
		return list;		
	}		
	
	
	/*
	 * 
	 * */
public static int selectByName(String id) {
		
		int count =1;
		ResultSet rs =null;		
		Connection conn =Basedao.getconn();		
		PreparedStatement ps =null;	
		
		
		try {
			String sql="select count(*) from Student_User where User_id=?";
			ps=conn.prepareStatement(sql);	
			ps.setString(1,id);
			rs=ps.executeQuery();
			while(rs.next()) {
				count=rs.getInt(1);
							
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			Basedao.closeall(rs, ps, conn);
		}
					
		return count;			
	}

public static int selectBylogin(String id,String pwd) {
	int count=0;
	
			
	Connection conn =Basedao.getconn();		
	PreparedStatement ps =null;	
	ResultSet rs =null;
	
	try {
		String sql="select count(*) from Student_User where User_id=?and User_password=?";
		ps=conn.prepareStatement(sql);	
		ps.setString(1,id);
		ps.setString(2,pwd);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			count=rs.getInt(1);
						
		}
	} catch (SQLException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}finally {
		Basedao.closeall(rs, ps, conn);
	}
	
	return count;
	
}

/**
 * ͨ���˺������ѯ�û���Ϣ
 */
public static Student_User selectAdmin(String id,String pwd) {
	
	Student_User u=null;
	Connection conn =Basedao.getconn();		
	PreparedStatement ps =null;	
	ResultSet rs =null;

	
	try {
		String sql="select * from Student_User where User_id=? and User_password=?";
		ps=conn.prepareStatement(sql);		
		ps.setString(1,id);
		ps.setString(2,pwd);		
		rs=ps.executeQuery();		
		while(rs.next()) {
			 u=new Student_User(
					rs.getString("User_id"),
					rs.getString("User_name"),
					rs.getString("User_password"),
					rs.getString("User_sex"),
					rs.getString("User_phone")
					);
		}
	} catch (SQLException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}finally {
		Basedao.closeall(rs, ps, conn);
	}
	
	return u;
}


//���ҳɼ�
public static Grade selectgrade(String id) {
	
	Grade u1=null;
	Connection conn =Basedao.getconn();		
	PreparedStatement ps =null;	
	ResultSet rs =null;

	
	try {
		String sql="select * from grade where User_id=?";
		ps=conn.prepareStatement(sql);		
		ps.setString(1,id);				
		rs=ps.executeQuery();		
		while(rs.next()) {
			 u1=new Grade(
					    rs.getString("User_id"),
						rs.getString("User_name"),
						rs.getString("User_java"),
						rs.getString("User_C"),
						rs.getString("User_web"),
						rs.getString("User_python"),
						rs.getString("User_SQL")
					);
		}
	} catch (SQLException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}finally {
		Basedao.closeall(rs, ps, conn);
	}
	
	return u1;
}

}
