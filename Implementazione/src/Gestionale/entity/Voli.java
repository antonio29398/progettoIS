package Gestionale.entity;



public class Voli {
	
	private int Idvolo;
	private int Idaereo;
	private int Giorno;
	private int OraArrivo;
	private int OraPartenza;
	private double Prezzo;
	private int BagagliBordoDispo = 50;
	private int BagagliStivaDispo = 100;

	 public Voli (int Idvolo,int Idaereo,int Giorno,int OraArrivo,int OraPartenza,double Prezzo,int BagagliBordoDispo,int BagagliStivaDispo) {
		 this.Idvolo =Idvolo;
		 this.Idaereo =Idaereo;
		 this.Giorno =Giorno;
		 this.OraArrivo =OraArrivo;
		 this.OraPartenza =OraPartenza;
		 this.Prezzo =Prezzo;
		 this.BagagliBordoDispo =BagagliBordoDispo;
		 this.BagagliStivaDispo =BagagliStivaDispo; 	 
	 }
	 
	 public int GetIdV (){
		 return this.Idvolo;
		 
	 }
	 
	 public int GetIdA (){
		 return this.Idaereo;
		 
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
	 
	 public double GetPrezzo (){
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
	 
	 public void SetIdA (int id){
		this.Idaereo = id;
		 
	 }
	 public void SetOrP (int Orap){
		  this.OraPartenza =Orap;
		 
	 }
	 
	 public void SetOrA (int OraA){
		  this.OraArrivo= OraA;
		 
	 }
	 
	 public void SetIGiorno (int Giorno){
		  this.Giorno = Giorno ;
		 
	 }
	 
	 public void SetIPrezzo (double Prezzo){
		  this.Prezzo = Prezzo;
		 
	 }
	 
	 

	 
	 
}