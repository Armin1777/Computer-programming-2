import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("WELCOME! What is your order?");
		System.out.println();
		String candy[]= {"sneakers",
		"goyagoya", "cadbury x", "cloudnine", "twix special", "ferrero roche +"};
		double price[]= {1.50, 0.99, 1.70, 1.50, 1.99,2.00};
		
		System.out.println(candy[0] + "\t " + "$ " +price[0]);
		System.out.println(candy[1] + "\t " + "$ " +price[1]);
		System.out.println(candy[2] + "\t " + "$ " +price[2]);
		System.out.println(candy[3] + "\t " + "$ " +price[3]);
		System.out.println(candy[4] + "\t " + "$ " +price[4]);
		System.out.println(candy[5] + "\t " + "$ " +price[5]);
		System.out.println();
		System.out.print("Enter here ::\t");
		String name= x.nextLine();
		System.out.print("Enter quantity ::\t");
		int quantity= x.nextInt();
		System.out.print("Pay here maam/sir :: $\t");
		double money= x.nextDouble();
			
	if(quantity >= 0 && quantity <= 50){
		if(name.equalsIgnoreCase("sneakers")){
			double b= (double) quantity;
			double c= b * price[0];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "$\t" +c);
			System.out.println("Change ::\t " + "$\t" +d);;
	}else if(name.equalsIgnoreCase("goya")){
			double b= (double) quantity;
			double c= b * price[1];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "$\t" +c);
			System.out.println("Change ::\t " + "$\t" +d);;
	}else if(name.equalsIgnoreCase("cadbury")){
			double b= (double) quantity;
			double c= b * price[2];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "$\t" +c);
			System.out.println("Change ::\t " + "$\t" +d);;
	}else if(name.equalsIgnoreCase("cloudnine")){
			double b= (double) quantity;
			double c= b * price[3];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "$\t" +c);
			System.out.println("Change ::\t " + "$\t" +d);;
	}else if(name.equalsIgnoreCase("twix")){
			double b= (double) quantity;
			double c= b * price[4];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "$\t" +c);
			System.out.println("Change ::\t " + "$\t" +d);;
	}else if(name.equalsIgnoreCase("ferrero roche")){
			double b= (double) quantity;
			double c= b * price[0];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "$\t" +c);
			System.out.println("Change ::\t " + "$\t" +d);
	}else System.out.println("try again");
	}
	}
}

