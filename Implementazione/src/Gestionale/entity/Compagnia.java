package Gestionale.entity;

public class Compagnia {

	private int Id;
	public String Nome;
	
	
	public Compagnia(String nome, int id) {
		
		this.Id = id;
		this.Nome= nome;
	}
	
	
	
	public int GetId (){
		 return this.Id;
		 
	 }
	
	
	public void SetId(int id) {
		
		this.Id = id;
	}
	
	
	
	
	
	
}
