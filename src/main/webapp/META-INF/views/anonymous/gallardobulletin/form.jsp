<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.gallardobulletin.form.label.author" path="author"/>
	<acme:form-textarea code="anonymous.gallardobulletin.form.label.songAuthor" path="songAuthor"/>

	
	<acme:form-submit code="anonymous.gallardobulletin.form.button.create" action="/anonymous/gallardobulletin/create"/>
  	<acme:form-return code="anonymous.gallardobulletin.form.button.return"/>
</acme:form>