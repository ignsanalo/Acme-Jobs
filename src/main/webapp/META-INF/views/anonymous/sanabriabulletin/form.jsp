<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.sanabriabulletin.form.label.author" path="author"/>
	<acme:form-textarea code="anonymous.sanabriabulletin.form.label.song" path="song"/>

	
	<acme:form-submit code="anonymous.sanabriabulletin.form.button.create" action="/anonymous/sanabriabulletin/create"/>
  	<acme:form-return code="anonymous.sanabriabulletin.form.button.return"/>
</acme:form>
