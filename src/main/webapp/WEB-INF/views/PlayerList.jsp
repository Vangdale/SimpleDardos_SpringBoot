<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
    </head>
    <body>

        <form:form action="Round" method="post">
            <input type="submit" value="Throw darts">
        </form:form>

        <table style="width:100%">
            <thead>
                <tr>
                    <c:forEach var="player" items="${ListaJugadores}">
                        <th>${player.getName()}</th>
                    </c:forEach>
                </tr>
            </thead>
        </table>
    </body>
</html>