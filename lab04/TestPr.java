package lab04;

public class TestPr {
	public static void main(String[] args) {
		Product test = new Product();

		Product pr1 = test.nhapThongTin("computer", 200, 10);
		System.out.println("tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
