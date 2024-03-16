package phambinhquy;

import java.util.Scanner;

public class ptbac1 {
	public static void main(String[] args) {
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
}
