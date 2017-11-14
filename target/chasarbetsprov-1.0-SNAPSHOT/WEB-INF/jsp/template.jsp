<%-- 
    Document   : template
    Created on : Nov 9, 2017, 2:50:42 PM
    Author     : marcus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Minitwitter</title>
    </head>
    <body>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title><spring:message code="app.title.home" /></title>
        </head>
        <body>
            <jsp:include page="header.jsp" />
            <jsp:include page="${partial}" />
        </body>
    </html>
</body>
</html>
