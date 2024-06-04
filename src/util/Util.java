package util;

import java.util.Scanner;

public class Util {
	public static Scanner scanner = new Scanner(System.in);

	public static String prompt(String... strings) {
		for (String string : strings) {
			System.out.println(string);
		}
		System.out.print(">>");
		String response = scanner.nextLine();
		return response;
	}
}
