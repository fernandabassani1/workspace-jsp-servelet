<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Lista de Funcionários</title>
</head>
<body>
<table class="table table-hover">
  <thead>
    <tr>
       <th scope="col">Nome</th> 
      <th scope="col">Email</th>
      <th scope="col">Rg</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="funcionario" items="${funcionarios}">
   <tr>
      <td>${funcionario.nome}</td>
      <td>${funcionario.email}</td>
      <td>${funcionario.rg}</td>
    </tr>
   </c:forEach>
   </tbody>
</table>
</body>
</html>