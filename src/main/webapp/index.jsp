<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web Chat</title>
</head>
<body>

  <div style="width:100%; border:1px solid #000; height:200px; text-align:center;">
  <h1>Register User</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="width: 80%">
    <tr>
     <td>UserName</td>
     <td><input type="text" name="usern" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="pas" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
  <%

      String mesg = (String) request.getAttribute("message");
      if(mesg!=null){
            if (mesg=="Successfully registered") {
                out.println("<p style='color: green;'>" + mesg + "</p>");
            }
            if(mesg=="Failed to register"){
                 out.println("<p style='color: red;'>" + mesg + "</p>");

            }
          }
  %>
  <%

  %>
 </div>

 <div style="width:100%; border:1px solid #000; height:200px; text-align:center;">
   <h1>Send message</h1>
   <form action="<%= request.getContextPath() %>/message" method="post">
    <table style="width: 80%">
     <tr>
      <td>sending to: </td>
      <td><input type="text" name="usernam" /></td>
     </tr>
     <tr>
      <td>message: </td>
      <td><input type="text" name="message" /></td>
     </tr>
    </table>
    <input type="submit" value="send" />
   </form>
  </div>

  <div style="width:100%; border:1px solid #000; text-align:center;">
    <h1>Inbox</h1>
    <form action="<%= request.getContextPath() %>/message" method="get">
     <table style="width: 80%">
      <tr>
       <td>UserName</td>
       <td><input type="text" name="username" /></td>
      </tr>
      <tr>
       <td>Password</td>
       <td><input type="password" name="password" /></td>
      </tr>
     </table>
     <input type="submit" value="log-in" />
    </form>
    <c:if test="${not empty messages}">
         <% if (request.getAttribute("messages") != null) { %>
                    <h2>Received:</h2>
                    <ul>
                        <% for (String message : (ArrayList<String>) request.getAttribute("messages")) { %>
                            <li><%= message %></li>
                        <% } %>
                    </ul>
          <% } %>
    </c:if>
   </div>

</body>
</html>