package Gestionale.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Gestionale.entity.*;









public class VoliDAO {


	public static void RegistraVolo(Volo volo) throws SQLException {
		
		Connection conn = DBManager.getConnection();
		
		String query = "INSERT INTO VOLI VALUES(?,?,?,?,?,?,?,?,?);";
		
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
			
			stmt.setInt(1, volo.GetIdV());
			stmt.setInt(2, volo.GetIdA());
			stmt.setInt(3, volo.GetOrA());
			stmt.setInt(4, volo.GetOrP());
			stmt.setInt(5, volo.GetGiorno());
			stmt.setInt(6, volo.GetPrezzo());
			stmt.setInt(7, volo.GetBordo());
			stmt.setInt(8, volo.GetStiva());
			stmt.setInt(9, volo.GetPosti());
			
			
			stmt.executeUpdate();
		}
		
	}
	
	
	
	
	public static  Volo GetVolo(int Idvolo) throws SQLException {
	
		
		Volo volo = null;
		Connection conn = DBManager.getConnection();
	
		String query = "SELECT IDVOLO,ORARIOARRIVO,ORARIOPARTENZA,PREZZO,GIORNO,POSTI FROM VOLI WHERE IDVOLO=?;";
	
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
			
			stmt.setInt(1, Idvolo);
			
			
			try(ResultSet result = stmt.executeQuery()) {
				
				if(result.next()) {
				
				int id =result.getInt(1);
				int OraArrivo = result.getInt(2);
				int OraParte =result.getInt(3);
				int Prezzo = result.getInt(4);
				int Giorni =result.getInt(5);
				int Posti = result.getInt(6);
				
				volo = new Volo(id,0,Giorni,OraArrivo,OraParte,Prezzo,0,0,Posti);
				
				}
			}
	
			
			
		}
		return volo;
	}
 
	
	
	
	

	
	public static ArrayList<Volo>  GetVoli(int Idtratta, int Giorno, int OraPartenza) throws SQLException {
		
		ArrayList<Volo> listaVoli = new ArrayList<Volo>();
		
		Connection conn = DBManager.getConnection();
		
		String query = "SELECT IDVOLO,ORARIOARRIVO,ORARIOPARTENZA,PREZZO,GIORNO,POSTI FROM VOLI WHERE IDTRATTA=?,GIORNO=?,ORARIOPARTENZA=?; ";
		
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
						
			stmt.setInt(1, Idtratta);
			stmt.setInt(2, OraPartenza);
			stmt.setInt(3, Giorno);
			
			try(ResultSet result = stmt.executeQuery()) {
				
				while(result.next()) {
					
					int id =result.getInt(1);
					int OraArrivo = result.getInt(2);
					int OraParte =result.getInt(3);
					int Prezzo = result.getInt(4);
					int Giorni =result.getInt(5);
					int Posti = result.getInt(6);
					
					Volo volo = new Volo(id,0,Giorni,OraArrivo,OraParte,Prezzo,0,0,Posti);
										
					
					
					listaVoli.add(volo);
				}
		
			}
		}
		return listaVoli;
		
	}		
		
		
		
	public static ArrayList<Volo>  readall() throws SQLException {
		
		ArrayList<Volo> listaVoli = new ArrayList<Volo>();
		
		Connection conn = DBManager.getConnection();
		
		String query = "SELECT IDVOLO,ORARIOARRIVO,ORARIOPARTENZA,GIORNO,PREZZO,POSTI FROM VOLI;";
		
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
					
			try(ResultSet result = stmt.executeQuery()) {
				
				while(result.next()) {
					
					int id =result.getInt(1);
					int OraArrivo = result.getInt(2);
					int OraParte =result.getInt(3);
					int Giorni =result.getInt(4);
					int Prezzo = result.getInt(5);
					int Posti = result.getInt(6);
					
					
					
					Volo volo = new Volo(id,0,Giorni,OraArrivo,OraParte,Prezzo,0,0,Posti);
										
					
					
					listaVoli.add(volo);
				}
		
			}
		}
		return listaVoli;
		
	}		
		
	
			
			
			
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	

