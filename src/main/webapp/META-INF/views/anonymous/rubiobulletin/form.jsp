<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.rubiobulletin.form.label.author" path="author"/>
	<acme:form-textarea code="anonymous.rubiobulletin.form.label.link" path="link"/>

	
	<acme:form-submit code="anonymous.rubiobulletin.form.button.create" action="/anonymous/rubiobulletin/create"/>
  	<acme:form-return code="anonymous.rubiobulletin.form.button.return"/>
</acme:form>