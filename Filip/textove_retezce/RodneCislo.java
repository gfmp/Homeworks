import java.util.Scanner;


public class RodneCislo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		Boolean format = true;
		Boolean woman = false;
		
		System.out.println("Napi�te rodn� ��slo: ");
		s =sc.nextLine();
		for(int i=0; i<s.length();i++){
			char a = s.charAt(i);
			if(s.length()==10||s.length()==11){
			if((i<6 || i>6)){
				if(a >='0'&& a <='9'){
				}
				else{
					format=false;
					System.out.println("�patn� form�t!! ");
				}
			}
			if(i==6){
				if(a =='/'){
				}
				else{
					format=false;
					System.out.println("�patn� form�t!! ");
				}
			}
			}
			else{
				format=false;
				System.out.println("�patn� form�t!! ");
			}

						
		}
		
		if(format==true){
			char mesic = s.charAt(2);
				if(s.charAt(2)>1&&s.charAt(2)<7){
					woman = true;
					if(s.charAt(2)==6){
					mesic = '1';
					}
					else{
						mesic = '0';

					}
				}
			System.out.println("Datum narozen� osoby je " + s.charAt(4) + s.charAt(5) + "." + mesic + s.charAt(3) + ".19" + s.charAt(0) + s.charAt(1));
			if(woman == true){
				System.out.println("Dan� osoba je �ena");
			}
			
			if(woman == false){
				System.out.println("Dan� osoba je mu�");
				
				
			}

		}
	}
}
