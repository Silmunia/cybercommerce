<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "cybercommerce.modelo.cliente.Cliente" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel = "stylesheet" href = "http://localhost:8080/cybercommerce/Front-End/CSS/CadastroCliente.css">
	</head>

	<body>
		<div id = "webpageArea">
			<%@ include file = "CabecalhoGeral.jsp" %>

			<div id = "registrationArea">
				<%
					String resultadoProcesso = (String) request.getAttribute("result");
					Cliente novoCliente = (Cliente) request.getAttribute("newClient");
					
					if (resultadoProcesso == null) {
				%>
					<h1> Cadastro de Novo Cliente </h1>
					<form action = "http://localhost:8080/cybercommerce/CadastrarClienteServlet" method = "post">
						<input type = "text" name = "nome" id = "name" placeholder = "Nome do Cliente" required>
						<input type = "email" name = "email" id = "email" placeholder = "Email do Cliente" required>
						<input type = "text" name = "endereco" id = "address" placeholder = "Endereço do Cliente" required>
						<input type = "text" name = "login" id = "newUser" placeholder = "Nome de Usuário" required>
						<input type = "password" name = "senha" id = "newPass" placeholder = "Senha da Conta" required>
						<input type = "password" name = "confirmacao" id = "confirmPass" placeholder = "Confirme a Senha" required>
						
						<input type = "submit" value = "Cadastrar" id = "confirmRegister">
					</form>
				<%
					} else if (resultadoProcesso.equals("ClientCreationSuccess")) {
				%>
					<h1> Cliente cadastrado com sucesso! </h1>
				<%
					} else if (resultadoProcesso.equals("ClientCreationError") || resultadoProcesso.equals("AdminConflict")) {
				%>
						<h1> Cadastro de Novo Cliente </h1>
						<h2> Login inválido! </h2>
						<form action = "http://localhost:8080/cybercommerce/CadastrarClienteServlet" method = "post">
							<input type = "text" name = "nome" value = "<%= novoCliente.getNome() %>" id = "name" placeholder = "Nome do Cliente" required>
							<input type = "email" name = "email" value = "<%= novoCliente.getEmail() %>" id = "email" placeholder = "Email do Cliente" required>
							<input type = "text" name = "endereco" value = "<%= novoCliente.getEndereco() %>" id = "address" placeholder = "Endereço do Cliente" required>
							<input type = "text" name = "login" value = "<%= novoCliente.getLogin() %>" id = "newUser" class = "invalidField" placeholder = "Nome de Usuário" required>
							<input type = "password" name = "senha" id = "newPass" placeholder = "Senha da Conta" required>
							<input type = "password" name = "confirmacao" id = "confirmPass" placeholder = "Confirme a Senha" required>
							
							<input type = "submit" value = "Cadastrar" id = "confirmRegister">
						</form>
				<%
					} else if (resultadoProcesso.equals("NonmatchingPasswords")) {
				%>
						<h1> Cadastro de Novo Cliente </h1>
						<h2> Senhas não combinam! </h2>
						<form action = "http://localhost:8080/cybercommerce/CadastrarClienteServlet" method = "post">
							<input type = "text" name = "nome" value = "<%= novoCliente.getNome() %>" id = "name" placeholder = "Nome do Cliente" required>
							<input type = "email" name = "email" value = "<%= novoCliente.getEmail() %>" id = "email" placeholder = "Email do Cliente" required>
							<input type = "text" name = "endereco" value = "<%= novoCliente.getEndereco() %>" id = "address" placeholder = "Endereço do Cliente" required>
							<input type = "text" name = "login" value = "<%= novoCliente.getLogin() %>" id = "newUser" placeholder = "Nome de Usuário" required>
							<input type = "password" name = "senha" id = "newPass" class = "invalidField" placeholder = "Senha da Conta" required>
							<input type = "password" name = "confirmacao" id = "confirmPass" class = "invalidField" placeholder = "Confirme a Senha" required>
							
							<input type = "submit" value = "Cadastrar" id = "confirmRegister">
						</form>
				<%
					}
				%>
			</div>

			<div id = "footerArea">
				<h2> José Cleanto Feitosa e Pedro Henrique Costa </h2>
			</div>
		</div>
	</body>
</html>