package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/questionnaire")
public class QuestionnaireController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String view = "/WEB-INF/views/questionnaire.jsp";
        request.getRequestDispatcher(view).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // フォームから送信されたデータを取得
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String feedback = request.getParameter("feedback");

        // 取得したデータをリクエスト属性として設定
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("feedback", feedback);

        // confirm.jsp にリダイレクト
        String view = "/WEB-INF/views/confirm.jsp";
        request.getRequestDispatcher(view).forward(request, response);
    }
}