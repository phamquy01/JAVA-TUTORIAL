package chapter5;

import java.util.Scanner;

public class Baitap1 {
	public static void main(String[] args) {
		System.out.println("nhap vao username : ");
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		System.out.println("nhap vao password : ");
		String password = sc.nextLine();

		System.out.println("username : " + username + " " + "password : " + password);
		if (username.equals("quypham") && password.length() > 6) {
			System.out.println("valid input");
		}
	}
}
