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
public class Login extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            
            HttpSession session = request.getSession();

            if (request.getParameter("logout") != null)
            {
                session.invalidate();
                request.getRequestDispatcher("login.jsp").forward(request, response);
                return;
            }
            
            //Utente Loggato
            if (session.getAttribute("loggedIn") != null &&
                session.getAttribute("loggedIn").equals(true))
            {
                request.getRequestDispatcher("Utente").forward(request, response);
                return;
            }
            else //Utente non loggato
            {
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                UserFactory factory = UserFactory.getInstance();
                
                for (User user : factory.getUsers())
                {
                    System.out.println(user.getId());
                    System.out.println(user.getName());
                }
                
                if (email != null &&
                    password != null &&
                    factory.login(email, password)
                    )
                {
                    //email e password esistono e sono validi:
                    int userId = factory.getUserByEmail(email).getId();
                    session.setAttribute("userId", userId);
                    session.setAttribute("loggedIn", true);
                    
                    request.getRequestDispatcher("Utente").forward(request, response);
                    return;
                }
                else if(email != null &&
                        password != null)
                {
                    request.setAttribute("invalidData", true);
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                    return;
                }
            }
            

            request.getRequestDispatcher("login.jsp").forward(request, response);
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
