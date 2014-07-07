package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Dao.contatoDao;
import br.com.modelo.Contato;

@WebServlet("/addContato")
public class contatoServlet extends HttpServlet {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest req ,HttpServletResponse res) {
	

	
	
	Contato contato = new Contato();
	
	contato.setNome(req.getParameter("nome"));
	contato.setEmail(req.getParameter("email"));
	contato.setEnd(req.getParameter("end"));
	contato.setDataNasc(Calendar.getInstance());
	
	System.out.print(contato.getEmail());
	
	contatoDao dao = new contatoDao();
	
        dao.adiciona(contato);
	
	req.setAttribute("menssagem", "Cadastrado Realizado com Sucesso!");
	
	RequestDispatcher rd = req
		    .getRequestDispatcher("index.jsp");
		try {
		    rd.forward(req,res);
		} catch (ServletException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
      }

}
