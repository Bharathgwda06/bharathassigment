import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Prob2 {
	


	public static void main(String[] args) throws IOException {
		int i=1;
		int j=2;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("You will be having three chances to complete the following task");
		Random ra = new Random();
		System.out.println("Do you want to play Speed hands (Y/N)");
		String choice = br.readLine();
		if(choice.toUpperCase().equals("Y")) {
			System.out.println("You will be having two chances to win");
			while(i<=2) {
				int random = ra.nextInt(3,15);
				i+=1;
			System.out.println("Enter a String of length "+random);
			String x = br.readLine();
			if(x.length()!=random) {
				System.out.println("You have not enterd the string "+x.toUpperCase()+" of length "+random);
				System.out.println("you have left with "+(j-1)+" chance \n");
				j-=1;
				continue ;
			}
			else {
				int random2 = ra.nextInt(3,15);
				System.out.println("Enter a second  String of length "+random2);
				String y = br.readLine();
				if(y.length()!=random2) {
					System.out.println("You have not enterd the string "+y.toUpperCase()+" of length "+random2);
					System.out.println("you have left with "+(j-1)+" chance \n");
					j-=1;
					continue ;
			}
				else {
					System.out.println("you won the game");
					break;
				}
		}
		}
		
		}
	}
}
	


