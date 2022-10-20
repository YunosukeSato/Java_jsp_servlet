<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>User Register</title>
  </head>
  <body>
    <form action="/practice/FormSampleServlet" action="post">
        Name:<br>
        <input type="text" name="name"><br>
        Gender:<br>
        Man <input type="radio" name="gender" value="0">
        Woman <input type="radio" name="gender" value="1">
        <input type="submit" value="register">    
    </form>
  </body>
</html>
