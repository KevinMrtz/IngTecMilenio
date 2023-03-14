package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.opTriangulo;

@WebServlet(name = "/showResult", urlPatterns = {"/showResult"})
public class showResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void proccesRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-98");
    	String xBase = request.getParameter("Base");
    	String xAltura = request.getParameter("Altura");
    	opTriangulo r = new opTriangulo(xAltura, xBase);
    	
    	r.Area();
    	r.Perimetro();
    	
    	request.setAttribute("rTrianguloResult", r);
    	request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	proccesRequest(request, response);
	}
    
    @Override
    public String getServletInfo() {
    	return "Area y Perimetro.";
    }
}
