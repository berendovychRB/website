<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <title>Selling | BuyAndSell</title>
</head>
<body>
<%@include file="blocks/header.jsp" %>
    <div class="jumbotron">
        <div class="jumbotron p-4 p-md-5 text-white rounded bg-dark">
            <form:form action="/selling" method="post">
                <input name="title" class="form-control text-white bg-dark" placeholder="Enter title"  cols="30" rows="10">
                <br>
                <textarea name="description" class="form-control text-white bg-dark" cols="30" rows="10" placeholder="Enter description"></textarea>
                <br>
                <button class="btn btn-outline-success my-2 my-sm-0">
                    <p>Sell</p>
                </button>
            </form:form>
        </div>
    </div>

</body>
</html>