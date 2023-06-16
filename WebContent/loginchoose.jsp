<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录选择页面</title>
</head>

<style>
body{
background:	url('/Student_grade/imge/qiang.jpg');
}
</style>

<body>

<div style="font-family:verdana;padding:40px;border-radius:80px;border:15px solid #EE872A;">

<h1 style="font-size:100px;">成    绩   查    询   系   统</h1>

<div style="color:#40B3DF;">
<span style="background-color:#B4009E;color:#ffffff;font-size:25px;">欢迎登录</span>
</div>

<div style="font-family:verdana;padding:30px;border-radius:15px;width:250px;border:5px solid #FF0000;">
<div style="color:#000000;font-size:35px">请选择登录类型</div><br>

<span style="background-color:#ADFF2F;color:#ffffff;font-size:30px;" ><a href ="student_login.jsp">学生登录</a></span>
<span style="background-color:#ADFF2F;color:#ffffff;font-size:30px;"><a href ="/Student_grade/admin/admin_login.jsp">管理登录</a></span>
</div>

<b style="font-size:20px">还没有账号？</b><div style="color:#000000;font-size:18px"><a href ="Student_register.jsp">点击注册账号</a></div>
</div>


</body>
</html>