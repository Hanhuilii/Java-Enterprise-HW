•index.jsp

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<style>
.box{
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
    width: 400px;
    padding: 40px;
    background: rgba(0,0,0,0.8);
    box-sizing: border-box;
    box-shadow: 0 15px 25px rgba(0,0,0,.5);
    border-radius: 10px;
}
.box h2{
    margin: 0 0 30px;
    padding: 0;
    color: #ffffff;
    text-align: center;
}
.box .inputBox{
    position: relative;
}
.box .inputBox input{
    width: 100%;
    padding: 10px 0;
    font-size: 16px;
    color: #ffffff;
    letter-spacing: 1px;
    margin-bottom: 30px;
    border: none;
    border-bottom: 1px solid #ffffff;
    outline: none;
    background: transparent;
}
.box .inputBox label{
    position: absolute;
    top: 0;
    left: 0;
    letter-spacing: 1px;
    padding: 10px 0;
    font-size: 16px;
    color: #ffffff;
    pointer-events:none;
    transition: 1s;

.box .inputBox input:focus~label,
.box .inputBox input:valid~label
{
    top:-18px;
    left: 0;
    color: #03a9f4;
    font-size: 12px;
}
.box input[type="submit"]{
   background: transparent;
    border: none;
    outline: none;
    color: #ffffff;
    background: #03a9f4;
    margin: 0px 80px;
    padding: 10px 30px;
    cursor: pointer;/*鼠标指针变成手的形状*/
    border-radius: 15px;/*调节矩形弧度*/
}
</style>
</head>
<body>

<div class="box">
        <h2>Login</h2>
        <!--创建供用户输入的 HTML 表单-->
        <form action="check.jsp" method="post">
            <div class="inputBox">
                <input type="text" name="uname" required="">
                <label>Username</label>
            </div>
            <div class="inputBox">
                <input type="password" name="upwd" required="">
                <label>Password</label>
            </div>
            <div align="center">
                <input type="submit" name="" value="提交">
            </div>

        </form>
    </div>

</body>
</html>
