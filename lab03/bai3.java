package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap so luong phan tu array:");
		int size = scanner.nextInt();
		int[] a = new int[size];
		System.out.print("nhap phan tu: ");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("array ban dau: " + Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("array sap xep: " + Arrays.toString(a));
//		System.out.println("max: " + a[a.length - 1]);
//		System.out.println("min: " + a[0]);
		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			max = Math.max(max, a[i]);

		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {

			min = Math.min(min, a[i]);

		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}
}
