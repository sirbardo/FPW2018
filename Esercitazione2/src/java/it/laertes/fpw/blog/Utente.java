/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.laertes.fpw.blog;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author bardoz
 */
public class Utente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session = request.getSession(false);

            if (session == null) 
            {
                //Se non c'è la sessione
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            else if (session.getAttribute("loggedIn") != null &&
                     !session.getAttribute("loggedIn").equals(true))
            {
                //loggedIn non vale true
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            else if (session.getAttribute("loggedIn") == null)
            {
                //non c'è loggedIn
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            
            
            UserFactory userFactory = UserFactory.getInstance();

            int idUtente = (int)session.getAttribute("userId");
            User user = userFactory.getUserById(idUtente);

            String name = user.getName();
            String surname = user.getSurname();
            String email = user.getEmail();

            request.setAttribute("name", name);
            request.setAttribute("surname", surname);
            request.setAttribute("email", email);

            request.getRequestDispatcher("utente.jsp").forward(request, response);
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
