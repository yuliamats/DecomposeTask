package by.htp.les04.main;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// Треугольник задан координатами своих вершин. Написать метод для вычисления
		// его площади

		// координаты вершин треугольника
		double x1 = DecompositionTask01.readFromConsole("введите x1");
		double y1 = DecompositionTask01.readFromConsole("введите y1");

		double x2 = DecompositionTask01.readFromConsole("введите x2");
		double y2 = DecompositionTask01.readFromConsole("введите y2");

		double x3 = DecompositionTask01.readFromConsole("введите x3");
		double y3 = DecompositionTask01.readFromConsole("введите y3");

		double square;

		square = DecompositionTask01.calcSquare(x1, y1, x2, y2, x3, y3);

		System.out.println("площадь треугольника равна  " + square);

		///////////////////////////////////////////////////////////////////
		// Написать метод(методы) для нахождения наибольшего общего делителя и
		// наименьшего общего кратного двух натуральных чисел:

		int a = DecompositionTask01.readFromConsole("введите натуральное число");
		int b = DecompositionTask01.readFromConsole("введите натуральное число");

		int nod;
		int nok;

		nod = DecompositionTask01.calcNodOfTwo(a, b);
		nok = DecompositionTask01.calcNokOfTwo(a, b);

		System.out.println("наибольший общий делитель для чисел  " + a + " и " + b + " равен " + nod);
		System.out.println("наименьшее общее кратное для чисел " + a + " и " + b + " равно " + nok);
		System.out.println();

		/////////////////////////////////////////////////////////////////
		// Написать метод(методы) для нахождения наибольшего общего делителя четырех
		// натуральных чисел

		int a1 = DecompositionTask01.readFromConsole("введите натуральное число");
		int a2 = DecompositionTask01.readFromConsole("введите натуральное число");
		int a3 = DecompositionTask01.readFromConsole("введите натуральное число");
		int a4 = DecompositionTask01.readFromConsole("введите натуральное число");

		int nodOfFour;

		nodOfFour = DecompositionTask01.calcNodOfFour(a1, a2, a3, a4);
		System.out.println(
				"наибольший общий делитель для чисел  " + a1 + "," + a2 + "," + a3 + "," + a4 + " равен " + nodOfFour);
		System.out.println();

		/////////////////////////////////////////////////////////////////
		// Написать метод(методы) для нахождения суммы большего и меньшего из трех
		// чисел.

		int c1 = DecompositionTask01.readFromConsole("введите натуральное число");
		int c2 = DecompositionTask01.readFromConsole("введите натуральное число");
		int c3 = DecompositionTask01.readFromConsole("введите натуральное число");

		int sum = DecompositionTask01.maxOfThree(c1, c2, c3) + DecompositionTask01.minOfThree(c1, c2, c3);

		System.out.println("сумма большего и меньшего из трех чисел равна  " + sum);

		///////////////////////////////////////////////////////////////////
		// Вычислить площадь правильного шестиугольника со стороной а, используя метод
		// вычисления площади треугольника

		double d = 2.5; // длина стороны шестиугольника

		double s1 = DecompositionTask01.sqrOfHexagon(d);

		System.out.println("площадь правильного шестиугольника со стороной " + d + " равна " + s1);
		System.out.println();

		///////////////////////////////////////////////////////////////////
		// На плоскости заданы своими координатами n точек. Написать метод(методы),
		// определяющие, между какими из пар точек самое большое расстояние.
		// Указание. Координаты точек занести в массив.

		int n = 3; // количество пар точек

		// координаты координаты точек
		double m1 = 2.0;
		double n1 = 3.0;

		double m2 = 4.0;
		double n2 = 5.0;

		double m3 = 5.0;
		double n3 = 7.0;

		double[] masA = new double[n * 2];
		masA[0] = m1;
		masA[1] = n1;
		masA[2] = m2;
		masA[3] = n2;
		masA[4] = m3;
		masA[5] = n3;

		double[] masD = DecompositionTask01.masDistance(masA);
		DecompositionTask01.printDoubleMas(masD);
		double maxD = DecompositionTask01.maxNum(masD);

		DecompositionTask01.printCoordinate(masA, masD, maxD);

		// Составить программу, которая в массиве A[N] находит второе по величине число
		// (вывести на печать число, которое меньше максимального элемента массива, но
		// больше всех других элементов).

		double[] masB = new double[] { 2.2, 1.5, 3.3, -1.4, 4.4, 5.5, 1.1 };

		DecompositionTask01.printDoubleMas(masB);

		double max2 = DecompositionTask01.secondMaxNum(masB);

		System.out.println("второе по величине число  " + max2);

		// Написать метод(методы), проверяющий, являются ли данные три числа взаимно
		// простыми.

		int d1 = 3;
		int d2 = 7;
		int d3 = 11;

		int nodOfThree = DecompositionTask01.calcNodOfThree(d1, d2, d3);

		if (DecompositionTask01.isPrimeNum(nodOfThree)) {
			System.out.println("числа " + d1 + "," + d2 + "," + d3 + " взаимно простые");
		} else {
			System.out.println("числа  " + d1 + "," + d2 + "," + d3 + " не являются взаимно простыми");
		}

		// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
		// от 1 до 9.

		int f1 = 1;
		int f2 = 9;

		int sumF;

		int[] masE = DecompositionTask01.evenElemMas(f1, f2);
		int[] masF = DecompositionTask01.factorialMas(masE);
		DecompositionTask01.printMas(masF);

		sumF = DecompositionTask01.calcSumOfElem(masF);

		System.out.println(sumF);

		// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] +
		// D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления
		// суммы трех последовательно расположенных элементов массива с номерами от k до
		// m.

		int[] masX = new int[] { 5, 7, 9, 10, 4, 3, 1, 2, 6 };

		int k = 0;
		int m = 6;

		int sumX = 0;

		if (m > masX.length) {
			System.out.println("некорректные данные");
		}

		int[] masY = DecompositionTask01.calcSumOfThree(masX, k, m);
		DecompositionTask01.printMas(masY);
		sumX = DecompositionTask01.calcSumOfElem(masY);

		System.out.println(sumX);

		// Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
		// вычисления его площади, если угол между сторонами длиной X и Y— прямой.

		// длины сторон четырехугольника
		double t1 = 5;
		double t2 = 4;
		double t3 = 3;
		double t4 = 6;

		double squareQ = DecompositionTask01.squareOfQuad(t1, t2, t3, t4);
		System.out.println("площадь четырехульника равна " + squareQ);

		// Дано натуральное число N. Написать метод(методы) для формирования массива,
		// элементами которого являются цифры числа N.

		int number1 = DecompositionTask01.readFromConsole("введите число");

		int[] masN = DecompositionTask01.numInMas(number1);
		DecompositionTask01.printMas(masN);

		// Написать метод(методы), определяющий, в каком из данных двух чисел больше
		// цифр.

		int num1 = DecompositionTask01.readFromConsole("введите число");
		int num2 = DecompositionTask01.readFromConsole("введите число");

		int countOfNum1 = DecompositionTask01.countNum(num1);
		int countOfNum2 = DecompositionTask01.countNum(num2);

		if (countOfNum1 > countOfNum2) {
			System.out.println("цифр больше в числе " + num1);
		} else {
			System.out.println("цифр больше в числе " + num2);
		}

		// Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
		// элементами которого являются числа, сумма цифр которых равна К и которые не
		// большее N.

		int kx = 15;
		int nx = 80;

		int[] masK = DecompositionTask01.formArray(kx, nx);
		DecompositionTask01.printMas(masK);

		// Два простых числа называются «близнецами», если они отличаются друг от друга
		// на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
		// [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
		// использовать декомпозицию.

		int numA = 40;
		int numB = numA * 2;

		int[] masP = DecompositionTask01.formPrimemArray(numA, numB);
		DecompositionTask01.printMas(masP);

		// Натуральное число, в записи которого n цифр, называется числом Армстронга,
		// если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
		// числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

		int k1 = 100;

		int countA = 0;

		for (int i = 0; i <= k1; i++) {
			if (DecompositionTask01.isArmstrongDigit(i)) {
				countA++;
			}
		}

		int[] masArmstrong = new int[countA];
		int j = 0;
		for (int i = 0; i <= k1; i++) {
			if (DecompositionTask01.isArmstrongDigit(i)) {
				masArmstrong[j] = i;
				j++;
			}
		}
		DecompositionTask01.printMas(masArmstrong);

		// Найти все натуральные n-значные числа, цифры в которых образуют строго
		// возрастающую последовательность (например, 1234, 5789). Для решения задачи
		// использовать декомпозицию.

		int nZ = 4;

		int countZ = 0;

		int nStart = (int) Math.pow(10, nZ - 1);
		int nFinish = (int) Math.pow(10, nZ);

		for (int i = nStart; i < nFinish; i++) {
			if (DecompositionTask01.isIncreasingSequence(i)) {
				countZ++;
			}
		}

		int[] masS = new int[countZ];
		int g = 0;
		for (int i = nStart; i < nFinish; i++) {
			if (DecompositionTask01.isIncreasingSequence(i)) {
				masS[g] = i;
				g++;
			}
		}
		DecompositionTask01.printMas(masS);

		// Написать программу, определяющую сумму n - значных чисел, содержащих только
		// нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
		// решения задачи использовать декомпозицию.

		int p = 1;

		int sumOfEvenNum = 0;
		int countOfOddElemInSum = 0;

		int pStart = (int) Math.pow(10, p - 1);
		int pFinish = (int) Math.pow(10, p);

		for (int i = pStart; i < pFinish; i++) {
			if (DecompositionTask01.isAllEvenNum(i)) {
				sumOfEvenNum = sumOfEvenNum + i;
			}
		}

		countOfOddElemInSum = DecompositionTask01.calcOddElem(sumOfEvenNum);

		System.out.println("сумма чисел, содержащих только нечетные цифры, равна " + sumOfEvenNum);
		System.out.println("количество четных цифр в найденной сумме равно " + countOfOddElemInSum);

	}
}
