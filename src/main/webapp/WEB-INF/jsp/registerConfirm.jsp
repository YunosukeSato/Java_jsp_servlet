<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ page import="model.User" %> 
<% User registerUser = (User) session.getAttribute("registerUser"); %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Sign Up</title>
  </head>
  <body>
    <p>Please confirm these information</p>
    <p>
      Log in id: <%= registerUser.getId() %><br/>
      Name: <%= registerUser.getName() %><br/>
    </p>
    <a href="/practice/RegisterUser">Back</a>
    <a href="/practice/RegisterUser?action=done">Confirm</a>
  </body>
</html>
