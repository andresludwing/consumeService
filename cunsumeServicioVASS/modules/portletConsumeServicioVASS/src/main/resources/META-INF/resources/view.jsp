<%@ include file="/init.jsp" %>

<portlet:actionURL name="buscarCedula" var="buscarCedulaURL" />

<form method="post" action="${buscarCedulaURL}">
	<label>Numero Cedula</label>
	<input type="number" name="<portlet:namespace/>cedula" >
	<input type="submit" value="Buscar">
</form>