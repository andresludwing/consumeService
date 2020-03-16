<%@ include file="/init.jsp" %>

	<portlet:renderURL var="renderUrl"
		<portlet:param name="jspPage" value="/view.jsp" />	
	</portlet:renderURL>
	
	
	<h1 style="text-align: center;">Lista Servicio Personas</h1>
	
	<a href="${renderUrl}">RenderURL Created by Portlet Tag</a>
	
