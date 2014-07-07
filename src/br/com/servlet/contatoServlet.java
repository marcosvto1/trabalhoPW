package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addContato")
public class contatoServlet extends HttpServlet {
    
    protected void service(HttpServletRequest req ,HttpServletResponse res) throws IOException{
	
	PrintWriter out = res.getWriter();
	
	
	
	
    }

}
