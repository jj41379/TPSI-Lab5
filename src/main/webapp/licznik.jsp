<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 5</title>
    </head>
     <style>
        table {border: 1px solid black;}
        td {border: 1px solid black;}
    </style>
    <body>
        <p>Liczba odwiedzeń strony:${sessionScope.licznik}<p>
            
         <table>
            <tr>
                <th>Imię</th>
                <th>Nazwisko</th>
                <th>Email</th>
            </tr>
        <c:forEach items="${sessionScope.listaStudentow}" var="osoba">
            <tr>
                <td>${osoba.firstName}</td>
                <td>${osoba.lastName}</td>
                <td>${osoba.email}</td>
            </tr>
        </c:forEach>
    </table>
        <form action='/lab4/licznik' method='post'>
        Wpisz swoje imię:
        <input type='text' name='imie'>
        <br/>Wpisz swoje nazwisko:
        <input type='text' name='nazwisko'></br>
        <br/>Wpisz swój adres email:
        <input type='text' name='email'></br>
        <br/><input type='submit'></br>
</form>
    </body>
</html>