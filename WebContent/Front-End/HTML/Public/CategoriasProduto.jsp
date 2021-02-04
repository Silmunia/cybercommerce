<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link href = "http://localhost:8080/cybercommerce/Front-End/CSS/CategoriasProduto.css" rel = "stylesheet">
	</head>

	<body>
		<div id = "webpageArea">
			<%@ include file = "CabecalhoGeral.jsp" %>

			<div id = "categoriesSection">
				<h2> Categorias </h2>
				<ul>
					<li> Todas </li>
					<li> NiCola </li>
					<li> Schwabschwab </li>
					<li> Spunky Monkey </li>
				</ul>
			</div>

			<div id = "fullCatalog">
				<div class = "productRow">
					<div class = "productImage">
						<a href="ProdutoSelecionado.jsp">
							<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
							<h2> NiCola Blue </h2>
							<h3> R$99,99 </h3>
						</a>
					</div>

					<div class = "productImage">
						<a href="ProdutoSelecionado.jsp">
							<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
							<h2> NiCola Blue </h2>
							<h3> R$99,99 </h3>
						</a>
					</div>

					<div class = "productImage">
						<a href="ProdutoSelecionado.jsp">
							<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
							<h2> NiCola Blue </h2>
							<h3> R$99,99 </h3>
						</a>
					</div>
				</div>

				<div class = "productRow">
					<div class = "productImage">
						<a href="ProdutoSelecionado.jsp">
							<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
							<h2> NiCola Blue </h2>
							<h3> R$99,99 </h3>
						</a>
					</div>

					<div class = "productImage">
						<a href="ProdutoSelecionado.jsp">
							<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
							<h2> NiCola Blue </h2>
							<h3> R$99,99 </h3>
						</a>
					</div>

					<div class = "productImage">
						<a href="ProdutoSelecionado.jsp">
							<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
							<h2> NiCola Blue </h2>
							<h3> R$99,99 </h3>
						</a>
					</div>
				</div>
			</div>

			<div id = "footerArea">
				<h2> José Cleanto Feitosa e Pedro Henrique Costa </h2>
			</div>
		</div>
	</body>
</html>