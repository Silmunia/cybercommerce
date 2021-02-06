<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link href = "http://localhost:8080/cybercommerce/Front-End/CSS/ProdutoSelecionado.css" rel = "stylesheet">
		<script type = "text/javascript" src = "http://localhost:8080/cybercommerce/Front-End/JS/ProdutoSelecionado.js"></script>
	</head>

	<body>
		<div id = "webpageArea">
			<%@ include file = "CabecalhoGeral.jsp" %>

			<div id = "selectedProduct">
				<img src = "../../Imagens/archer1360.png" alt = "Archer Hella EC-D 1360">
				<h2> Archer Hella EC-D 1360 </h2>
				<h3> R$15299,99 </h3>
				<input type = "button" onclick = "onAddToCart()" value = "Adicionar ao Carrinho" id = "addCart">
			</div>

			<div id = "footerArea">
				<h2> José Cleanto Feitosa e Pedro Henrique Costa </h2>
			</div>
		</div>
	</body>
</html>