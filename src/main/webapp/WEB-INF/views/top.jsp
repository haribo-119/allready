<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<div class="header">
  <header>
    <div class="left">
      <h1><a href="<c:url value="/"/>">Hdac</a></h1>
      <a href="#a" class="all">all Menu</a>
      <div class="nav">
        <h2>Menu</h2>
        <nav>
          <ul>
            <li><a href="#a">Company</a></li>
            <li><a href="<c:url value="/language"/>">Language</a></li>
            <li><a href="#a">Network</a></li>
            <li><a href="#a">News</a></li>
            <li><a href="#a">Resources</a></li>
          </ul>
        </nav>
        <div>
          <a href="">White Peper</a>
          <a href="">FAQ</a>
        </div>
        <a href="" class="close">Close</a>
      </div>
    </div>
    <ul>
      <li><a href="#a">White Peper</a></li>
      <li><a href="#a">FAQ</a></li>
      <li class="join"><a href="<c:url value="/login/login.do"/>">Sign In</a></li>
    </ul>
  </header>
</div>