<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link href = "../../CSS/AreaCliente-Compras.css" rel = "stylesheet">
	</head>

	<body>
		<div id = "webpageArea">
			<%@ include file = "../Public/CabecalhoGeral.jsp" %>

			<div id = "clientArea">
				<h2> Histórico de Compras </h2>

					<div id = "clientOptions">
						<h3> Área do Cliente </h3>
						<ul>
							<a href = "AreaCliente-Dados.jsp"><li> Informações da Conta </li></a>
							<a href = "AreaCliente-Compras.jsp"><li> Histórico de Compras </li></a>
							<a href = "AreaCliente-Excluir.jsp"><li> Excluir Conta </li></a>
						</ul>
					</div>

					<div id = "clientPurchases">
						<select name = "purchases" id = "purchases">
							<option value = "#333"> Compra #333 - 31/12/2020 - R$9999 </option>
							<option value = "#333"> Compra #333 - 20/12/2020 - R$9999 </option>
							<option value = "#333"> Compra #333 - 01/12/2020 - R$9999 </option>
						</select>

						<div class = "product">
							<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
							<h2> Archer Hella EC-D 1360 </h2>
							<h3> X unidades - R$99,99 </h3>
						</div>

						<div class = "product">
							<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
							<h2> Archer Hella EC-D 1360 </h2>
							<h3> X unidades - R$99,99 </h3>
						</div>

						<div class = "product">
							<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
							<h2> Archer Hella EC-D 1360 </h2>
							<h3> X unidades - R$99,99 </h3>
						</div>

						<div class = "product">
							<img src = "../../nicolaBlue.jpg" alt = "NicolaBlue">
							<h2> Archer Hella EC-D 1360 </h2>
							<h3> X unidades - R$99,99 </h3>
						</div>
					</div>
			</div>

			<div id = "footerArea">
				<h2> José Cleanto Feitosa e Pedro Henrique Costa </h2>
			</div>
		</div>
	</body>
</html>