package by.htp.les04.main;

import static java.lang.Math.*;

import java.util.Scanner;

public class DecompositionTask01 {

	public static double calcSquare(double x1, double y1, double x2, double y2, double x3, double y3) {

		double temp1;
		double temp2;
		double temp3;
		double temp;

		double res;

		temp1 = sqrt(pow(abs(x2 - x1), 2) + pow(abs(y2 - y1), 2));
		temp2 = sqrt(pow(abs(x3 - x1), 2) + pow(abs(y3 - y1), 2));
		temp3 = sqrt(pow(abs(x3 - x2), 2) + pow(abs(y3 - y2), 2));

		res = abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
		temp = (int) round(res * 100);
		res = (double) temp / 100;
		return res;

	}

	public static int calcNodOfTwo(int a, int b) {

		int nod = 0;

		if (a > b) {
			for (int i = a; i > 0; i--) {
				if (a % i == 0 && b % i == 0) {
					nod = i;
					break;
				}
			}
		}

		if (b > a) {
			for (int i = b; i > 0; i--) {
				if (b % i == 0 && a % i == 0) {
					nod = i;
					break;
				}
			}
		}

		return nod;
	}

	public static int readFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println(message + " : ");

		while (sc.hasNextInt() == false) {
			String str = sc.next();
			System.out.println("вы ввели " + str);
			System.out.println(message + ":");
		}

		x = sc.nextInt();
		return x;

	}

	public static int calcNokOfTwo(int a, int b) {

		int nok = 1;
		int temp = 0;

		if (a > b) {
			for (int i = a; i > 0; i--) {
				if (a % i == 0 && b % i == 0) {
					temp = i;
					break;
				}
			}
		}

		if (b > a) {
			for (int i = b; i > 0; i--) {
				if (b % i == 0 && a % i == 0) {
					temp = i;
					break;
				}
			}
		}
		nok = a * b / temp;
		return nok;
	}

	public static int maxOfThree(int a, int b, int c) {
		int x;
		x = Math.max(Math.max(a, b), c);
		return x;
	}
	
	public static int minOfThree(int a, int b, int c) {
		int x;
		x = Math.min(Math.min(a, b), c);
		return x;
	}
	
	public static double sqrOfHexagon(double a) {
		double x;
		x = 3 * Math.sqrt(3) * Math.pow(a, 2) / 2;
		return x;
	}
}
