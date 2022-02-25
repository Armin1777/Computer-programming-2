//ARMENIUS II DOLORES BSIT I__ ssu-bc
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	  Scanner x= new Scanner(System.in);	
		
		System.out.print("Input first word: ");
		String one= x.nextLine();
		System.out.print("Input second word: ");
		String two= x.nextLine();
		one= one.toLowerCase();
		two= two.toLowerCase();
		System.out.println();
		
		if(one.length() == two.length()) {
		char[] charArray1=one.toCharArray();
		Arrays.sort(charArray1);
        char[] charArray2=two.toCharArray();
        Arrays.sort(charArray2);
            
        boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(one + " and " + two + " are anagram.");
      }
      else {
        System.out.println(one+ " and " +two+ " are not anagram.");
      }
    }
    else {
      System.out.println(one+ " and " +two+ " are not anagram.");
    }
  }
		}
