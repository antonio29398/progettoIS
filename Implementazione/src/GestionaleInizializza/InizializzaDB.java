package GestionaleInizializza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Gestionale.Database.*;

public class InizializzaDB {
	
	public static void main(String[] args) {
		try {
					
					Connection conn = DBManager.getConnection();
					
					String query;
					
					query = "CREATE TABLE VOLI("
							+" IDVOLO INT NOT NULL ,"
							+" IDAEROPORTO INT  ,"
							+" IDTRATTA INT  ,"
							+" ORARIOARRIVO INT,"
							+" ORARIOPARTENZA INT,"
							+" GIORNO INT,"
							+" BAGAGLIBORDO INT,"
							+" BAGAGLISTIVA INT,"
							+" PREZZO INT,"
							+" POSTI INT"
							+");";
					
					try(PreparedStatement stmt = conn.prepareStatement(query)) {
						
						stmt.executeUpdate();
					}
					
					
					query = "CREATE TABLE COMPAGNIAAEREA("
							+" ID INT NOT NULL ,"
							+" NOME VARCHAR(15)"
							+");";
							
					
					
					try(PreparedStatement stmt = conn.prepareStatement(query)) {
						
						stmt.executeUpdate();
					}
					
					
					
					System.out.println("Inizializzazione DB completata.");
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}



