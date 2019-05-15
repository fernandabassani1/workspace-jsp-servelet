<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Produto</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div style="width: 30%; padding: 10px; margin-left: 35%; margin-top: 10%">
<form action="<c:url value = "cadastraProduto"/>" method="post">
    
  <h3><strong>Cadastro de Produto</strong></h3>
  <hr>
  <div class="form-group">
    <label for="exampleInputEmail1">Descricao:</label>
    <input type="text" class="form-control" aria-describedby="emailHelp" placeholder="Descricao" name="descricao">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Valor:</label>
    <input type="text" class="form-control" aria-describedby="emailHelp" placeholder="Valor" name="valor">
  </div>
  <button type="submit" class="btn btn-primary">Salvar</button>
</form>
</div>

</body>
</html>