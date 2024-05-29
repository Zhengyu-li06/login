<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="/header.html" %>

<form action="<%=request.getContextPath()%>/RegisterServlet"method="post">
    <label for="identity">ログイン名：</label>
    <input type="text" id="identity" name="identity" required><br><br>
    
    <label for="password">パスワード入力：</label>
    <input type="password" id="password" name="password" required><br><br>
    
    <label for="confirm_password">パスワード確認：</label>
    <input type="password" id="confirm_password" name="confirm_password" required><br><br>
    
    <input type="submit" value="登録">
</form>
<p><a href="login.jsp">既に登録済みの方はこちら</a></p>
<%@ include file="/footer.html"%>





