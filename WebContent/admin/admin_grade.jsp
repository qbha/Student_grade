<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查看成绩</title>
</head>

<body>
<table width=100% border="0">
<tr>
<td colspan="2" style="background-image: linear-gradient(to left,Ivory, orange, yellow, LavenderBlush , lightblue, Lavender , Khaki);height:130px;">
<h1 align="center">查看全部成绩</h1>
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
     
<td style="background-color:#eeeeee;height:600px;width:85%;vertical-align:top; font-size:30px;">

信息显示在这里

 <table border="1">
   <tr>
   <th>账号</th>
   <th>姓名</th>
   <th>java</th>
   <th>C语言</th>
   <th>web</th>
   <th>python</th>
   <th>SQL</th>
   <th>总分</th>
   </tr>

   <c:forEach var="u" items="${userlist}">   
   <tr>
   <td>${u.user_id}</td>
   <td>${u.user_name}</td>
   <td>${u.user_java}</td>
   <td>${u.user_C}</td>
   <td>${u.user_web }</td>
   <td>${u.user_python }</td>
   <td>${u.user_SQL }</td>
   <td>${u.user_java+u.user_C+u.user_web+u.user_python+u.user_SQL}</td>
   </tr>
   </c:forEach>
 </table>

<div>
   共${tsum} 条记录，当前${cpage}/${tpage} 页
   <br>
   <a href="doGradeselect?cp=1">首页</a>
   <a href="doGradeselect?cp=${cpage-1 <1?1:cpage-1}">上一页</a>
   <a href="doGradeselect?cp=${cpage+1>tpage?tpage:cpage+1}">下一页</a>
   <a href="doGradeselect?cp=${tpage}">尾页</a>
</div>

</tr>

<tr>
<td colspan="2" style="background-image: linear-gradient(to left,Ivory, orange, yellow, LavenderBlush , lightblue, Lavender , Khaki);text-align:center;height:50px;">
@成绩管理系统</td>
</tr>
</table>
</body>
</html>