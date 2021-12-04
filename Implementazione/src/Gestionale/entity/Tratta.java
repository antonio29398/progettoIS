package Gestionale.entity;

public class Tratta {
	
	private int ID;
	public int BigliettiVenduti;
	public String AeroportoPar;
	public String AeroportoArr;
	public int Durata;
	
	public int getID(){
		return this.ID;
	}
	
	public void setID(int id){
		this.ID = id;
	}

}
