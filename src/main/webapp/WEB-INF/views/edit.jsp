<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <title>Edit | BuyAndSell</title>
</head>
<body>
<%@include file="blocks/header.jsp" %>
<div class="jumbotron">
    <div class="jumbotron p-4 p-md-5 text-white rounded bg-dark">
        <div class="col-md-6 px-0">
            <div class="container">
                <div class="row">
                    <div class="col-sm">
                        <h1 class="display-4 font-italic">${announcement.title}</h1>
                        <p class="lead my-3">${announcement.description}</p>
                        <small class="text-muted my-2 my-md-0">${announcement.date}</small>
                    </div>
                    <div class="col-sm">
                        <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"></rect><text x="50%" y="50%" fill="#eceeef" dy=".3em">Photo</text></svg>
                    </div>
                    <br>
                    <br>
                </div>
            </div>
        </div>
    </div>
    <div class="jumbotron p-4 p-md-5 text-white rounded bg-dark">
        <form:form action="/edit/${announcement.id}" method="post">
            <input name="title" class="form-control text-white bg-dark" placeholder="Enter new title"  cols="30" rows="10">
            <br>
            <textarea name="description" class="form-control text-white bg-dark" cols="30" rows="10" placeholder="Enter new description"></textarea>
            <br>
            <button class="btn btn-lg btn-secondary">
                <p>Edit</p>
            </button>
        </form:form>
    </div>
</div>


</body>
</html>