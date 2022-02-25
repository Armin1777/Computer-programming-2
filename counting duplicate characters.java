//armenius II Dolores bsit 1 ssubc
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		
		System.out.println("Enter word/s...");
		String word=x.nextLine();
		System.out.println();
		int count=1;
		for(int y=0; y<word.length(); y++){
			//input the letter you want to detect
			if(word.charAt(y)== 'b'){
				int a=(int) y;
				a= (int) count;
				count++;
				System.out.println("there are " + a);
				
			}
		}
				
	}
}
	

