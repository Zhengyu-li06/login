package jp.co.aforce.jsp;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        System.out.println("Session ID: " + session.getId());
        System.out.println("Client Attribute: " + session.getAttribute("client"));
        
        if (session.getAttribute("client") != null) { 
            session.invalidate();
            response.sendRedirect("jsp/logout-out.jsp");
        } else {
            response.sendRedirect("jsp/logout-error.jsp");
        }
    }
}
