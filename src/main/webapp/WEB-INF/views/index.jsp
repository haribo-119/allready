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
  <style>
      .container{
      /*width: 100vw;*/
      /*height: 100vh;*/
    }
      .imgBox{
          /*width: 100%;*/
          /*height: 100%;*/
        display: grid;
        grid-template-columns: repeat(3,1fr);
        grid-template-rows:150px repeat(2,10%) 150px;
        grid-gap: 1rem;
        grid-template-areas:
      'a a a'
      'b c c'
      'b d g'
      'e f g';
      }
    .image{
      width: 100%;
      height: 100%;
      object-fit: cover;
    }
    .image1{ grid-area: a;}
      .image2{grid-area: b;}
      .image3{grid-area: c;}
      .image4{grid-area: d;}
      .image5{grid-area: e;}
      .image6{grid-area: f;}
      .image7{grid-area: g;}
  </style>
</head>
<body>
  <main class="container">
    <div class="imgBox">
    <img src="${pageContext.request.contextPath}/resources/images/mainPageImg/01.jpg" class="image image1">
    <img src="${pageContext.request.contextPath}/resources/images/mainPageImg/02.jpg" class="image image2">
    <img src="${pageContext.request.contextPath}/resources/images/mainPageImg/03.jpg" class="image image3">
    <img src="${pageContext.request.contextPath}/resources/images/mainPageImg/04.jpg" class="image image4">
    <img src="${pageContext.request.contextPath}/resources/images/mainPageImg/05.jpg" class="image image5">
    <img src="${pageContext.request.contextPath}/resources/images/mainPageImg/06.jpg" class="image image6">
    <img src="${pageContext.request.contextPath}/resources/images/mainPageImg/07.jpg" class="image image7">
    </div>
  </main>


  <div class="dim"></div>
</body>
</html>