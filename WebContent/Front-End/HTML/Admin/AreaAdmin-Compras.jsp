<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link href = "http://localhost:8080/cybercommerce/Front-End/CSS/AreaAdmin-Compras.css" rel = "stylesheet">
	</head>

	<body>
		<div id = "webpageArea">
			<%@ include file = "../Public/CabecalhoGeral.jsp" %>

			<div id = "adminArea">
				<h2> Compras de Clientes </h2>

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

					<div id = "purchaseData">

						<select name = "clients" id = "clients">
							<option value = "333"> Cliente #3333 </option>
							<option value = "333"> Cliente #4444 </option>
							<option value = "333"> Cliente #5555 </option>
							<option value = "333"> Cliente #6666 </option>
						</select>

						<select name = "purchases" id = "purchases">
							<option value = "333"> Compra #12 </option>
							<option value = "333"> Compra #14 </option>
							<option value = "333"> Compra #51 </option>
							<option value = "333"> Compra #43 </option>
						</select>

						<input type = "submit" onclick = "onDeleteCategory()" value = "Excluir Compra" id = "confirmDelete">

						<div id = "selectedPurchase">

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
			</div>

			<div id = "footerArea">
				<h2> José Cleanto Feitosa e Pedro Henrique Costa </h2>
			</div>
		</div>
	</body>
</html>