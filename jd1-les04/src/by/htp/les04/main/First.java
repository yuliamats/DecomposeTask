package by.htp.les04.main;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		// координаты вершин треугольника
		double x1 = DecompositionTask01.readFromConsole("введите x1");
		double y1 = DecompositionTask01.readFromConsole("введите y1");
				
		double x2 = DecompositionTask01.readFromConsole("введите x2");
		double y2 = DecompositionTask01.readFromConsole("введите y2");
				
		double x3 = DecompositionTask01.readFromConsole("введите x3");
		double y3 = DecompositionTask01.readFromConsole("введите y3");
		
		double square;
		
		square = DecompositionTask01.calcSquare(x1, y1, x2, y2, x3, y3);
		
		System.out.println("площадь треугольника равна " + square);
		
		///////////////////////////////////////////////////////////////////
		
		int a = DecompositionTask01.readFromConsole("введите натуральное число");
		int b = DecompositionTask01.readFromConsole("введите натуральное число");
		
		int nod;
		int nok;
		
		nod = DecompositionTask01.calcNodOfTwo(a, b);
		nok = DecompositionTask01.calcNokOfTwo(a, b);
		
		System.out.println("наибольший общий делитель для чисел " + a + " и " + b + " равен " + nod);
		System.out.println("наименьшее общее кратное для чисел " + a + " и " + b + " равен " + nok);
		System.out.println();
		
		/////////////////////////////////////////////////////////////////
		
		int c1 = DecompositionTask01.readFromConsole("введите натуральное число");
		int c2 = DecompositionTask01.readFromConsole("введите натуральное число");
		int c3 = DecompositionTask01.readFromConsole("введите натуральное число");
		
		int sum = DecompositionTask01.maxOfThree(c1, c2, c3) + DecompositionTask01.minOfThree(c1, c2, c3);
		
		System.out.println("сумма большего и меньшего из трех чисел равна " + sum);
		
		///////////////////////////////////////////////////////////////////
		
		double d = 2.5;   //длина стороны шестиугольника		
		
		double s1 = DecompositionTask01.sqrOfHexagon(d);
		
		System.out.println("площадь правильного шестиугольника со стороной " + d + " равна " + s1);
		System.out.println();
		
		
	}
	
	

}
