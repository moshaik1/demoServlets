package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "PracticeServlet", urlPatterns = "/PracticeServlet")
public class PracticeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("the GET request has been made to /PracticeServlet");

        response.setContentType("text/html");

        response.getWriter().println("<h1> WELCOME GUYS!!!</h1>");
        response.getWriter().println("<h3> My Name is Mohsin Shaik </h3>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("the Post request has been made to /PracticeServlet");



    }
}
