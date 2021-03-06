package Gestionale.entity;



public class Volo {
	
	private int Idvolo;
	private int Idaereo;
	private int IdTratta;
	private int Giorno;
	private int OraArrivo;
	private int OraPartenza;
	private int Prezzo;
	private int Nposti;
	private int BagagliBordoDispo = 50;
	private int BagagliStivaDispo = 100;

	
	 public Volo (int Idvolo,int idtratta,int Idaereo,int Giorno,int OraArrivo,int OraPartenza,int Prezzo,int BagagliBordoDispo,int BagagliStivaDispo, int Posti) {
		 this.Idvolo =Idvolo;
		 this.Idaereo =Idaereo;
		 this.IdTratta=idtratta;
		 this.Giorno =Giorno;
		 this.OraArrivo =OraArrivo;
		 this.OraPartenza =OraPartenza;
		 this.Prezzo =Prezzo;
		 this.Nposti=Posti;
		 this.BagagliBordoDispo =BagagliBordoDispo;
		 this.BagagliStivaDispo =BagagliStivaDispo; 	 
	 }
	 
	 public int GetIdV (){
		 return this.Idvolo;
		 
	 }
	 
	 public int GetIdA (){
		 return this.Idaereo;
		 
	 }
	 
	 public int GetIdtratta (){
		 return this.IdTratta;
		 
	 }
	 
	 public int GetOrP (){
		 return this.OraPartenza;
		 
	 }
	 
	 public int GetOrA (){
		 return this.OraArrivo;
		 
	 }
	 
	 public int GetGiorno (){
		 return this.Giorno;
		 
	 }
	 
	 public int GetPosti() {
		 return this.Nposti;
	 }
	 
	 public int GetPrezzo (){
		 return this.Prezzo;
		 
	 }
	 
	 public int GetStiva() {
		 return this.BagagliStivaDispo;
	 }
	 

	 public int GetBordo() {
		 return this.BagagliBordoDispo;

	 }
	 
	 
	 
	 public void SetIdV (int id){
		 this.Idvolo = id;
		 
	 }
	 
	 public void SetIdT (int id){
		 this.IdTratta = id;
		 
	 }
	 
	 public void SetIdA (int id){
		this.Idaereo = id;
		 
	 }
	 public void SetOrP (int Orap){
		  this.OraPartenza =Orap;
		 
	 }
	 
	 public void SetPosti (int Posti){
		  this.Nposti =Posti;
		 
	 }
	 
	 public void SetOrA (int OraA){
		  this.OraArrivo= OraA;
		 
	 }
	 
	 public void SetIGiorno (int Giorno){
		  this.Giorno = Giorno ;
		 
	 }
	 
	 public void SetIPrezzo (int Prezzo){
		  this.Prezzo = Prezzo;
		 
	 }
	 
		public String toString(){
			StringBuffer buf = new StringBuffer();
			
			buf.append("ID: "+Idvolo+" ORA DI ARRIVO: "+OraArrivo+" ORA DI PARTENZA: "+OraPartenza+" PREZZO: "+Prezzo+" GIORNO: "+Giorno+" POSTI: "+Nposti+" \n");
			return buf.toString();
		}

	 
	 
}