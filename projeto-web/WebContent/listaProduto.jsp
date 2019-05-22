<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Lista de Produto</title>
</head>
<body>
<div id="msg" class="alert alert-success" role="alert" style="padding: 5px;">
 	salvo com Sucesso!
</div>
<table class="table table-hover">
  <thead>
    <tr>
       <th scope="col">Descricao</th> 
      <th scope="col">Valor</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="produto" items="${produtos}">
   <tr>
      <td>${produto.descricao}</td>
      <td>${produto.vlrUnitario}</td>
      <td colspan="2"> 
      </td>
    </tr>
   </c:forEach>
   </tbody>
</table>

</body>
</html>