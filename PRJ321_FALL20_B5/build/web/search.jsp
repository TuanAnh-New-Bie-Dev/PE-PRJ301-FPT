<%-- 
    Document   : search
    Created on : May 1, 2022, 7:35:15 PM
    Author     : tuan anh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>
        <h1>---------- Search ----------</h1>

        <form action="search" method="POST">
            <table>
                <tbody>
                    <tr>
                        <td>Authors:</td>
                        <td>
                            <select name="author">
                                <c:forEach items="${listA}" var="listA">
                                    <option ${author==listA.authorid?"selected":""} value="${listA.authorid}">${listA.authorname}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td><input type="submit" value="Search" /></td>
                    </tr>
                </tbody>
            </table>
        </form>

        <c:if test="${listP != null}">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Paper ID</td>
                        <td>Title</td>
                        <td>Published Date</td>
                    </tr>
                    <c:forEach items="${listP}" var="listP">
                        <tr>
                            <td>${listP.paperid}</td>
                            <td>${listP.title}</td>
                            <td>${listP.publisheddate}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </c:if>

    </body>
</html>
