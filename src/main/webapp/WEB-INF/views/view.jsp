<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <title>${announcement.title} | BuyAndSell</title>
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
                        <a href="#" class="btn btn-lg btn-secondary">Buy</a>
                </div>
            </div>
        </div>
        <div class="album py-5 bg-light">
            <div class="container">
                <div class="row">
                    <c:forEach var="announcements" items="${announcements}">
                        <div class="col-md-4">
                            <div class="card mb-4 shadow-sm">
                                <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"></rect><text x="50%" y="50%" fill="#eceeef" dy=".3em">Photo</text></svg>
                                <div class="card-body">
                                    <p class="card-text">${announcements.title}</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <a href="/view/${announcements.id}">
                                                <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                            </a>
                                            <a href="/edit/${announcements.id}">
                                                <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                            </a>
                                            <form:form action="/delete/${announcements.id}" method="post">
                                                <button  class="btn btn-sm btn-outline-secondary">Delete</button>
                                            </form:form>
                                        </div>
                                        <small class="text-muted">${announcements.date}</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</body>
</html>