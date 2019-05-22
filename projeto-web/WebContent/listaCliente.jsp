<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 -->
<title>Lista de Clientes</title>
</head>

<body>

	<table class="table table-hover" style="text-align: center;">
		<thead>
			<!-- cabeçalho da tabela: escope das colunas -->
			<tr>
				<th scope="col">Id</th>
				<th scope="col" style="text-align: center;">Nome</th>
				<th scope="col">Documento</th>
			</tr>
		</thead>

		<tbody>
			<!--  corpo da tabela: Interacao de objeto na variavel e posibilitando acesso de objeto na expressao em aspas duplas items. -->

			<c:forEach var="cliente" items="${clientes}">
				<tr>
					<td>${cliente.id}</td>
					<td style="text-align: center;">${cliente.nome}</td>
					<td>${cliente.documento}</td>
					<td colspan="2">
					<a href="populaForm?id=${cliente.id}"
							class="button"> <i class="btn btn-outline-success">Atualizar </i>	
					</a>
					<a href="excluirCliente?id=${cliente.id}"
							class="button"> <i class="btn btn-outline-danger">Excluir </i>	
					</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

