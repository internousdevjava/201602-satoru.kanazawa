<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Success!!</title>
</head>
<body>
	<h1>ログインに成功しました！！</h1>
	<br>

	<s:property value="#session.name_key"/>さん<br>

	<s:form action="HistoryAction">
	<s:submit value="購入履歴" />
	</s:form>

	<INPUT type="button" value="戻る" onClick="history.back()">

</body>
</html>