import java.util.Scanner;

public class Main {
	
	public static int champselect(String[] a) {
		return (int)(Math.random()* ((a.length)) );
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String[] jungle = {"Kayn", "Evelyn", "Elise", "NidaLee", };
		String[] midlane = {"Zoe", "Galio", "Twisted Fate"};
		String[] toplane = {"Darius", "Urgot", "Fiora"};
		String[] adc = {"Jhin", "Ezreal", "Kai'Sa"};
		String[] support = {"Senna", "Nautilus", "Swain"};
		/* int flag = 0;
		
		while (flag != 1) {
			System.out.println("Hi, I'm here to help you decided what champion to pick in League of Legends");
			System.out.println("What role do you want?");
			String role = scan.nextLine();
			
			if ( (role.equals("Jungle")) || (role.equals("jungle")) ) {
				System.out.println(jungle[champselect(jungle)]);
				break;
			} else if ( (role.equals("midlane")) || (role.equals("Midlane")) ) {
				System.out.println(midlane[champselect(midlane)]);
				break;
			} else if ( (role.equals("toplane")) || (role.equals("Toplane")) ) {
				System.out.println(toplane[champselect(toplane)]);
				break;
			} else if ( (role.equals("adc")) || (role.equals("Adc")) ) {
				System.out.println(adc[champselect(adc)]);
				break;
			} else if ( (role.equals("support")) || (role.equals("Support")) ) {
				System.out.println(support[champselect(support)]);
				break;
			} else {
				System.out.println("Error");
			}
		} */
		
		// Switch Case
		
		System.out.println("Hi, I'm here to help you decided what champion to pick in League of Legends");
		System.out.println("What role do you want?");
		String role = scan.nextLine();
		role = role.toLowerCase();
		
		switch(role) {
			case "jungle":
				System.out.println(jungle[champselect(jungle)]);
				break;
			case "midlane":
				System.out.println(midlane[champselect(midlane)]);
				break;
			case "toplane":
				System.out.println(toplane[champselect(toplane)]);
				break;
			case "adc":
				System.out.println(adc[champselect(adc)]);
				break;
			case "support":
				System.out.println(support[champselect(support)]);
				break;
			default:
				System.out.println("Error");
				
		}
			
	}
}
