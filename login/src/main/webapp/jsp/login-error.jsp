<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="/header.html" %>
<meta http-equiv="refresh" content="5;url=login.jsp">

ログイン名又はパスワードが違います。<br>


<script type="text/javascript">
    var countdown = 5;
    function updateCountdown() {
        if (countdown > 0) {
            document.getElementById('countdown').innerText = countdown + 'ログイン画面に移動します。';
            countdown--;
            setTimeout(updateCountdown, 1000);
        } else {
            window.location.href = 'login.jsp';
        }
    }
    window.onload = updateCountdown;
</script>



<p id="countdown">5秒後ログイン画面に移動します。</p>

<p><a href="login.jsp">ログイン画面に</a></p>

<%@ include file="/footer.html"%>