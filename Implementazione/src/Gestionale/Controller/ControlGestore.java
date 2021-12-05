package Gestionale.Controller;


import Gestionale.entity.*;


import java.sql.SQLException;
import java.util.ArrayList;

import Gestionale.Database.*;


public class ControlGestore {
	private ArrayList<Compagnia> lista_compagnia = new ArrayList<Compagnia>();

	
	public ControlGestore() throws SQLException {

	}
	
	// AGGIUNGERE COMPAGNIA
		public boolean aggiungiCompagnia(Compagnia c){
			
			if(c.Nome.length()<=15 && c.GetId() <=9) {
			 if(c != null) {
					
				try {
					CompagniaDAO.RegistraCompagnia(c);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 return true;
			}
			return false;
}
		
	

		public void visualizzaCompagnia( ) {
			try {
				lista_compagnia = CompagniaDAO.readall();
				
				if(lista_compagnia ==null) {
					System.out.print("Nessun volo trovato");
				}
				else {
					for(int i =0; i <lista_compagnia.size();i++) {
						 System.out.println(lista_compagnia.get(i));
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
		
		
}