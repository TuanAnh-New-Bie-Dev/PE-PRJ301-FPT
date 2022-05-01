<%-- 
    Document   : add
    Created on : May 1, 2022, 8:40:10 PM
    Author     : tuan anh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Page</title>
    </head>
    <body>
        <h1>---------- Add ----------</h1>

        <form action="add" method="post">
            <table>
                <tbody>
                    <tr>
                        <td>Paper ID:</td>
                        <td><input type="text" name="pid" /></td>
                    </tr>
                    <tr>
                        <td>Title:</td>
                        <td><input type="text" name="title" /></td>
                    </tr>
                    <tr>
                        <td>Date:</td>
                        <td><input type="text" name="date" /> (yyyy-MM-dd)</td>
                    </tr>
                    <c:forEach items="${listA}" var="listA">
                        <tr>
                            <td></td>
                            <td>
                                <input name="author" value="${listA.authorid}" type="checkbox" />${listA.authorname}
                            </td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="Save" />
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>

    </body>
</html>
