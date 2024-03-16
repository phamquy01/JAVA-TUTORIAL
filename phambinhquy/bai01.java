package phambinhquy;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ten cua ban la :");
		String ten = scanner.nextLine();
		System.out.println("diem cua ban la :");
		int diem = scanner.nextInt();

		System.out.println(ten + "co diem la " + diem);
		scanner.close();
	}
}
