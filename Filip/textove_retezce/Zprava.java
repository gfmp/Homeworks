
import java.util.Scanner;


public class Zprava {
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.println(" min. d�lku " );
		n =sc.nextInt();
		System.out.println("Napi�te text o min. d�lce " + n + "znak�: ");
		s =sc.nextLine();
		if(s.length()<=n){
			System.out.println("Moc kr�tk� text!!!!!");
		}
		else{
			for(int i =0; i<n;i++){
				int a = s.length()-i -1;
				System.out.println("znak na " + a + " pozici je " + s.charAt(a));
			}
		}
	}
}

