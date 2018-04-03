<%@page import="model.Pais"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   
        <%Pais pais = (Pais)request.getAttribute("Pais"); %>
	Id: <%=pais.getId() %><br>
	Nome: <%=pais.getNome() %><br>
	População: <%=pais.getPopulacao() %><br>
	Area: <%=pais.getArea() %><br>
        
    </body>
</html>
