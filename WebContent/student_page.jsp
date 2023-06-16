<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生页面</title>
</head>
<body>

<table width=100% border="0" >

<tr>
<td colspan="3" style="background-image: linear-gradient(to right, WhiteSmoke  , LawnGreen);height:130px;">
<h1 align="center">学生页面</h1>
</td>
</tr>

<tr>
<td style="width:33%;vertical-align:top;height:600px">
<table border="1" style="font-size:30px">
   <tr> 
   <tr>
   <th colspan="5">个人资料</th>
   </tr>
   <tr>
   <th>账号</th><td>${userid.user_id}</td>
   </tr>
   
   <tr>
   <th>姓名</th> <td>${userid.user_name}</td>
   </tr>
   
   <tr>
   <th>密码</th><td>${userid.user_password}</td>
   </tr>
   
   <tr>
   <th>性别</th><td>${userid.user_sex=='xy'?'男':'女'}</td>
   </tr>
   
   <tr>
   <th>手机</th><td>${userid.user_phone }</td>
   </tr>
   
 </table>
</td>
<td style="background-color:#eeeeee;height:600px;width:33%;vertical-align:top;">
<table border="1" style="font-size:30px">
<tr>
   <tr><th colspan="5">成绩信息</th></tr>
   <tr><th>姓名</th> <td>${usergrade.user_name}</td></tr>
   <tr><th>java</th> <td>${usergrade.user_java}</td></tr>
   <tr><th>C语言</th> <td>${usergrade.user_C}</td></tr>
   <tr><th>web</th> <td>${usergrade.user_web }</td></tr>
   <tr><th>python</th> <td>${usergrade.user_python }</td></tr>
   <tr><th>SQL</th> <td>${usergrade.user_SQL }</td></tr>
   <tr><th>总分</th> <td>${usergrade.user_java + usergrade.user_C + usergrade.user_web + usergrade.user_python + usergrade.user_SQL}</td></tr>
  </tr>
   
   
</table>
</td>

<td style="width:33%;vertical-align:top;height:600px">
<c:if test="${isLogin ==1}">
<b>你好！</b><span id="login"><b>${userid.user_name}<b></span>  <a href="loginout">注销</a>
</c:if>
<img src="/Student_grade/imge/duck.gif" alt="duck" width="100%";height="100%" >
</td>
</tr>

<tr>
<td colspan="3" style="background-image: linear-gradient(to right, WhiteSmoke  , LawnGreen);text-align:center;height:50px">
@成绩管理系统</td>
</tr>
</table>
</body>
</html>