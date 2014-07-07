<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,br.com.Dao.contatoDao,br.com.modelo.Contato,java.sql.SQLException;" %> 


    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href="css/style.css" rel="stylesheet" type="text/css"/>
<title>Insert title here</title>

</head>
<body>

   <div id="topo">  
          
        <ul id="menu">
             <li><a href="index.jsp">Cadastro</a></li>
             <li><a href="Listar.jsp">Listar</a></li>
        </ul>
   </div>
   
    <div id="conteudo">
    
           <div class="box-form-list">
                    <strong>Lista de Contatos</strong><hr/>
                    <br/>
                <%
			        // Contato c = new Contato();
                     contatoDao dao  = new contatoDao();
                     List<Contato> contatos = dao.getLista();
				%>
     
                     
                 
                    <table id="box-table-a">
                        <thead>
                          <tr>
                              <th> Nome </th>
                              <th> Email </th>
                              <th> Endereço</th>
                              <th> Data de Nascimento</th>
                          </tr>                 
                        </thead>
                    
                    <% for(Contato contato : contatos ){ %>
                       
							<tr> 
							    <td><%= contato.getNome()%> </td>				
							    <td><%= contato.getEmail()%> </td>
							    <td><%= contato.getEnd() %> </td>	
							    <td><%= contato.getDataNasc().getTime()%> </td>		
							</tr>
					
                  		   
						
					   <%  } %>  
                       

                    
                    
                    </table>
           
           </div>
           
   
   </div>



</body>
</html>