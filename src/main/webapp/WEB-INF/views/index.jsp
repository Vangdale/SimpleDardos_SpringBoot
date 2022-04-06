<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
    </head>
    <body>
        <form:form action="PlayerList" method="post" modelAttribute="player">
            <label for="name">Introduce tu nombre:</label><br><br>
            <input path="Name "type="text" id="Name" name="Name"><br><br>

            <input type="submit" value="Añadir Jugador">

        </form:form>
    </body>
</html>