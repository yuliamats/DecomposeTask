package by.htp.les04.main;

import static java.lang.Math.*;

import java.util.Random;
import java.util.Scanner;

public class DecompositionTask01 {

	public static double calcSquare(double x1, double y1, double x2, double y2, double x3, double y3) {
		double res;
		double temp;

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

	public static int calcNodOfFour(int a, int b, int c, int d) {
		int nod = 0;
		int max = Math.max(Math.max(Math.max(a, b), c), d);

		for (int i = max; i > 0; i--) {
			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;
	}

	public static int calcNodOfThree(int a, int b, int c) {
		int nod = 0;
		int max = Math.max(Math.max(a, b), c);

		for (int i = max; i > 0; i--) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;
	}

	public static int readFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.print(message + " : ");

		while (sc.hasNextInt() == false) {
			String str = sc.next();
			System.out.print("�� ����� " + str);
			System.out.print(message + ":");
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

	public static double[] masDistance(double mas[]) {
		double distance;
		double[] mas1 = new double[mas.length / 2];

		int j = 0;

		for (int i = 0; i < mas.length - 2; i += 2) {
			for (int k = i + 2; k < mas.length - 1; k += 2) {
				distance = (double) Math.round(Math.sqrt(
						Math.pow(Math.abs(mas[k] - mas[i]), 2) + Math.pow(Math.abs(mas[k + 1] - mas[i + 1]), 2)) * 100)
						/ 100;
				mas1[j] = distance;
				j++;
			}
		}
		return mas1;
	}

	public static void printCoordinate(double[] masA, double[] masD, double maxD) {
		if (masA == null) {
			return;
		}

		double dis;
		for (int i = 0; i < masA.length - 2; i += 2) {
			for (int k = i + 2; k < masA.length - 1; k += 2) {
				dis = (double) Math.round(Math.sqrt(
						Math.pow(Math.abs(masA[k] - masA[i]), 2) + Math.pow(Math.abs(masA[k + 1] - masA[i + 1]), 2))
						* 100) / 100;
				if (dis == maxD) {
					System.out.println("координаты точек: " + "(" + masA[i] + ";" + masA[i + 1] + ")" + " � " + "("
							+ masA[k] + ";" + masA[k + 1] + ")");
				}
			}
		}
	}

	public static void printDoubleMas(double[] mas) {
		if (mas == null) {
			return;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "   ");
		}
		System.out.println();
	}

	public static double maxNum(double[] mas) {
		double max = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		return max;
	}

	public static void initMas(int[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(15);
		}
	}

	public static void printMas(int[] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%2d ", mas[i]);
		}
		System.out.println();
	}

	public static double secondMaxNum(double[] mas) {
		double max1 = maxNum(mas);
		double max2 = mas[0];

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < max1 && mas[i] > max2) {
				max2 = mas[i];
			}
		}
		return max2;
	}

	public static boolean isPrimeNum(int nod) {
		boolean flag = true;

		if (nod != 1) {
			flag = false;
		}
		return flag;
	}

	public static int[] evenElemMas(int n1, int n2) {
		int count = 0;

		for (int i = n1; i <= n2; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}

		int[] mas1 = new int[count];

		int j = 0;
		for (int i = n1; i <= n2; i++) {
			if (i % 2 != 0) {
				mas1[j] = i;
				j++;
			}
		}
		return mas1;
	}

	public static int[] factorialMas(int[] mas) {
		int res = 1;
		int[] mas1 = new int[mas.length];

		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int k = 1; k <= mas[i]; k++) {
				res = res * k;
			}
			mas1[j] = res;
			res = 1;
			j++;
		}
		return mas1;
	}

	public static int calcSumOfElem(int[] mas) {
		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}

	public static int[] calcSumOfThree(int[] mas, int k, int m) {
		int sum = 0;
		int[] mas1 = new int[3];

		int x = 0;
		for (int i = k; i <= m - 2; i += 2) {
			for (int j = i; j <= i + 2; j++) {
				sum = sum + mas[j];
			}
			mas1[x] = sum;
			x++;
			sum = 0;
		}
		return mas1;
	}

	public static double perimeterOfQuad(double a, double b, double c, double d) {
		double perimeter;

		perimeter = (a + b + c + d) / 2;
		return perimeter;
	}

	public static double squareOfQuad(double a, double b, double c, double d) {
		double square;

		double p = perimeterOfQuad(a, b, c, d);
		square = (double) Math.round(Math.sqrt((p - a) * (p - b) * (p - c) * (p - d)) * 100) / 100;
		return square;
	}

	public static int countNum(int m) {
		int count = 0;

		while (m > 0) {
			m = m / 10;
			count++;
		}
		return count;
	}

	public static int[] numInMas(int m) {
		int c1;

		c1 = countNum(m);

		int[] mas1 = new int[c1];

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = m % 10;
			m = m / 10;
		}
		return mas1;
	}

	public static boolean isCorrectValue(int num, int k, int n) {
		int[] masK = numInMas(num);
		int sumDigit = calcSumOfElem(masK);

		if (sumDigit == k && num < n) {
			return true;
		}
		return false;
	}

	public static int[] formArray(int k, int n) {
		int[] mas1 = new int[n];

		int j = 0;
		for (int i = 1; i < n; i++) {
			if (isCorrectValue(i, k, n)) {
				mas1[j] = i;
				j++;
			}
		}

		int[] mas2 = new int[j];

		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = mas1[i];
		}
		return mas2;
	}

	public static int[] formPrimemArray(int k, int n) {
		int[] mas1 = new int[n];

		int j = 0;
		for (int i = k; i <= n; i++) {
			if (isPrimeDigit(i)) {
				mas1[j] = i;
				j++;
			}
		}

		int[] mas2 = new int[j];

		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = mas1[i];
		}

		int[] mas3 = new int[mas2.length];
		int y = 0;
		for (int x = 0; x < mas3.length - 1; x++) {
			if (mas2[x + 1] == mas2[x] + 2) {
				mas3[y] = mas2[x];
				mas3[y + 1] = mas2[x + 1];
				y += 2;
			}
		}
		return mas3;
	}

	public static boolean isPrimeDigit(int num) {
		boolean flag = true;

		int sqrtNum = (int) (Math.sqrt(num));

		for (int i = 2; i < sqrtNum; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static boolean isArmstrongDigit(int num) {
		boolean flag = true;
        int count = countNum(num);		
		int sum = sumOfNum(num);
		int powNum = (int) Math.pow(sum, count);

		if (powNum != num) {
			flag = false;
		}
		return flag;
	}

	public static int sumOfNum(int num) {
		int sum = 0;

		int[] mas1 = numInMas(num);

		for (int i = 0; i < mas1.length; i++) {
			sum = sum + mas1[i];
					}
		return sum;
	}
	
	public static boolean isIncreasingSequence(int num) {
		boolean flag = true;
        
		int[] mas1 = numInMas(num);
        
		for (int i = 0; i < mas1.length - 1; i++) {
			if (mas1[i] < mas1[i + 1]) {
				flag = false;
				break;
			}
		}
     return flag;
	}
	
	public static boolean isAllEvenNum(int num) {
    boolean flag = true;
        
	int[] mas1 = numInMas(num);
	for (int i = 0; i < mas1.length; i++) {
		if (mas1[i] % 2 == 0) {
			flag = false;
			break;
		}
	}
    return flag;
}
	public static int calcOddElem(int num) {
	    int count = 0;
	        
		int[] mas1 = numInMas(num);
		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] % 2 == 0) {
				count++;
			}
		}
	    return count;
	}
}
