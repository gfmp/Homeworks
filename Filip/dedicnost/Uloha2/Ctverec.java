package Uloha2;

public class Ctverec extends Obdelnik {
	private int strana;
	
	public Ctverec(int strana){
		this.strana=strana;
	}
	
	@Override
	public int obvod(){
		int obvod = 4*strana;
		return obvod;
	}
	
	@Override	
	public int obsah(){
		int obsah;
		obsah = strana*strana;
		return obsah;
	}

	
	@Override
	public void info(){
		System.out.println("Strana je: " + strana + " obsah je: " + obsah()+ " obvod je: " + obvod());
	}


}
