<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link href = "../../CSS/AreaCliente-Dados.css" rel = "stylesheet">
	</head>

	<body>
		<div id = "webpageArea">
			<%@ include file = "../Public/CabecalhoGeral.jsp" %>

			<div id = "clientArea">
				<h2> Informações da Conta </h2>

					<div id = "clientOptions">
						<h3> Área do Cliente </h3>
						<ul>
							<a href = "AreaCliente-Dados.jsp"><li> Informações da Conta </li></a>
							<a href = "AreaCliente-Compras.jsp"><li> Histórico de Compras </li></a>
							<a href = "AreaCliente-Excluir.jsp"><li> Excluir Conta </li></a>
						</ul>
					</div>

					<div id = "clientData">
						<input type = "text" name = "name" id = "name" placeholder = "Nome do Cliente" required>
						<input type = "email" name = "email" id = "email" placeholder = "Email do Cliente" required>
						<input type = "text" name = "address" id = "address" placeholder = "Endereço do Cliente" required>
						<input type = "text" name = "user" id = "newUser" placeholder = "Nome de Usuário" required>
						<input type = "password" name = "newPass" id = "newPass" placeholder = "Senha da Conta" required>

						<input type = "submit" onclick = "onConfirmChanges()" value = "Confirmar" id = "confirmChange">
					</div>
			</div>

			<div id = "footerArea">
				<h2> José Cleanto Feitosa e Pedro Henrique Costa </h2>
			</div>
		</div>
	</body>
</html>