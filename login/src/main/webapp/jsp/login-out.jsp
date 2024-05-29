<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="/header.html" %>
<meta http-equiv="refresh" content="5;url=login-test.jsp">

<script type="text/javascript">
    var countdown = 60;
    function updateCountdown() {
        if (countdown > 0) {
            document.getElementById('countdown').innerText = countdown + 'ホームページに移動します。';
            countdown--;
            setTimeout(updateCountdown, 1000);
        } else {
            window.location.href = 'login-test.jsp';
        }
    }
    window.onload = updateCountdown;
</script>

こんにちは、${client.identity}さん。

<p id="countdown">60秒後ホームページに移動します。</p>

<p><a href="login-test.jsp">ホームページに</a></p>

<%@ include file="/footer.html"%>
