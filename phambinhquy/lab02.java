package phambinhquy;

import java.util.Scanner;

public class lab02 {
	public static void ptbacnhat() {
		System.out.println(">> lựa chọn tính năng 1 <<");
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a");
		int a = scanner.nextInt();
		System.out.println("nhap b");
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("pt vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("pt vo  nghiem");
		} else {
			float x = (float) -b / a;
			System.out.printf("nghiemj cua pt la %.3f: ", x);
		}
		scanner.close();
	}

	public static void ptbachai() {
		System.out.println(">> lựa chọn tính năng 2 <<");
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a : ");
		int a = scanner.nextInt();
		System.out.println("nhap b : ");
		int b = scanner.nextInt();
		System.out.println("nhap c :");
		int c = scanner.nextInt();

		System.out.printf("pt bac 2 la %dx^2 + %dx +%d = 0 \n ", a, b, c);
		if (a == 0) {
			// ptbac 1
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

	public static void tinhtiendien() {
		System.out.println(">> chưa có tính năng 3 <<");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		System.out.print("lựa chọn của bạn :");
		int x = scanner.nextInt();
		switch (x) {
		case 1:
			ptbacnhat();
			// giai pt bac 1;
			break;
		case 2:
			ptbachai();
			// giai pt bac 2;
			break;
		case 3:
			tinhtiendien();
			break;
		default:
			System.out.println(">> bạn đã thoát chương trình <<");
			System.exit(0);
		}
	}
}
