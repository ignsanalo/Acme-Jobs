<%--
- menu.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java" import="acme.framework.helpers.PrincipalHelper,acme.entities.roles.Provider,acme.entities.roles.Consumer"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:menu-bar code="master.menu.home">
	<acme:menu-left>
		<acme:menu-option code="master.menu.anonymous" access="isAnonymous()">
			<acme:menu-suboption code="master.menu.anonymous.Manu-link" action="https://github.com/manrubben"/>
			<acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Alvaro-link" action="https://github.com/alvdiaasc97"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Ignacio-link" action="https://github.com/ignsanalo"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Adrian-link" action="https://github.com/adrmadfer"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Josema-link" action="https://github.com/josgalbal"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Guillermo-link" action="https://github.com/guipavvar"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Shout" action="/anonymous/shout/create"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.List-shouts" action="/anonymous/shout/list"/>
            
            
		</acme:menu-option>
	

		<acme:menu-option code="master.menu.administrator" access="hasRole('Administrator')">
			<acme:menu-suboption code="master.menu.administrator.user-accounts" action="/administrator/user-account/list"/>
			<acme:menu-separator/>
			<acme:menu-suboption code="master.menu.administrator.shutdown" action="/master/shutdown"/>
		</acme:menu-option>

		<acme:menu-option code="master.menu.provider" access="hasRole('Provider')">
			<acme:menu-suboption code="master.menu.provider.favourite-link" action="http://www.example.com/"/>
		</acme:menu-option>

		<acme:menu-option code="master.menu.consumer" access="hasRole('Consumer')">
			<acme:menu-suboption code="master.menu.consumer.favourite-link" action="http://www.example.com/"/>
		</acme:menu-option>
	</acme:menu-left>
	
	<acme:menu-left>
		<acme:menu-option code="master.menu.bulletin" access="isAnonymous()">
		
		<acme:menu-suboption code="master.menu.anonymous.Diaz-bulletin" action="/anonymous/diazbulletin/create"/>
            <acme:menu-separator/>		
            <acme:menu-suboption code="master.menu.anonymous.List-bulletins" action="/anonymous/diazbulletin/list"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Create-Rubiobulletins" action="/anonymous/rubiobulletin/create"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.List-Rubiobulletins" action="/anonymous/rubiobulletin/list"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Create-Gallardobulletins" action="/anonymous/gallardobulletin/create"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.List-Gallardobulletins" action="/anonymous/gallardobulletin/list"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Create-Pavonbulletins" action="/anonymous/pavonbulletin/create"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.List-Pavonbulletins" action="/anonymous/pavonbulletin/list"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Create-Maderobulletins" action="/anonymous/maderobulletin/create"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.List-Maderobulletins" action="/anonymous/maderobulletin/list"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.Create-Sanabriabulletins" action="/anonymous/sanabriabulletin/create"/>
            <acme:menu-separator/>
            <acme:menu-suboption code="master.menu.anonymous.List-Sanabriabulletins" action="/anonymous/sanabriabulletin/list"/>
			
        </acme:menu-option>   
     </acme:menu-left>

	<acme:menu-right>
		<acme:menu-option code="master.menu.sign-up" action="/anonymous/user-account/create" access="isAnonymous()"/>
		<acme:menu-option code="master.menu.sign-in" action="/master/sign-in" access="isAnonymous()"/>

		<acme:menu-option code="master.menu.user-account" access="isAuthenticated()">
			<acme:menu-suboption code="master.menu.user-account.general-data" action="/authenticated/user-account/update"/>
			<acme:menu-suboption code="master.menu.user-account.become-provider" action="/authenticated/provider/create" access="!hasRole('Provider')"/>
			<acme:menu-suboption code="master.menu.user-account.provider" action="/authenticated/provider/update" access="hasRole('Provider')"/>
			<acme:menu-suboption code="master.menu.user-account.become-consumer" action="/authenticated/consumer/create" access="!hasRole('Consumer')"/>
			<acme:menu-suboption code="master.menu.user-account.consumer" action="/authenticated/consumer/update" access="hasRole('Consumer')"/>
		</acme:menu-option>

		<acme:menu-option code="master.menu.sign-out" action="/master/sign-out" access="isAuthenticated()"/>
	</acme:menu-right>
</acme:menu-bar>

