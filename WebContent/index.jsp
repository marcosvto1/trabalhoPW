<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
             <li><a href="mostrar.jsp">Listar</a></li>
        </ul>
   </div>
   
    <div id="conteudo">
    
           <div class="box-form">
                    <strong>Sistema de Contatos</strong><hr/>
                    <br/>
                <form action="addContato">                
                    Nome:<input type="text" name="nome"><br/>
                    Email:<input type="text" name="nome"><br/>
                    Endereço:<input type="text" name="nome"><br/>
                    Date Nascimento:<input type="date" name="nome"><br/>
                    <input type="submit" name="nome" value="Salvar"><br/>
                
                
                </form>
           
           </div>
           
   
   </div>



</body>
</html>