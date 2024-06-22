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
  *{ padding:0; box-sizing: border-box;}
  main{border: 3px solid black; height:100vh;}
.inner{width:100%; height:100%; background: burlywood;}
  .clearfix::after{content: ''; display: block; clear:both;}
.side{width: 20%; height:100%; background: #0091d0; float:left; border: 1px solid black;}
.content{width:80%; height:100%; background: aquamarine; float:left; }
button{display: flex; justify-content: flex-end ;}

</style>
<body>

<main>
      <div class="inner clearfix">
            <aside class="side">
              <button>swich</button>
            </aside>
            <article class="content">con</article>
      </div>
</main>
</body>
</html>