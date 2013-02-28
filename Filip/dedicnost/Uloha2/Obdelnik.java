package Uloha2;

public class Obdelnik {
private int sirka;
private int delka;


	public Obdelnik(){
		this.sirka=20;
		this.delka=30;
	}


	public Obdelnik(int sirka, int delka){
		this.sirka=sirka;
		this.delka=delka;
	}

	//metody
	
	public int obvod(){
	int obvod = 2*sirka + 2*delka;
	return obvod;
	}
	
	public int obsah(){
		int obsah;
		obsah = sirka*delka;
		return obsah;
	}
	
	
	public void info(){
		System.out.println("Delka je: " + delka + " sirka je: " + sirka  +" obsah je: " + obsah()+ " obvod je: " + obvod());
	}
	
}
