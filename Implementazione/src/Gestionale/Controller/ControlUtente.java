package Gestionale.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import Gestionale.Database.*;
import Gestionale.entity.*;



public class ControlUtente {
	
	
	public ArrayList<Volo> lista_voli;
public ControlUtente() throws SQLException {
		
		 lista_voli= VoliDAO.readall();

	}

	public boolean  visualizzaVoli(int Idtratta,int Giorno, int OraPartenza) {
		
		if(Idtratta<=6 && Giorno ==8 && OraPartenza ==4) {
		try {
			lista_voli = VoliDAO.GetVoli(Idtratta, Giorno, OraPartenza);
			
			if(lista_voli ==null) {
				System.out.print("Nessun volo trovato");
			}
			else {
				for(int i =0; i <lista_voli.size();i++) {
					 System.out.println(lista_voli.get(i));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		}
		return false;
	}

	 public void AggiungiVolo(Volo volo) throws SQLException{
		 if(volo != null) {
				lista_voli.add(volo); 
		 }
			
		 VoliDAO.RegistraVolo(volo);
		 
	 }
	
	
	
}
