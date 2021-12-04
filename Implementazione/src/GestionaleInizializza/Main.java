package GestionaleInizializza;



import java.sql.SQLException;


import Gestionale.entity.*;
import Gestionale.Controller.*;
import Gestionale.Database.*;


public class Main {
	
	static ControlUtente controlUtente = null;

	public static void main(String[] args) {

		Volo volo = null;
		Volo volo1 = null;
		Volo volo2 = null;
		
		try {
			
			int Idvolo = 1;
			int Idaereo = 1;
			int Giorno = 12122012 ;
			int OraArrivo = 2030;
			int OraPartenza = 1900;
			int Prezzo = 600;
			int Posti = 100;
			int BagagliBordoDispo = 200;
			int BagagliStivaDispo = 300;
			
			volo = new Volo( Idvolo,Idaereo,Giorno,OraArrivo,OraPartenza,Prezzo,BagagliBordoDispo,BagagliStivaDispo,Posti);
		
		
		
			

			 Idvolo = 2;
			 Idaereo = 2;
			 Giorno = 12122012 ;
			 OraArrivo = 1930;
			 OraPartenza = 1900;
			 Prezzo = 600;
			 Posti = 1300;
			 BagagliBordoDispo = 200;
			 BagagliStivaDispo = 300;
			
			volo1 = new Volo( Idvolo,Idaereo,Giorno,OraArrivo,OraPartenza,Prezzo,BagagliBordoDispo,BagagliStivaDispo,Posti);
		
		
			
			 Idvolo = 3;
			 Idaereo = 3;
			 Giorno = 21022021;
			 OraArrivo = 2100;
			 OraPartenza = 1500;
			 Prezzo = 1600;
			 Posti = 1300;
			 BagagliBordoDispo = 200;
			 BagagliStivaDispo = 300;
			
			volo2 = new Volo( Idvolo,Idaereo,Giorno,OraArrivo,OraPartenza,Prezzo,BagagliBordoDispo,BagagliStivaDispo,Posti);
		
		
			
			
		
		
			controlUtente.AggiungiVolo(volo);
			controlUtente.AggiungiVolo(volo1);
			controlUtente.AggiungiVolo(volo2);
						
			

		} catch (SQLException e) {

			System.out.println("Errore accesso DB");

			e.printStackTrace();
		
			System.exit(1);
		}
	
	
		
	}

}

