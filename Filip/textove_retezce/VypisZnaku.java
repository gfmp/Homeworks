
public class VypisZnaku {
	public static void main(String[] args){
		char c ='\u0041';
		System.out.println("Váš znak je: " + c);
		
		for(int i = 0; i<50; i++){
			c++;
			System.out.println("Váš znak je: " + c);
		}
	}

}
