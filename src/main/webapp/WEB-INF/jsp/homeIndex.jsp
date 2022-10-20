<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ page import="model.SiteEV" %> 
<% 
SiteEV siteEV = (SiteEV) application.getAttribute("siteEV"); 
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Welcome to Yuno's page</title>
  </head>
  <body>
    <h1>Welcome to Yuno's page</h1>
    <p>
      <a href="/practice/HomeIndex?action=like">like</a>:<%= siteEV.getLike() %>
      <a href="/practice/HomeIndex?action=dislike">dislike</a>:<%= siteEV.getDislike() %>
    </p>

    <h2>Is he good guy?</h2>
    <p>...</p>
  </body>
</html>
