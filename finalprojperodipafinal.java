package Garcia;
import java.util.Scanner;
public class finalprojperodipafinal {
	
	public static Scanner input = new Scanner (System.in);
	public static Scanner cloth = new Scanner (System.in);
	public static Scanner sc = new Scanner (System.in);
	public static Scanner dc = new Scanner (System.in);
	public static String [] Sequence = new String[100];
	public static String [] Option = new String[100];
	
	public static String fullname;
	public static String address;
	public static char choose;
	
	public static int clothesSEC = 0, bagSEC = 0, shoesSEC = 0, num = 0, j = 0, prefAPPA;
	public static int selectSEC = 0, quantity = 0;
	public static int clothesSIZE = 0, bagSIZE = 0, shoesSIZE = 0;
	public static int coatAPPA, shirtAPPA, shortsAPPA, jeansAPPA;
	public static double total = 0;
	
	public static String[] clothes = {"Coat", "Shirt", "Shorts", "Jeans"};
	public static String[] bags = {"GymBag", "TravelBag", "OfficeBag", "Backpack"};
	public static String[] shoes = {"RunningShoes", "FormalShoes", "Sandals", "Sneakers"};

	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!!!--WELCOME TO DASHOP GARYOPhehe--!!!!!!!!!!");
		System.out.println();
		
		do {
			do {
				do {
					System.out.println("[1] Clothes [2] Bags [3] Shoes [0] Exit");
					prefAPPA = input.nextInt();
				}
				while (prefAPPA > 2);
				if (prefAPPA == 1) {
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!CLOTHES!!!!!!!!!!!!!!!!!!!!!!!!!!");
					do {
						System.out.println("============================================================");
						System.out.println("                       CLOTHES SECTION:                     ");
						System.out.println("[1] Coat                                                    ");
						System.out.println("[2] Shirt                                                   ");
						System.out.println("[3] Shorts                                                  ");
						System.out.println("[4] Jeans                                                   ");
						System.out.println("[0] Back                                                    ");
						System.out.println("============================================================");
						System.out.print("Please select the apparel that you want: ");
						clothesSEC = input.nextInt();
						System.out.println("============================================================");
						
						if (clothesSEC == 1) {
							System.out.println("============================================================");
							System.out.println("[1] Duffle Coat                                    ₱1,499 ||");
							System.out.println("[2] Trench Coat                                    ₱1,899 ||");
							System.out.println("[3] Winter Coat                                    ₱2,099 ||");
							System.out.println("[4] Fur Coat                                       ₱2,499 ||");
							System.out.println("[0] Back                                                  ||");
							System.out.println("============================================================");
							System.out.print("Please pick a coat of your choice: ");
							coatAPPA = input.nextInt();
							System.out.println("============================================================");
							
							if (coatAPPA == 1) {
								System.out.print("How many? ");
							    quantity = cloth.nextInt();
							    total = quantity * 1499;
							}
							else if (coatAPPA == 2) {
								System.out.print("How many? ");
							    quantity = cloth.nextInt();
							    total = quantity * 1899;
							}
							else if (coatAPPA == 3) {
								System.out.print("How many? ");
							    quantity = cloth.nextInt();
							    total = quantity * 2099;
							}
							else if (coatAPPA == 4) {
								System.out.print("How many? ");
							    quantity = cloth.nextInt();
							    total = quantity * 2499;
							}
							else if (coatAPPA > 4) {
								System.out.print("Sorry not availbale. Please select the item that is availble in the apparel. Thank you!");
							}
						}
						
						if (clothesSEC == 2) {
							System.out.println("============================================================");
							System.out.println("[1] Crewneck Shirt                                 ₱149   ||");
							System.out.println("[2] V-Neck Shirt                                   ₱149   ||");
							System.out.println("[3] Oversized Shirt                                ₱249   ||");
							System.out.println("[4] Muscle Shirt                                   ₱449   ||");
							System.out.println("[0] Back                                                  ||");
							System.out.println("============================================================");
							System.out.print("Please pick a coat of your choice: ");
							coatAPPA = input.nextInt();
							System.out.println("============================================================");
						}
						    if (coatAPPA == 1) {
							   System.out.print("How many? ");
						       quantity = cloth.nextInt();
						       total = quantity * 149;
						    }
						    else if (coatAPPA == 2) {
							   System.out.print("How many? ");
						       quantity = cloth.nextInt();
						       total = quantity * 149;
						    }
						    else if (coatAPPA == 3) {
							   System.out.print("How many? ");
						       quantity = cloth.nextInt();
						       total = quantity * 249;
						    }
						    else if (coatAPPA == 4) {
							   System.out.print("How many? ");
						       quantity = cloth.nextInt();
						       total = quantity * 449;
						    }
						    else if (coatAPPA > 4) {
							   System.out.print("Sorry not availbale. Please select the item that is availble in the apparel. Thank you!");
						    }
						if (coatAPPA == 3) {
							System.out.println("============================================================");
							System.out.println("[1] Crewneck Shorts                                ₱149   ||");
							System.out.println("[2] V-Neck Shorts                                  ₱149   ||");
							System.out.println("[3] Oversized Shirt                                ₱249   ||");
							System.out.println("[4] Muscle Shirt                                   ₱449   ||");
							System.out.println("[0] Back                                                  ||");
							System.out.println("============================================================");
							System.out.print("Please pick a coat of your choice: ");
							coatAPPA = input.nextInt();
							System.out.println("============================================================");
						}
					}
					while (prefAPPA > 4);
					
					if (prefAPPA != 0); {
						do {
							System.out.println("============================================================");
							System.out.println("[1] Small   ");
							System.out.println("[2] Meduim  ");
							System.out.println("[3] Large   ");
							System.out.println("[4] X-Large ");
							System.out.println("============================================================");
							System.out.print("Enter your preffered size here: ");
							clothesSIZE = input.nextInt();
							System.out.println("============================================================");
						}
						while ((clothesSIZE < 1) || (clothesSIZE > 4));
						Option[j] = clothes[clothesSEC];
						Sequence[num] = Option[j] +  "\t\t " + quantity +  "\t\t\t" + total +  "\t\t";
					}
				}
			}
			while ((clothesSEC == 0 && bagSEC == 0 && shoesSEC == 0));
		}
		while ((choose == 'Y') || (choose == 'y'));
			
		

}
}