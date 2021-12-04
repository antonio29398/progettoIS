package Gestionale.entity;

public class Biglietti {

	private int Id;
	private int Ora;
	private int Giorno;
	
	
	
	public Biglietti(int Id,int Ora, int Giorno) {
		this.Id = Id;
		this.Ora= Ora;
		this.Giorno = Giorno;
		
		
	}
	
	
	public int GetId () {
		
		return this.Id;
		
	}
	
	
	public int GetOra () {
		
		return this.Ora;
		
	}
	
	public int GetGiorno () {
		
		return this.Giorno;
		
	}
	
	public void SetOra (int ora) {
		
		 this.Ora = ora;
		
	}
	
	public void SetGiorno (int giorno) {
		
		 this.Giorno = giorno;
		
	}
	
}
