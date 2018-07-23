
<%@page import="ru.javawebinar.topjava.util.TimeUtil"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Meals</title>
    <style>
        .normal{color:green;}
        .exceeded{color:red;}
    </style>
</head>
<body>
<section>
    <h2><a href="index.html">Home</a></h2>
    <h3>Meals</h3>
    <hr>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>Date</th>
            <th>Description</th>
            <th>Calories</th>
        </tr>
        </thead>
        <c:forEach items="${mealList}" var = "meal">
            <jsp:useBean id="meal" scope="page" type="ru.javawebinar.topjava.model.MealWithExceed" />
            <tr class="${meal.exceed ? 'exceeded' : 'normal'}">
                <td>
                    <%=TimeUtil.toString(meal.getDateTime()) %>
                </td>
                <td>${meal.description}</td>
                <td>${meal.calories}</td>
            </tr>

        </c:forEach>
    </table>
</section>

</body>
</html>
