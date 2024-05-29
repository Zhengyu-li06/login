package jp.co.aforce.jsp;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.bean.Client;
import jp.co.aforce.dao.ClientDAO;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    HttpSession session = request.getSession();
	    
	    String identity = request.getParameter("identity");
	    String password = request.getParameter("password");
	    String confirmPassword = request.getParameter("confirm_password");
	    
	   
	    if (identity == null || identity.isEmpty() || password == null || password.isEmpty()) {
	        session.setAttribute("error", "ログイン名とパスワードは必須です");
	        response.sendRedirect("jsp/register-error.jsp");
	        return;
	    }
	    
	    
	    if (!password.equals(confirmPassword)) {
	        session.setAttribute("error", "パスワードが一致しません");
	        response.sendRedirect("jsp/register-error.jsp");
	        return;
	    }
	    
	    ClientDAO dao = new ClientDAO();
	    
	    try {
	        if (dao.checkExistence(identity)) {
	            session.setAttribute("error", "このログイン名は既に使用されています");
	            response.sendRedirect("jsp/register-error.jsp");
	            return;
	        }

	        Client newClient = new Client();
	        newClient.setIdentity(identity);
	        newClient.setPassword(password);

	        dao.create(newClient);

	        session.setAttribute("client", newClient);
	        response.sendRedirect("jsp/register-success.jsp");
	    } catch (Exception e) {
	        e.printStackTrace();
	        session.setAttribute("error", "サーバーエラーが発生しました。");
	        response.sendRedirect("jsp/register-error.jsp");
	    }
	}}
