<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ page import="model.Health" %> 
<% // Get the Health instance from the request scope 
Health health = (Health) request.getAttribute("health"); %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Health Check</title>
  </head>
  <body>
    <h1>Health Check</h1>
    <p>
      Height: <%= health.getHeight() %><br />
      Weight: <%= health.getWeight() %><br />
      BMI: <%= health.getBmi() %><br />
      Body Type: <%= health.getBodyType() %>
    </p>
    <a href="/practice/HealthCheck">Back</a>
  </body>
</html>
