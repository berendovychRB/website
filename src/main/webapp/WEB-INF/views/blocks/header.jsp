<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div class="navbar navbar-dark bg-dark shadow-sm">
    <div class="container d-flex justify-content-between">
        <a href="/" class="navbar-brand d-flex align-items-center">
            <strong>BuyAndSell</strong>
        </a>
        <form class="form-inline mt-2 mt-md-0">
            <form:form action="/search" method="post">
                <input class="form-control mr-sm-2" name="text" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form:form>
            <a href="/selling">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Sell</button>
            </a>
        </form>
    </div>
</div>