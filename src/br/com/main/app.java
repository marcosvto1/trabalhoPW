package br.com.main;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.conexao.ConnectionFactory;

public class app {

    public static void main(String[] args) throws SQLException {
	// TODO Auto-generated method stub

	
	Connection con = new ConnectionFactory().getConnection();
	//JOptionPane.showMessageDialog(null,"ola munbd");
	con.close();
	
	
    }

}
