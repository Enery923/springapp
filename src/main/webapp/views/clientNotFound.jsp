<%@ include file="/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><fmt:message key="title"/></title>
</head>
<body>
<h1><fmt:message key="error.heading"/></h1>
<hr>
<p>The operation cannot be realized</p>
<a href="<c:url value="searcher.htm"/>">Return</a>
</body>
</html>