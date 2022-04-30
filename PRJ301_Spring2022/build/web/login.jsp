<%-- 
    Document   : login
    Created on : Apr 30, 2022, 5:14:21 PM
    Author     : tuan anh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>

    </head>
    <body>

        <h1>---------- Login Here ----------</h1>

        <h2 style="color: red;">${alertMsg}</h2>
        <h2 style="color: green;">${alert}</h2>
        
        <form action="login" method="post">

            <table>
                <tbody>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="us" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="pass" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                    </tr>
                </tbody>
            </table>

        </form>

    </body>
</html>
