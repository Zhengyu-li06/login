<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="/header.html" %>
<form action="<%=request.getContextPath()%>/LoginServlet" method="post">
    <p>ログイン名<input type="text" name="identity" value="<%= session.getAttribute("identity") %>"></p>
    <p>パスワード<input type="password" name="password"></p>
    <input type="submit" value="ログイン">
</form>
<% 

String error = (String) session.getAttribute("error");
if (error != null) {
%>
<p><%= error %></p>
<%
}

session.removeAttribute("error");
%>
<p><a href="Register.jsp">会員登録が済んでいない人はこちら</a></p>
<%@ include file="/footer.html"%>
