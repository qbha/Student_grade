<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理页面</title>
<script src="js/jquery-1.12.4.min.js"></script>
<script src="js/function.js"></script>
<style type="text/css">
.fn{
height:25px;
}
</style>
</head>

<body>
<table width=100% border="0">
<tr>
<td colspan="2" style="background-image: linear-gradient(to right, Ivory, orange, yellow, LavenderBlush , lightblue, Lavender , Khaki);height:130px;">
<h1 align="center">设置成绩</h1>
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
<td style="background-color:#eeeeee;height:600px;width:85%;vertical-align:top;">
<h1 style="font-size:30px">成绩在这里设置</h1>

<form action="/Student_grade/admin/setgrade" method="post"  onsubmit="return grade(this)">
 <table border="1" style="font-size:25px;">
 <tr>
 <td>学号</td>
 <td><input type="text" name="userid"   size="30"  class="fn"/></td>
 </tr>
 
 <tr>
  <td>姓名</td>
 <td><input type="text" name="username" size="30"  class="fn"/></td>
 </tr>
 
 <tr>
  <td>java</td>
 <td><input type="text" name="userjava" size="30"  class="fn"/></td>
  </tr>
  
 <tr>
 <td>C语言</td>
 <td><input type="text" name="userc" size="30"  class="fn"/></td>
  </tr>
  
 <tr>
 <td>web</td>
 <td><input type="text" name="userweb" size="30"  class="fn"/></td>
  </tr>
  
 <tr>
 <td>python</td>
 <td><input type="text" name="userpython"size="30"  class="fn"/></td>
  </tr>
  
 <tr>
 <td>SQL</td>
 <td><input type="text" name="usersql"size="30"  class="fn"/></td>
 </tr>
 </table>
<input type="submit" value="确定" style="font-size:25px;"/>
<input type="reset" value="重置" style="font-size:25px;"/>

</form>
</tr>

<tr>
<td colspan="2" style="background-image: linear-gradient(to right, Ivory, orange, yellow, LavenderBlush , lightblue, Lavender , Khaki);text-align:center;height:50px;">
@成绩管理系统</td>
</tr>
</table>
</body>
</html>