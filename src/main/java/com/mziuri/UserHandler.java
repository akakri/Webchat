package com.mziuri;

import database.Databasehandler;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/register")
public class UserHandler extends HttpServlet {
    private Databasehandler dat = new Databasehandler();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String usern = req.getParameter("usern");
        String pas = req.getParameter("pas");
        resp.setContentType("text/html");
        if(!dat.register(usern,pas)){
            req.setAttribute("message", "Failed to register");
        }else{
            req.setAttribute("message", "Successfully registered");
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req,resp);
    }
}
