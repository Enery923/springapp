<%@ include file="/views/include.jsp" %>

<html>
  <title><fmt:message key="title"/></title>
  <body>
     <h3>Client found</h3>
      <b>Cliente: </b>
      <c:out value="${client.completeName}"/><br><br>
      <b>DNI: </b>
      <c:out value="${client.id}"/><br><br>
      <b>Dirección: </b>
      <c:out value="${client.address}"/><br><br>
      <b> Inversiones: </b>
      <c:out value="${client.entity}"/><br>
      <c:out value="${client.inversion}"/><br>
     
    <br>
    <br>
    <a href="<c:url value="hello.htm"/>">Back home</a>
    <br>
  </body>
</html>