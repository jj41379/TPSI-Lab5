<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista osób</title>
    </head>
    <style>
        table {border: 1px solid black;}
        td {border: 1px solid black;}
    </style>
    <body>
         <table>
            <tr>
                <th>Imię</th>
                <th>Nazwisko</th>
                <th>Email</th>
            </tr>
        <c:forEach items="${listaOsob}" var="osoba">
            <tr>
                <td>${osoba.firstName}</td>
                <td>${osoba.lastName}</td>
                <td>${osoba.email}</td>
            </tr>
        </c:forEach>
    </table>
    </body>
</html>
