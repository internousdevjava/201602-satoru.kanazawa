<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<title>Insert title here</title>
</head>
<body>

	<s:form action="LoginAction">
	<s:textfield label="ID" name="id"/>
	<s:textfield label="パスワード" name="password"/>
	<s:submit value="確認" />
	</s:form>

</body>
</html>
