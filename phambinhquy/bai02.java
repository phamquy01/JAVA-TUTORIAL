package phambinhquy;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai :");
		int dai = scanner.nextInt();
		System.out.println("nhap chieu rong :");
		int rong = scanner.nextInt();
		System.out.println("chu vi la " + (dai + rong) * 2);
		System.out.println("dien tich la " + (dai * rong));
		System.out.println("min la " + Math.min(dai, rong));
		scanner.close();
	}
}
