package chapter5;

import java.util.ArrayList;

public class Bai2 {

	public static void main(String[] args) {
		Student st1 = new Student("quypham", 3);
		Student st2 = new Student("pham quy", 4);
		Student st3 = new Student("pham nguyen", 5);
		Student st4 = new Student("fdg", 6);
		Student st5 = new Student("ytj", 7);
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(st5);
		arr.add(st4);
		arr.add(st3);
		arr.add(st2);
		arr.add(st1);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("pham")) {
				System.out.println("done" + arr.get(i));
			}
		}

		System.out.println("list : " + arr);
	}
}
