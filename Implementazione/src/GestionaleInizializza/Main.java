package GestionaleInizializza;



import java.sql.SQLException;


import Gestionale.entity.*;


public class Main {

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
		
		
			
			
		
		
			gestioneelaborati.aggiuntaElaboratoDocente(elaborato1);
			gestioneelaborati.aggiuntaElaboratoDocente(elaborato2);
			gestioneelaborati.aggiuntaElaboratoDocente(elaborato3);
			gestioneelaborati.aggiuntaElaboratoDocente(elaborato4);
		
			ElaboratoInserito[] preferenzeMie = new ElaboratoInserito[3];
			preferenzeMie[0] = elaborato2;
			preferenzeMie[1] = elaborato3;
			preferenzeMie[2] = elaborato4;
			
			Domanda domandaMia = new Domanda(preferenzeMie);
			
			
			
			Studente studenteIo = new Studente(120,"N46003747",domandaMia,null);
			
			if(gestioneelaborati.richiestaAssegnazioneElaborato(studenteIo, gestioneelaborati.lista_elaborati)){
				System.out.println("Assegnazione andata a buon fine");
			}
			else {
				System.out.println("Richiesta respinta");
			}
			
			
			System.out.println(studenteIo.getElaboratoStudente().getNomeElaborato());
			
		
			
			
			

		} catch (SQLException e) {

			System.out.println("Errore accesso DB");

			e.printStackTrace();
		
			System.exit(1);
		}
	
	
		
	}

}

