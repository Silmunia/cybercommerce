<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link href = "http://localhost:8080/cybercommerce/Front-End/CSS/PagCarrinho.css" rel = "stylesheet">
	</head>

	<body>
		<div id = "webpageArea">
			<%@ include file = "CabecalhoGeral.jsp" %>

			<div id = "cartArea">
				<h1> Carrinho de Compras </h1>

				<div id = "purchaseTotal">
					<h2> Total da Compra </h2>
					<h3> R$9999,99 </h3>

					<input type = "button" onclick = "onConfirmPurchase()" value = "Comprar" id = "purchaseCart">
				</div>

				<div class = "cartProduct">
					<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
					<h2> Archer Hella EC-D 1360 </h2>
					<h3> R$99,99 </h3>
					
					<input type = "number" name = "quantity" min = "1" max = "100" class = "changeProduct">

					<input type = "button" value = "Remover" class = "removeCart">
				</div>

				<div class = "cartProduct">
					<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
					<h2> Archer Hella EC-D 1360 </h2>
					<h3> R$99,99 </h3>
					
					<input type = "number" name = "quantity" min = "1" max = "100" class = "changeProduct">

					<input type = "button" value = "Remover" class = "removeCart">
				</div>

				<div class = "cartProduct">
					<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
					<h2> Archer Hella EC-D 1360 </h2>
					<h3> R$99,99 </h3>
					
					<input type = "number" name = "quantity" min = "1" max = "100" class = "changeProduct">

					<input type = "button" value = "Remover" class = "removeCart">
				</div>

				<div class = "cartProduct">
					<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
					<h2> Archer Hella EC-D 1360 </h2>
					<h3> R$99,99 </h3>
					
					<input type = "number" name = "quantity" min = "1" max = "100" class = "changeProduct">

					<input type = "button" value = "Remover" class = "removeCart">
				</div>

				<div class = "cartProduct">
					<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
					<h2> Archer Hella EC-D 1360 </h2>
					<h3> R$99,99 </h3>
					
					<input type = "number" name = "quantity" min = "1" max = "100" class = "changeProduct">

					<input type = "button" value = "Remover" class = "removeCart">
				</div>
			</div>

			<div id = "footerArea">
				<h2> José Cleanto Feitosa e Pedro Henrique Costa </h2>
			</div>
		</div>
	</body>
</html>