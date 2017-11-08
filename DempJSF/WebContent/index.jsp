<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
<h:outputText value="Bienvenue dans ma premiére page jsf" />
<h:form>
<h:messages style="color:red"/>
<h:panelGrid>
<h:outputText value="code" />
<h:inputText id="idCode"  value="#{etudiantBean.code}" required="true" requiredMessage="le code est obligatoire" />
<h:message for="idCode" style="color:red"/>
<h:outputText value="nom" />
<h:inputText id="idNom" value="#{etudiantBean.nom}" required="true" requiredMessage="le nom est obligatoire" />
<h:message for="idNom" style="color:red"/>
<h:outputText value="Moyenne" />
<h:inputText id="idMoyenne" value="#{etudiantBean.moyenne}" required="true" requiredMessage="le moyen est obligatoire" />
<h:message for="idMoyenne" style="color:red"/>
<h:commandButton action="#{etudiantBean.succed}" value="Valider" />
</h:panelGrid>
</h:form>
</f:view>
</body>
</html>