<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.maderobulletin.form.label.author" path="author"/>
	<acme:form-textarea code="anonymous.maderobulletin.form.label.photo" path="photo"/>

	
	<acme:form-submit code="anonymous.maderobulletin.form.button.create" action="/anonymous/maderobulletin/create"/>
  	<acme:form-return code="anonymous.maderobulletin.form.button.return"/>
</acme:form>