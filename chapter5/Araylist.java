package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Araylist {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Double> arr = new ArrayList<Double>();
		while (true) {
			System.out.print("nhpa vao so thuc bat ki : ");
			double input = sc.nextDouble();
			arr.add(input);
			sc.nextLine();

			System.out.println("continue ? Y or N ???");
			String option = sc.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		System.out.println("arr : " + arr);
		double sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		System.out.println("sum arr : " + sum);
	}
}
