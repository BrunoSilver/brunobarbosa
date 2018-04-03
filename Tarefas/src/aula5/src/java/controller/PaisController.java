package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Pais;
import service.PaisService;


       @WebServlet("/PaisController.do")
public class PaisController extends HttpServlet {
	
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int pId = Integer.parseInt(request.getParameter("id"));
        String pNome = request.getParameter("nome");
        long pPopulacao = Long.parseLong(request.getParameter("populacao"));
        double pArea = Double.parseDouble(request.getParameter("area"));
        
        Pais pais = new Pais(pId, pNome, pPopulacao, pArea);
        
        //instanciar o service
        PaisService ps = new PaisService();
        ps.criar(pais);
        pais = ps.Consultar();
        
        //enviar para o jsp
        request.setAttribute("Pais", pais);
        
        RequestDispatcher view = 
        request.getRequestDispatcher("pais.jsp");
        view.forward(request, response);
        
} 

}