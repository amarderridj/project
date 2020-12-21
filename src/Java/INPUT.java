package Java;
import java.util.Scanner;
public class INPUT {
	public static void main(String[] args) {
				input();
		}
			public static int input() {
				Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
				System.out.print("Enter a number between 70 et 100 :");  
				int str= sc.nextInt();              //reads an integer
				System.out.println("You have entered: "+str);  
				return str;
			}
	}


