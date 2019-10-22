<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	
	<acme:list-column code="anonymous.gallardobulletin.list.label.author" path="author" width="20%"/>
	<acme:list-column code="anonymous.gallardobulletin.list.label.songAuthor"  path="songAuthor" width="60%"/>
</acme:list>