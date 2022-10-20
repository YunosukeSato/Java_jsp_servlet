<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" import="java.util.Date, java.text.SimpleDateFormat"%> <% //
Choose the fortune randamly String [] luckArray = { "Perfect", "good", "bad" };
int index = (int) (Math.random() * 3); String luck = luckArray[index]; // Get
the date Date date = new Date(); SimpleDateFormat sdf = new
SimpleDateFormat("MM/dd"); String today = sdf.format(date); %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Fortune Telling</title>
  </head>
  <body>
    <p>Your luck of <%= today %> is <%= luck %>.</p>
  </body>
</html>
