<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "cybercommerce.modelo.cliente.Cliente" %>
<%@ page import = "cybercommerce.modelo.admin.Admin" %>
<!DOCTYPE html>
<html>
	<head>
		<link href = "http://localhost:8080/cybercommerce/Front-End/CSS/CabecalhoGeral.css" rel = "stylesheet">
		<script type = "text/javascript" src = "http://localhost:8080/cybercommerce/Front-End/JS/CabecalhoGeral.js"></script>
		<title> Cybercommerce </title>
	</head>
	<%
		String loginResult = (String) request.getAttribute("result");
		if (session.getAttribute("user") == null) {
	%>
			<div id = "toppageArea">
				<h1><a href = "http://localhost:8080/cybercommerce/Front-End/HTML/PagInicial.jsp"> Cybercommerce </a></h1>
				<% if (request.getAttribute("restrict") != null && (Boolean) request.getAttribute("restrict")) { %><h2 id = "restrict"> Acesso Restrito! -> </h2> <% } %>
				<form action = "http://localhost:8080/cybercommerce/LoginServlet" method = "post" id = "loginArea">
					<div>
						<%
							String requestResult = (String) request.getAttribute("result");
							String requestLogin = (String) request.getAttribute("login");
							
							if (requestResult != null && requestResult.equals("InvalidUser")) {
						%>
								<input type = "text" name = "user" id = "userInvalid" placeholder = "Usuário" required>
						<%
							} else if (requestResult != null && requestResult.equals("InvalidPassword")) {
						%>
								<input type = "text" name = "user" id = "user" placeholder = "Usuário" value = <%= requestLogin %> required>
						<%
							} else {
						%>
								<input type = "text" name = "user" id = "user" placeholder = "Usuário" required>
						<%
							}
						%>
						<input type = "submit" value = "Login" class = "loginButton">
					</div>
		
					<div>
						<%
							if (requestResult != null && requestResult.equals("InvalidPassword")) {
						%>
								<input type = "password" name = "password" id = "passwordInvalid" placeholder = "Senha" required>
						<%
							} else {
						%>
								<input type = "password" name = "password" id = "password" placeholder = "Senha" required>
						<%
							}
						%>
						<input type = "button" onclick = "onRegister()" value = "Cadastrar" class = "loginButton">
					</div>
				</form>
		
				<ul id = "navbarArea">
				  <a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Public/CategoriasProduto.jsp"><li> Bebidas </li></a>
				  <a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Public/CategoriasProduto.jsp"><li> Roupas </li></a>
				  <a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Public/CategoriasProduto.jsp"><li> Veículos </li></a>
				  <a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Public/PagCarrinho.jsp"><li> Carrinho </li></a>
				</ul> 
			</div>	
	<%
		} else if (session.getAttribute("user") instanceof Cliente) {
			
			Cliente usuario = (Cliente) session.getAttribute("user");
	%>
			<div id = "toppageArea">
				<h1><a href = "http://localhost:8080/cybercommerce/Front-End/HTML/PagInicial.jsp"> Cybercommerce </a></h1>
				<% if (request.getAttribute("restrict") != null && (Boolean) request.getAttribute("restrict")) { %><h2 id = "restrict"> Acesso Restrito! -> </h2> <% } %>
				<div id = "logoutArea">
					<h2> Olá, <%= usuario.getNome() %>! </h2>
					<form action = "http://localhost:8080/cybercommerce/LogoutServlet" method = "post">
						<input type = "submit" value = "Sair" id = "logoutButton">
					</form>
				</div>
		
				<ul id = "clientBar">
				  <a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Public/CategoriasProduto.jsp"><li> Bebidas </li></a>
				  <a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Public/CategoriasProduto.jsp"><li> Roupas </li></a>
				  <a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Public/CategoriasProduto.jsp"><li> Veículos </li></a>
				  <a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Public/PagCarrinho.jsp"><li> Carrinho </li></a>
				  <a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Cliente/AreaCliente-Dados.jsp"><li> Área do Cliente </li></a>
				</ul> 
			</div>
	<%	
		} else if (session.getAttribute("user") instanceof Admin) {
			
			Admin usuario = (Admin) session.getAttribute("user");
	%>
			<div id = "toppageArea">
				<h1><a href = "http://localhost:8080/cybercommerce/Front-End/HTML/Admin/AreaAdmin-Dados.jsp"> Cybercommerce </a></h1>
				<% if (request.getAttribute("restrict") != null && (Boolean) request.getAttribute("restrict")) { %><h2 id = "restrict"> Acesso Restrito! -> </h2> <% } %>
				<div id = "logoutArea">
					<h2> Olá, <%= usuario.getNome() %>! </h2>
					<form action = "http://localhost:8080/cybercommerce/LogoutServlet" method = "post">
						<input type = "submit" value = "Sair" id = "logoutButton">
					</form>
				</div>
		
				<ul id = "navbarArea">

				</ul> 
			</div>			
	<%
		}
	%>
</html>