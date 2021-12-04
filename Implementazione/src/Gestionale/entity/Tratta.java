package Gestionale.entity;

public class Tratta {
	
	private int ID;
	public int BigliettiVenduti;
	public String AeroportoPar;
	public String AeroportoArr;
	public int Durata;
	
	public Tratta (int id, int venduti, String partenza, String arrivo, int durata){
		this.ID = id;
		this.BigliettiVenduti = venduti;
		this.AeroportoPar = partenza;
		this.AeroportoArr = arrivo;
		this.Durata = durata;
	}
	public int getID(){
		return this.ID;
	}
	
	public void setID(int id){
		this.ID = id;
	}

}
