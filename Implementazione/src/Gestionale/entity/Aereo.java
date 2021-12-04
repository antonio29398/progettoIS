package Gestionale.entity;

public class Aereo extends Compagnia {
	
	private int IdA;
	private int Nposti;
	
	
	
	public Aereo(String nome, int id, int idA, int Posti) {
		super(nome, id);
		this.IdA = idA;
		this.Nposti = Posti;
		
	}
	
	public int GetIdA () {
		
		return this.IdA;
		
	}
	
	public int GetPosti () {
		
		return this.Nposti;
		
	}

}
