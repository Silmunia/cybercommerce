<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if (session.getAttribute("user") == null || session.getAttribute("user") instanceof Cliente) {
		
		request.setAttribute("restrict", true);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("../PagInicial.jsp");
	    requestDispatcher.forward(request, response);
	} else {
%>
		<!DOCTYPE html>
		<html>
			<head>
				<link href = "http://localhost:8080/cybercommerce/Front-End/CSS/AreaAdmin-RegProdutos.css" rel = "stylesheet">
			</head>
		
			<body>
				<div id = "webpageArea">
					<%@ include file = "../Public/CabecalhoGeral.jsp" %>
		
					<div id = "adminArea">
						<h2> Registro de Produtos </h2>
		
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
		
							<div id = "productData">
								<input type = "text" name = "name" id = "name" placeholder = "Nome do Produto" required>
								<input type = "file" name = "image" id = "image" required>
								<input type = "number" name = "price" id = "price" placeholder = "Preço" required>
								<input type = "number" name = "quantity" id = "quantity" placeholder = "Quantidade" required>
		
								<img src = "http://localhost:8080/cybercommerce/Front-End/Imagens/nicolaBlue.png" alt = "NiCola Blue">
		
								<select name = "categories" id = "categories">
									<option value = "Bebidas"> Bebidas </option>
									<option value = "NiCola"> NiCola </option>
									<option value = "Veículos"> Veículos </option>
									<option value = "Roupas"> Roupas </option>
									<option value = "Schwabschwab"> Schwabschwab </option>
								</select>
		
								<input type = "submit" onclick = "onConfirmChanges()" value = "Confirmar" id = "confirmChange">
							</div>
					</div>
		
					<div id = "footerArea">
						<h2> José Cleanto Feitosa e Pedro Henrique Costa </h2>
					</div>
				</div>
			</body>
		</html>
<%
	}
%>