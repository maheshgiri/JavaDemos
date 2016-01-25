<%-- 
    Document   : index
    Created on : Jan 25, 2016, 10:33:11 PM
    Author     : Hungry
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%response.setIntHeader("Refresh",5);
Date date=new Date();
out.println(""+date.toString());       
%>
        
        <%out.print(request.getAuthType());%>
        
    </body>
</html>
