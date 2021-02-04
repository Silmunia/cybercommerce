<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "UTF-8">
		<link href = "http://localhost:8080/cybercommerce/Front-End/CSS/AreaAdmin-Dados.css" rel = "stylesheet">
	</head>

	<body>
		<div id = "webpageArea">
			<%@ include file = "../Public/CabecalhoGeral.jsp" %>

			<div id = "adminArea">
				<h2> Informações da Conta </h2>

					<div id = "adminOptions">
						<h3> Área do Administrador </h3>
						<ul>
							<a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Admin/AreaAdmin-Dados.jsp"><li> Informações da Conta </li></a>
							<a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Admin/AreaAdmin-Compras.jsp"><li> Compras de Clientes </li></a>
							<a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Admin/AreaAdmin-Relatorios.jsp"><li> Relatórios do Sistema </li></a>
							<a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Admin/AreaAdmin-RegProdutos.jsp"><li> Registro de Produtos </li></a>
							<a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Admin/AreaAdmin-AltProdutos.jsp"><li> Alteração de Produtos </li></a>
							<a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Admin/AreaAdmin-RegCategorias.jsp"><li> Registro de Categorias </li></a>
							<a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Admin/AreaAdmin-AltCategorias.jsp"><li> Alteração de Categorias </li></a>
							<a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Admin/AreaAdmin-Excluir.jsp"><li> Excluir Conta </li></a>
						</ul>
					</div>

					<div id = "adminData">
						<input type = "text" name = "name" id = "name" placeholder = "Nome do Administrador" required>
						<input type = "email" name = "email" id = "email" placeholder = "Email do Administrador" required>
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