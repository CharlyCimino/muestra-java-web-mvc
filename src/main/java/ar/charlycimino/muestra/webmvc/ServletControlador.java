/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ar.charlycimino.muestra.webmvc;

import ar.charlycimino.muestra.webmvc.modelo.PersonaBean;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
@WebServlet(name = "ServletControlador", urlPatterns = {"/servlet-controlador"})
public class ServletControlador extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            // Procesar los parámetros
            String nom = request.getParameter("nombre");
            String ape = request.getParameter("apellido");
            String nac = request.getParameter("nacimiento");
            
            // Instanciar los JavaBeans que correspondan
            PersonaBean persona = new PersonaBean(nom, ape, nac);

            // Agregar el/los JavaBeans a algún scope
            request.setAttribute("laPersona", persona);

            // Redireccionar        
            RequestDispatcher rd = request.getRequestDispatcher("vistas/saludo.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            // Redireccionar        
            e.printStackTrace();
            request.setAttribute("msjDeError", e.getMessage());
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/errorHandler.jsp");
            rd.forward(request, response);
        }

    }

}
