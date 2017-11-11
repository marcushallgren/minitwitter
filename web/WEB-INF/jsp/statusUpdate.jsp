<%-- 
    Document   : statusUpdate
    Created on : Nov 10, 2017, 12:56:22 PM
    Author     : marcus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:include page="header.jsp" />
    <body>
        <form method="POST" action="/chas-arbetsprov-marcushallgren/tweet" modelAttribute="tweetData">
            <label for="tweet">Tweet here!</label>
            <div class="form-group">
                <textarea id="tweet" name="tweet" rows="4" cols="50">
                </textarea>
            </div>
            <button type="submit" class="btn btn-default">Submit tweet</button>
        </form>

    </body>
</html>
