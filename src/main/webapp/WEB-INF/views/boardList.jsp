<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
<div style="text-align:center">
        <table>
            <tr>
                <th class="no">번호</th>
                <th class="title">제목</th>
                <th class="writer">이름</th>
                <th class="regdate">등록일</th>
                <th class="viewcnt">조회수</th>
            </tr>
            <c:forEach var="board" items="${list}">
                <tr>
                    <td class="no">${board.bno}</td>
                    <td class="title"><a><c:out value="${board.title}"/></a></td>
                    <td class="writer">${board.writer}</td>
                    <c:choose>
                        <c:when test="${board.reg_date.time >= startOfToday}">
                            <td class="regdate"><fmt:formatDate value="${board.reg_date}" pattern="HH:mm" type="time"/></td>
                        </c:when>
                        <c:otherwise>
                            <td class="regdate"><fmt:formatDate value="${board.reg_date}" pattern="yyyy-MM-dd" type="date"/></td>
                        </c:otherwise>
                    </c:choose>
                    <td class="viewcnt">${board.view_cnt}</td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <div class="paging-container">
            <div class="paging">
                <c:if test="${totalCnt==null || totalCnt==0}">
                    <div> 게시물이 없습니다. </div>
                </c:if>
                <c:if test="${totalCnt!=null && totalCnt!=0}">
                    <c:if test="${ph.showPrev}">
                        <a class="page" href="<c:url value="/board/list?page=${ph.beginPage-1}&pageSize=${ph.pageSize}"/>">&lt;</a>
                    </c:if>
                    <c:forEach var="i" begin="${ph.beginPage}" end="${ph.endPage}">
                        <a class="page" href="<c:url value="/board/list?page=${i}&pageSize=${ph.pageSize}"/>">${i}</a>
                    </c:forEach>
                    <c:if test="${ph.showNext}">
                        <a class="page" href="<c:url value="/board/list?page=${ph.endPage+1}&pageSize=${ph.pageSize}"/>">&gt;</a>
                    </c:if>
                </c:if>
            </div>
        </div>
    </div>
</div>

</body>
</html>
