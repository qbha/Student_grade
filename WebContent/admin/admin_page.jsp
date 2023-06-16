<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理页面</title>
</head>

<body>
<table width=100% border="0">
<tr>
<td colspan="2" style=" background-image: linear-gradient(to right,lightyellow, red , lightyellow);height:130px;">
<h1 align="center">管理页面</h1>
</td>
</tr>

<tr>
 <td style="width:15%;vertical-align:top;height:600px;">
    <div style="border:2px solid #0099CC;height:40px;font-size:25px;background-color:lightyellow;"><b><a href="admin_page.jsp">菜单首页</a></b></div>
    <br>
     <br>
     <div style="border:2px solid #0099CC;height:40px;font-size:25px;background-color:lightyellow;"><b><a href="/Student_grade/admin/douserselect">查看所有信息</a></b></div>
     <br>
     <br>
      <div style="border:2px solid #0099CC;height:40px;font-size:25px;background-color:lightyellow;"><b><a href="/Student_grade/admin/doGradeselect">查看所有成绩</a></b></div>
     <br>
     <br>
     
      <div style="border:2px solid #0099CC;height:40px;font-size:25px;background-color:lightyellow;"><b><a href="admin_setgrade.jsp">设置成绩</a></b></div>
     <br>
     <br>
     <div style="border:2px solid #0099CC;height:40px;font-size:25px;background-color:lightyellow;"><b><a href="admin_adduser.jsp">添加学生账户</a></b></div>
      <br><br>
     <div style="border:2px solid #0099CC;height:40px;font-size:25px;background-color:lightyellow;"><b><a href="/Student_grade/loginchoose.jsp">退出</a></b></div>
     
     </td>
     
<td style="background-color:#eeeeee;height:600px;width:85%;vertical-align:top;font-size:30px;">
<div align="center">
姓名：赵海天<br>
班级：软件2003班<br>
学号：2007020328<br>
</div>

</td>


</tr>

<tr>
<td colspan="2" style="background-image: linear-gradient(to right, lightyellow,red , lightyellow);text-align:center;height:50px;">
@成绩管理系统</td>
</tr>
</table>
</body>
</html>