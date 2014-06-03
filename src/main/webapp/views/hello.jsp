<%@ include file="/views/include.jsp" %>

<html>

<head>
<title><fmt:message key="title"/></title>
</head>
<body>
	<h1>
		SearchClients
	</h1>
	<h3>Clients</h3>
	<c:forEach items="${model.clients}" var="client">
		<b>Cliente: </b>
		<c:out value="${client.completeName}" /><br>
		<b>Dirección: </b>
		<c:out value="${client.address}" /><br>
		<b>DNI: </b>
		<c:out value="${client.id}" /><br>
		<hr>

	</c:forEach>
	<br>
	<a href="<c:url value="searcher.htm"/>">Searcher</a>
	<br>
</body>
</html>