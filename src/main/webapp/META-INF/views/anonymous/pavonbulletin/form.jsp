<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.pavonbulletin.form.label.author" path="author"/>
	<acme:form-textarea code="anonymous.pavonbulletin.form.label.text" path="text"/>
	<acme:form-moment code="anonymous.pavonbulletin.form.label.date" path="date"/>

	
	<acme:form-submit code="anonymous.pavonbulletin.form.button.create" action="/anonymous/pavonbulletin/create"/>
  	<acme:form-return code="anonymous.pavonbulletin.form.button.return"/>
</acme:form>