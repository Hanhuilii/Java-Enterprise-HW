(2)Skip the Page：cookieUser.jsp

<%@ page pageEncoding=“UTF-8”%>

Insert title here
//从浏览器获取cookie

Cookie[] cookies = request.getCookies();

String uname = null;

if(null != cookies){

for(Cookie cookie:cookies){

//遍历本地浏览器中的所有cookie

if(cookie.getName().equals("cook_name")){

//把cookie中的用户名取出

uname = cookie.getValue();

}

//out.print("

name: " + cookie.getName()+"

");
//out.print("

value: " + cookie.getValue()+"

");
}

}

//判断cookie有没有失效

if(null != uname){ 

out.print("用户名："+uname +" "); 

}

else{

response.sendRedirect("login.jsp");

}

