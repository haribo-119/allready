<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="kr">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css"/>
    <script src="${pageContext.request.contextPath}/resources/js/login.js"></script>
    <title>login</title>
</head>
<style>
    .idMsg {
        transition: opacity 3s;
    }

</style>
<body>
<div class="container">
    <form action="<c:url value="/login/login.do"/> " method="POST" onsubmit="return formCheck(this)" >
        <h1>invite you!</h1>
        <div class="main">
            <div class="loginInput">
                <label for="id">ID<b style="color:red" class="idMsg"></b></label>
                <input id="id" name="id" type="text" value="${cookie.id.value}"/>
                <!-- <div id="character_remaining"></div> -->
            </div>

            <div class="loginInput">
                <label for="pwd">Password<b style="color:red" class="idMsg"></b></label>
                <input id="pwd" name="pw" type="password"  />
            </div>
            <label id="rememberId"
            ><input type="checkbox" name="rememberId" value="on" ${empty
                    cookie.id.value ? "":"checked"}> 아이디 기억</label
            >
            <br />
            <button class="btn" type="submit">로그인</button>
            <div id="loginHelp">
                <a href="">비밀번호 찾기</a> |
                <a href="member">회원가입</a>
            </div>
        </div>
        <script>
            function formCheck(bin){
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

                if(filter === "id") {
                    document.getElementsByClassName("idMsg")[0].innerHTML = msg;
                }
                if(filter === "pw") {
                    document.getElementsByClassName("idMsg")[1].innerHTML = msg;
                }

                setTimeout(function() {
                    var elements = document.getElementsByClassName("idMsg");
                    console.log(elements);
                    for (var i = 0; i < elements.length; i++) {
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
            //elements[i].style.opacity = '0';
        </script>
    </form>

</div>
</body>
</html>