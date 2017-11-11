<%-- 
    Document   : listTweets
    Created on : Nov 9, 2017, 8:17:27 PM
    Author     : marcus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
    prefix="c" %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:include page="header.jsp" />
    <body>
        <c:forEach var = "i" begin = "0" end = "${size}">
            <p><c:out value = "${listTweet[i].getTweet()}"/></p>
        </c:forEach>
    </body>
</html>
