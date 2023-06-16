<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生登录页面</title>
<style>
.fn{
height:25px;
}

</style>
</head>
<body>
<form action="login" method="post">
<div style="opacity:0.5;position:absolute;width:100%;height:29%;font-size:150px;"align="center">
<marquee direction="left" behavior="scroll"  scrollamount="50px" ><b>欢 迎 登 陆</b></marquee>
</div>

<img src="/Student_grade/imge/gg.jpg" alt="gg" width="100%";height="100%" >


<div style="font-family:verdana;padding:10px;border-radius:10px;width:330px;border:5px solid #4169E1;position:absolute;top:30%;left:40%;background-color:rgb(255,255,255,0.3)">
<h1 align="center" style="font-size:40px;">学生登录端口</h1>
<b style="font-size:25px;">账号：</b><input type="text" name="userid" placeholder="请输入账号" size="25" class="fn"/><br><br>
<b style="font-size:25px;">密码：</b><input type="password" name="password"  placeholder="请输入密码" size="25" class="fn"/><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="登录" style="font-size:18px;"/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置" style="font-size:18px;"/>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="loginchoose.jsp">返回登录首页</a><br>
</div>

</form>
</body>
</html>