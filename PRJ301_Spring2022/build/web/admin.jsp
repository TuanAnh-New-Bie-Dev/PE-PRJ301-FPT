<%-- 
    Document   : admin
    Created on : Apr 30, 2022, 8:53:38 PM
    Author     : tuan anh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <h1>---------- Hello ${sessionScope.account.fullName} ----------</h1>

        <div>
            <h2>Search Foods</h2>

            <form action="search" method="post">
                <input type="text" name="search" /> <input type="submit" value="Search" />
            </form>

        </div>

        <a href="${pageContext.request.contextPath}/logout">Logout</a>
    </body>
</html>
