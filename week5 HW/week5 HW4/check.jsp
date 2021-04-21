•check.jsp

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 Connection con=null;//连接流
 PreparedStatement pstmt=null;
 ResultSet rs=null;//结果流
 try {
 
  //数据库驱动
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
  System.out.println("数据库驱动成功！");
  //创建连接
  String url="jdbc:sqlserver://localhost:1433;databaseName=用户注册库";//数据库配置信息
  String username="sa";//数据库登录账号
  String password="1234567";//数据库登录密码
  con=DriverManager.getConnection(url,username,password);
  if (con!=null) {
   System.out.println("已创建连接！");
  
   request.setCharacterEncoding("utf-8");
   String name=request.getParameter("uname");
   String pwd=request.getParameter("upwd");
   String sql="select count(*) from tb_user where username=? and password=?";
   pstmt=con.prepareStatement(sql);
   pstmt.setString(1, name);
   pstmt.setString(2, pwd);
   rs=pstmt.executeQuery();
   int count=-1;
   if(rs.next()){
    count=rs.getInt(1);
   }
   if(count>0){
    out.println("登陆成功！");
   }else{
    out.println("登陆失败！");
   }
  
  }else {
   System.out.println("数据库连接失败！");
  }
 } catch (ClassNotFoundException e) {
  // TODO 自动生成的 catch 块
  e.printStackTrace();
 } catch (SQLException e) {
  // TODO 自动生成的 catch 块
  e.printStackTrace();
 }finally{
  //打开顺序与关闭顺序相反
  if(rs!=null){
   rs.close();
  }
  if(pstmt!=null){
   pstmt.close();
  }
  if(con!=null){
   con.close();
  }
 }



%>
</body>
</html>
