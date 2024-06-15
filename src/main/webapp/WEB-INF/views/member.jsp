<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="kr">
<head>
  <meta charset="UTF-8" />
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/member.css"/>
  <script src="${pageContext.request.contextPath}/resources/js/login.js"></script>
  <title>login</title>
</head>
<body>
<div class="main">
  <form action="<c:url value="/login/member.do"/>" method="POST" onsubmit="return formCheck(this)">
    <h1>Hello!</h1>
    <h2>회원가입</h2>
    <div>
      <div class="loginInput">
        <label for="name">Name<b style="color:red" class="msg"></b></label>
        <input type="tset" id="name" name="nickName"  placeholder="                                   이름" />
      </div>

      <div class="loginInput">
        <label for="email">Email<b style="color:red" class="msg"></b></label>
        <input type="email" id="email" name="email"  placeholder="                                   이메일" />
      </div>

      <div class="loginInput">
        <label for="id">ID<b style="color:red" class="msg"></b></label>
        <input type="text" id="id" name="id"  placeholder="                                   아이디" />
      </div>

      <div class="loginInput">
        <label for="pwd">Password<b style="color:red" class="msg"></b></label>
        <input type="password" id="pwd" name="pw"  placeholder="                                   패스워드" />
      </div>
      <div class="loginInput">
        <label for="pwd_check">Password Check<b style="color:red" class="msg"></b></label>
        <input type="password" id="pwd_check" name="pwCheck"  placeholder="                                   패스워드 확인" />
      </div>
    </div>
    <br>
    <button class="btn" type="submit">가입하기</button>
  </form>
</div>
</body>
<script>
  function formCheck(bin){
    if(bin.nickName.value.length === 0){
      setMessage('를 입력해주세요.',bin.nickName,'nickName');
      return false;
    }
    if(bin.email.value.length === 0){
      setMessage('를 입력해주세요.',bin.email,'email');
      return false;
    }
    if(bin.id.value.length === 0){
      setMessage('를 입력해주세요.',bin.id,'id');
      return false;
    }
    if(bin.pw.value.length === 0){
      setMessage('를 입력해주세요.',bin.pw,'pw');
      return false;
    }
    return true;
  }

  function setMessage(msg,element,filter){

    if(filter === "nickName") {
      document.getElementsByClassName("msg")[0].innerHTML = msg;
    }
    if(filter === "email") {
      document.getElementsByClassName("msg")[1].innerHTML = msg;
    }
    if(filter === "id") {
      document.getElementsByClassName("msg")[2].innerHTML = msg;
    }
    if(filter === "pw") {
      document.getElementsByClassName("msg")[3].innerHTML = msg;
    }

    setTimeout(function() {
      var elements = document.getElementsByClassName("msg");
      console.log(elements);
      for (var i = 0; i < elements.length; i++) {
        elements[i].style.transition = "opacity 3s";
        elements[i].style.opacity = '0';
      }
      setTimeout(function() {
        for (var i = 0; i < elements.length; i++) {
          elements[i].innerHTML = '';
          elements[i].style.opacity = '1';
        }
      }, 3000); // 3초 후에 내용 삭제
    }, 3000); // 3초 후에 투명도 조정 시작

  }
</script>
</html>