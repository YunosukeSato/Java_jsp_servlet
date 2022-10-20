<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Sign Up</title>
  </head>
  <body>
    <form action="/practice/RegisterUser" method="post">
      log in ID: <input type="text" name="id" /><br />
      Passward: <input type="password" name="pass" /><br />
      Name: <input type="text" name="name" /><br />
      <input type="submit" value="confirm" />
    </form>
  </body>
</html>
