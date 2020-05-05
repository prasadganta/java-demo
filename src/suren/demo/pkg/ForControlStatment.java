package suren.demo.pkg;

import java.util.Scanner;

public class ForControlStatment {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vaues ");
		System.out.println("===================");
		System.out.println("ENter value for a");
		int a=sc.nextInt();
		
		for(int i=0;i<=a;i++) {
			
			if(i % 3 ==0) {
				System.out.println("Number can be divided by 3 \t"+i);
			}
		}
		
		
		System.out.println("====== While loop begin ========");
		
		int j=0;
		
		while(j<=a) {
			
			if(j % 3 ==0) {
				System.out.println("Number can be divided by 3  from while loop\t"+j);
			}
			
			j++;
			
		}

	}

}
