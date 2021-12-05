package Gestionale.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Gestionale.entity.*;

public class CompagniaDAO {

public static void RegistraCompagnia(Compagnia c) throws SQLException {
		
		Connection conn = DBManager.getConnection();
		
		String query = "INSERT INTO COMPAGNIAAEREA VALUES(?,?);";
		
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
			
			stmt.setInt(1, c.GetId());
			stmt.setString(2, c.Nome);
			
			
			
			stmt.executeUpdate();
		}
	
	
}

public static ArrayList<Compagnia>  readall() throws SQLException {
	
	ArrayList<Compagnia> lista_compagnia = new ArrayList<Compagnia>();
	
	Connection conn = DBManager.getConnection();
	
	String query = "SELECT NOME,ID FROM COMPAGNIAAEREA;";
		
	try(PreparedStatement stmt = conn.prepareStatement(query)) {
				
		try(ResultSet result = stmt.executeQuery()) {
			
			while(result.next()) {
				String nome = result.getString(1);
				int id =result.getInt(2);
				
				
				
				//System.out.format("\t%d %s\n", id, nome);
				Compagnia c = new Compagnia(nome,id);
									
				
				
				lista_compagnia.add(c);
			}
	
		}
	}
	return lista_compagnia;
	
}		

}
