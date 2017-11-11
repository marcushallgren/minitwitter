<%-- 
    Document   : homepage
    Created on : Nov 9, 2017, 12:18:30 PM
    Author     : marcus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Minitwitter</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">${name_loggedin}</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="listTweets">Tweets</a></li>
                    <li class="active"><a href="listUsers">Users</a></li>
                    <li class="active"><a href="statusUpdate">Status update</a></li>
                </ul>
                <a class="btn btn-danger navbar-btn" href="logout" role="button">Logout</a>
            </div>
        </nav>
        <div class="container">

    </body>
</html>
