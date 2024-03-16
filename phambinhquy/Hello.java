package phambinhquy;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("int a: ");
		int name = scanner.nextInt();
		System.out.println("int b ");
		int age = scanner.nextInt();
		int max = Math.max(name, age);
		System.out.println("so lon hon la: " + max);
		scanner.close();
	}
}
