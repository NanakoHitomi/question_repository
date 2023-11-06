package controller;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/confirm")
public class ConfirmController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 受付番号の発行
        String uuid = UUID.randomUUID().toString();
        
        // 発行した受付番号ををリクエスト属性として設定
        request.setAttribute("uuid", uuid);

        // thanks.jsp にリダイレクト
        String view = "/WEB-INF/views/thanks.jsp";
        request.getRequestDispatcher(view).forward(request, response);
    }
}