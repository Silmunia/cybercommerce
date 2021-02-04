<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link href = "../../CSS/AreaCliente-Excluir.css" rel = "stylesheet">
	</head>

	<body>
		<div id = "webpageArea">
			<%@ include file = "../Public/CabecalhoGeral.jsp" %>

			<div id = "clientArea">
				<h2> Excluir Conta </h2>

					<div id = "clientOptions">
						<h3> Área do Cliente </h3>
						<ul>
							<a href = "AreaCliente-Dados.jsp"><li> Informações da Conta </li></a>
							<a href = "AreaCliente-Compras.jsp"><li> Histórico de Compras </li></a>
							<a href = "AreaCliente-Excluir.jsp"><li> Excluir Conta </li></a>
						</ul>
					</div>

					<div id = "clientData">
						<p> Informações sobre como a conta não pode ser recuperada depois de apagada e balbaldjbsjlb la bdasj bdla bdsalj bal bl djsab alsj baljs bdlaj sbd lasjb aslj dbjlas b lsjb aljs bals bj </p>

						<input type = "password" name = "password" id = "password" placeholder = "Senha da Conta" required>

						<input type = "submit" onclick = "onConfirmDelete()" value = "Excluir Conta" id = "confirmDelete">
					</div>
			</div>

			<div id = "footerArea">
				<h2> José Cleanto Feitosa e Pedro Henrique Costa </h2>
			</div>
		</div>
	</body>
</html>