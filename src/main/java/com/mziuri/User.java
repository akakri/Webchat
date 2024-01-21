package com.mziuri;

import database.Databasehandler;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


@WebServlet("/message")
public class User extends HttpServlet {
    private String username;
    private String password;
    private Databasehandler dat = new Databasehandler();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userr = req.getParameter("username");
        setUsername(userr);
        String pass = req.getParameter("password");
        setPassword(pass);
        resp.setContentType("text/html");


        try {
            if (dat.validLogin(userr, pass)) {
                ArrayList<String> arr = dat.receiveMessage(this.username);
                if(arr.size()==0){
                    resp.getWriter().write("<p> NO MESSAGES RECEIVED </p>");
                }else{
                    for(String a : arr){
                        req.setAttribute("messages",arr);
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usernam = req.getParameter("usernam");
        String message = req.getParameter("message");
        dat.sendMessage(usernam, message);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req,resp);
    }
}
