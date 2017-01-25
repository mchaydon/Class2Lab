<%-- 
    Document   : PageGenerator2
    Created on : Jan 25, 2017, 12:41:05 PM
    Author     : mhaydon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <%
                for (int i = 0; i < 3; i++){
            %>
            <tr>
                <%
                for (int col = 0; col < 3; col++){
                %>
                    <td>xxx</td>
                <%
                }
                %>
                </tr>
            <%
            }
            %>
        </table>
    </body>
</html>
