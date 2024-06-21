<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="kr">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="format-detection" content="telephone=no">
  <title>blog</title>
  <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/js/default.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/default.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/index.css"/>
  <link rel="stylesheet" media="( min-width:701px) and (max-width:1000px)" href="${pageContext.request.contextPath}/resources/css/tablet.css">
  <link rel="stylesheet" media="( min-width:0px) and (max-width:700px)" href="${pageContext.request.contextPath}/resources/css/mobile.css">

<%--  <link rel="stylesheet" href="<c:url value='/css/test.css'/>">--%>
  <jsp:include page="top.jsp"/>
</head>
<style>
.warp{width:1200px; height:1300px; background: red;}
main{border: 3px solid black;}
</style>
<body>
<main>
    <div class="warp">
<%--      <div class="inner">--%>
<%--        <header></header>--%>
<%--        <div class="content">--%>
<%--            <aside class="side"></aside>--%>
<%--            <article class="con"></article>--%>
<%--        </div>--%>
<%--        <footer></footer>--%>
<%--      </div>--%>
    </div>
</main>
</body>
</html>