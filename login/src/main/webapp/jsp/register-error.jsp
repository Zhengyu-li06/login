<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/header.html" %>
<p>登録エラー: <%= session.getAttribute("error") %></p>
<p><a href="Register.jsp">戻る</a></p>
<%@ include file="/footer.html" %>
