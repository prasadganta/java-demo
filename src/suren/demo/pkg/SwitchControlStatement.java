package suren.demo.pkg;

import java.util.Scanner;

public class SwitchControlStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vaues ");
		System.out.println("===================");
		System.out.println("ENter value for a");
		String a=sc.next();
		
		switch(a) {
		case "a" : System.out.println("Vowel \t"+a);
		break;
		case "e" : System.out.println("Vowel\t"+a);
		break;
		case "i" : System.out.println("Vowel\t"+a);
		break;
		case "o" : System.out.println("Vowel\t"+a);
		break;
		case "u" : System.out.println("Vowel\t"+a);
		break;
		default :System.out.println("Not a Vowel \t"+a);
		
		}
	}

}
