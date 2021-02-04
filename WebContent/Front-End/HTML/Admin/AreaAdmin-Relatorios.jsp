<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link href = "http://localhost:8080/cybercommerce/Front-End/CSS/AreaAdmin-Relatorios.css" rel = "stylesheet">
	</head>

	<body>
		<div id = "webpageArea">
			<%@ include file = "../Public/CabecalhoGeral.jsp" %>

			<div id = "adminArea">
				<h2> Relatórios do Sistema </h2>

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

					<div id = "categoryData">

						<select name = "categories" id = "categories">
							<option value = "Compras"> Relatório de Compras por Cliente </option>
							<option value = "Estoque"> Relatório de Estoque </option>
							<option value = "Fatura"> Relatório de Faturamento por Dia </option>
						</select>

						<div id = "reportPeriod">
							<input type = "date" name = "start" id = "periodStart" required>
							<h4> até </h4>
							<input type = "date" name = "end" id = "periodEnd" required>
						</div>

						<input type = "submit" onclick = "onChangeCategory()" value = "Gerar Relatório" id = "confirmReport">
					</div>
			</div>

			<div id = "footerArea">
				<h2> José Cleanto Feitosa e Pedro Henrique Costa </h2>
			</div>
		</div>
	</body>
</html>