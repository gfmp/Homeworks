import java.util.Scanner;


public class RozdelVetu {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		int slovo1 = 0;
		int slovo2 = 0;
		boolean mezera = false;
		
		System.out.println("Napište vìtu (zaènìte mezerou prosím!): ");
		s =sc.nextLine();
		for(int i =0; i<s.length(); i++){
			if(s.charAt(i) == ' '){
				mezera = !mezera;
				if(mezera == true){
					slovo1=i;
				}
				if(mezera == false){
					slovo2=i;
				}
				s.substring(slovo1, slovo2);
			}
		}
	}
}
