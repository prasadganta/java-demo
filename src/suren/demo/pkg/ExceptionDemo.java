package suren.demo.pkg;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vaues ");
		System.out.println("===================");
		System.out.println("ENter value for a");
		int a = sc.nextInt();

		try {
			int b = a / 5;
			System.out.println("value ==>" + b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Code completed !!!");
		}
	}

}
