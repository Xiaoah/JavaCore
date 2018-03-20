package inheritance;

import java.util.Scanner;

public class EnumTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("size="+size);
		System.out.println("abbeviation="+size.getAbbreviation());

	}

}

enum Size{
	SMALL("S"),
	MEDIUM("M"),
	LARGE("L"),
	EXTRA_LARGE("XL");

	private String abbreviation;
	public String getAbbreviation(){return abbreviation;}
	
	//构造方法，必须是private
	private Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}
}