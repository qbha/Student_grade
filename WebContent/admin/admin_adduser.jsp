<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理页面</title>
<style type="text/css">
.fn{
height:25px;
}
</style>
</head>

<body>
<table width=100% border="0">
<tr>
<td colspan="2" style="background-image: linear-gradient(#e66465, #9198e5);height:130px;">
<h1 align="center">添加学生账户</h1>
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
     <br>
     
     <br>
     <div style="border:2px solid #0099CC;height:40px;font-size:25px;background-color:lightyellow;"><b><a href="/Student_grade/loginchoose.jsp">退出</a></b></div>
  
     </td>
     
<td style="background-color:#eeeeee;height:600px;width:85%;vertical-align:top;">
<h1 style="font-size:30px">学生账户在这里添加</h1>
<form action="/Student_grade/admin/adminadduser"  method="post" >
<div style="font-size:20px">
<br>
<p align="">
<b style="font-size:25px;">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:</b>
<input type="text" name="username" size="30" value="" placeholder="请输入名字"  class="fn" />
</p>
<p>
<b style="font-size:25px;">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</b>
<input type="radio" value="xy" name="sex" checked="checked"/>男
<input type="radio" value="xx" name="sex" />女
</p>

<p>
<b style="font-size:25px;">账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:</b>
<input type="text" name="userid" size="30"  value=""  placeholder="请输入账号"class="fn" />
</p>
<p>
<b style="font-size:25px;">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</b>
<input type="password" name="password" size="30" value=""  placeholder="请输入密码"class="fn" />
</p>
<p>
<b style="font-size:25px;">确认密码:</b>
<input type="password" name="repassword" size="30" value=""  placeholder="请确认密码"class="fn" />
</p>

<p>
<b style="font-size:25px;">电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话:</b>
<input type="text" name="phone" size="30" value=""  placeholder="请输入电话"class="fn" />
</p>

<input type="submit" value="提交"/style="font-size:25px;">
<input type="reset" value="重置"/style="font-size:25px;">
</div>
</form>

</td>
</tr>

<tr>
<td colspan="2" style="background-image: linear-gradient(#e66465, #9198e5);text-align:center;height:50px;">
@成绩管理系统</td>
</tr>
</table>
</body>
</html>