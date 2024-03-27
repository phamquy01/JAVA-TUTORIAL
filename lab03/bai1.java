package lab03;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("run bai 1");
		System.out.print("nhap vao so nguyen bat ki : ");
		int value = scanner.nextInt();

		int count = 0;
		for (int i = 2; i <= value - 1; i++) {
			if (value % i == 0) {
				System.out.println("ước số khác: " + i);
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.printf("%d la so nguyen to", value);
		} else {
			System.out.printf("%d ko la so nguyen to", value);
		}
		scanner.close();
	}
}
