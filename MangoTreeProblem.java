import java.util.Scanner;

public class MangoTreeProblem {


    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.println("You are designing Dora's Garden!");
		
		System.out.println("How many rows of mangoes do you like to have?");
		int rowsInGarden = scan.nextInt();
		
		System.out.println("How many columns of mangoes do you like to have?");
		int columnsInGarden = scan.nextInt();
		
		System.out.println("Enter a Tree Number to check if it is Mango Tree !");
		int givenTree = scan.nextInt();
		
		
		if(givenTree < rowsInGarden * columnsInGarden) {
			
			if (givenTree < columnsInGarden || givenTree % columnsInGarden == 0 || givenTree % columnsInGarden == 1)
				System.out.println("Tree number " + givenTree + " is a Mango Tree!!!");
			else
				System.out.println("Looks like it is not a mango tree :( ");
			
		} else{
			
			System.out.println("There is no such tree in Dora's Garden :( ");
			
		}
    }
}
