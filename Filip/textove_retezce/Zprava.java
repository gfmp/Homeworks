
import java.util.Scanner;


public class Zprava {
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.println(" min. délku " );
		n =sc.nextInt();
		System.out.println("Napište text o min. délce " + n + "znakù: ");
		s =sc.nextLine();
		if(s.length()<=n){
			System.out.println("Moc krátký text!!!!!");
		}
		else{
			for(int i =0; i<n;i++){
				int a = s.length()-i -1;
				System.out.println("znak na " + a + " pozici je " + s.charAt(a));
			}
		}
	}
}

