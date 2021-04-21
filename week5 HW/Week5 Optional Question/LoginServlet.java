(3)Servlet文件：LoginServlet类

package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

/**

* Servlet implementation class LoginServlet

*/

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {

private static final long serialVersionUID = 1L;

/**

* @see HttpServlet#HttpServlet()

*/

public LoginServlet() {

super();

// TODO Auto-generated constructor stub

}

/**

* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

*/

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// TODO Auto-generated method stub

//获取用户登录名

String username = request.getParameter("username");

//获取7天内是否免登录

String day7 = request.getParameter("chkCookie");

int cookie_day = 1;

if(null != day7 && day7.equals("")){

cookie_day = Integer.valueOf(day7);

}

//创建cookie

Cookie cookie = new Cookie("cook_name",username);

//设置Cookie有限期

//cookie.setMaxAge(6);//有效期6秒

cookie.setMaxAge(3600 * 24 * cookie_day);//设置7天免登录

//写入cookie到浏览器

response.addCookie(cookie);

response.sendRedirect("cookieUser.jsp");

}

/**

* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

*/

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// TODO Auto-generated method stub

doGet(request, response);

}

}
