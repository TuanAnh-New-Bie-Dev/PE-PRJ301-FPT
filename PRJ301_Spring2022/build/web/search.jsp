<%-- 
    Document   : search
    Created on : Apr 30, 2022, 9:24:57 PM
    Author     : tuan anh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Food Page</title>

        <style type='text/css'>
            #table {
                counter-reset: rowNumber;
            }
            #table .tr {
                counter-increment: rowNumber;
            }

            #table .tr .td:first-child::before {
                content: counter(rowNumber);
            }
        </style>

    </head>
    <body>
        <h1>--------- Foods ---------</h1>

        <div>
            <h2>Search Foods</h2>

            <form action="search" method="post">
                <input type="text" name="search" /> <input type="submit" value="Search" />
            </form>
        </div>
        <h3 style="color: green;">${alert}</h3>
        <h3 style="color: red;">${alertMsg}</h3>

        <c:if test="${listF!=null}">
            <table id="table" border="1">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Cooking Time</th>
                        <th>Description</th>
                        <th>Status</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>

                    <c:forEach items="${listF}" var="listF" >
                        <tr class="tr">
                            <td class="td"></td>
                            <td class="td">${listF.id}</td>
                            <td class="td">${listF.name}</td>
                            <td class="td">$${listF.price}</td>
                            <td class="td">${listF.cookingTime} phút</td>
                            <td class="td">${listF.description}</td>
                            <td class="td">${listF.status?"avaiable":""}</td>
                            <td class="td"><a href="${pageContext.request.contextPath}/delete?fid=${listF.id}" >Delete</a></td>
                        </tr>
                    </c:forEach>

                </tbody>
            </table>
        </c:if>

    </body>
</html>
