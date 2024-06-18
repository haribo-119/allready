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
<body>
  <main>
    <div class="a1">
      <h1>계획표</h1>
    </div>
  </main>

  <!-- <footer>
    <div class="button">
      <ul>
          <li>Quizlet정보</li>
          <li>Quizlet정보</li>
          <li>커리어</li>
          <li>Quizlet 광고</li>
          <li>뉴스</li>
          <li>앱 다운로드</li>
      </ul>
      <ul>
          <li>선생님을 위한 기능</li>
          <li>Live</li>
          <li>체크 포인트</li>
          <li>블로그</li>
          <li>선생님을 위한 Quizlet Plus</li>

      </ul>
      <ul>
          <li>학생</li>
          <li>낱말카드</li>
          <li>학습하기</li>
          <li>솔루션</li>
          <li>Quizlet Plus</li>
      </ul>
      <ul>
          <li>리소스</li>
          <li>지원센터</li>
          <li>회원가입</li>
          <li>명예규율</li>
          <li>커뮤니티 가이드라인</li>
          <li>개인정보 보호</li>
          <li>이용 약관</li>
          <li>광고 및 쿠키 정책</li>
      </ul>
      <ul>
        <li>언어</li>
        <li>한국어</li>
      </ul>
  </div>
  </footer> -->
  <div class="dim"></div>
</body>
</html>