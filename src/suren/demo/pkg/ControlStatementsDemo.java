package suren.demo.pkg;

import java.util.Scanner;

public class ControlStatementsDemo {

	public static void main(String[] args) {
		// if , else, if else 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vaues ");
		System.out.println("===================");
		System.out.println("ENter value for a");
		int a=sc.nextInt();
		if(a>10) {
			System.out.println("You are good!!");
		}
		else if(a> 5 && a < 10) {
			System.out.println("Better to improve");
		}else {
			System.out.println("you are bad !!!");
		}
		
		
		 // Ternary Operator
		String condition=a >10 ? "YOU ARE GOOD" : (a>5 && a<10 )? "BETTER TO IMPROVE" :"YOU ARE BAD";
		System.out.println(condition);
		

	}

}
