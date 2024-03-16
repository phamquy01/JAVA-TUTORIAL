package phambinhquy;

import java.util.Scanner;

public class ptbac2 {
	public static void giaiptbacnhat(int a, int b) {

		if (a == 0 && b == 0) {
			System.out.println("pt vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("pt vo  nghiem");
		} else {
			float x = (float) -b / a;
			System.out.printf("nghiemj cua pt la %.3f: ", x);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a : ");
		int a = scanner.nextInt();
		System.out.println("nhap b : ");
		int b = scanner.nextInt();
		System.out.println("nhap c :");
		int c = scanner.nextInt();

		System.out.printf("pt bac 2 la %dx^2 + %dx +%d = 0 \n ", a, b, c);
		if (a == 0) {
			giaiptbacnhat(b, c);
		} else {
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("pt vo nghiem");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.println("pt co nghiem kep : " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("pt co 2 nghiem rieng biet, x1=%.3f, x2=%.3f", x1, x2);
			}
		}
		scanner.close();
	}
}
