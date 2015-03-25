<%--
  Created by IntelliJ IDEA.
  User: Donghyun Seo (egaoneko@naver.com)
  Last Editor: Jisung jeon
  Date: 2015-03-22
  Time: 오후 2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Index Page</title>
</head>

<body>
<h1>테스트 페이지</h1> 

<ul>
	<li><a href="<%=request.getContextPath()%>/user/userAdd.do">Sign Up</a></li>
	<c:choose>
		<c:when test="${auth != null }">
			<c:url value="/j_spring_security_logout" var="logoutUrl" />
			<li><a href="${logoutUrl}">Log Out</a></li>
		</c:when>
		<c:otherwise>
			<li><a href="<%=request.getContextPath()%>/main/login.do">Sign In</a></li>
		</c:otherwise>
	</c:choose>
	<li><a href="<%=request.getContextPath()%>/user/userList.do">User List</a></li>
	<li><a href="<%=request.getContextPath()%>/board/list.do">Board List</a></li>
    <li><a href="<%=request.getContextPath()%>/board/list.do?s=notice">Notice Board List</a></li>
    <li><a href="<%=request.getContextPath()%>/board/list.do?s=qna">QnA Board List</a></li>	
</ul>
</body>

</html>