//ARMENIUS II DOLORES BSIT I__ ssu-bc
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		
		System.out.println("Enter your word here");
		 String name= a.nextLine();
		System.out.println();
				
		for(char b : name.toCharArray()){
		 if ( name.indexOf(b) == name.lastIndexOf(b)) {
		 System.out.println(b);
            break;
}
}
	}
}