import java.util.Scanner;


public class PocetZnaku {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pocetMezer=0;
		int pocetZnaku=0;
		int pocetNumerickych=0;
		String s;
		
		System.out.println("Napište text: ");
		s =sc.nextLine();
		
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i)==' '){	
				pocetMezer++;
			}
			
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'z' ){
				pocetZnaku++;
			}
			if(s.charAt(i) >='0'&& s.charAt(i) <='9' ){
				pocetNumerickych++;
			}
		}
		
		System.out.println("Poèet mezer je: " + pocetMezer +" Poèet alfabetických znakù je: " + pocetZnaku +"Poèet numerických znakl je: " + pocetNumerickych);


		
	}
}
