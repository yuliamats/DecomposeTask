package by.htp.les04.main;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		// ���������� ������ ������������
		double x1 = DecompositionTask01.readFromConsole("������� x1");
		double y1 = DecompositionTask01.readFromConsole("������� y1");
				
		double x2 = DecompositionTask01.readFromConsole("������� x2");
		double y2 = DecompositionTask01.readFromConsole("������� y2");
				
		double x3 = DecompositionTask01.readFromConsole("������� x3");
		double y3 = DecompositionTask01.readFromConsole("������� y3");
		
		double square;
		
		square = DecompositionTask01.calcSquare(x1, y1, x2, y2, x3, y3);
		
		System.out.println("������� ������������ ����� " + square);
		
		///////////////////////////////////////////////////////////////////
		
		int a = DecompositionTask01.readFromConsole("������� ����������� �����");
		int b = DecompositionTask01.readFromConsole("������� ����������� �����");
		
		int nod;
		int nok;
		
		nod = DecompositionTask01.calcNodOfTwo(a, b);
		nok = DecompositionTask01.calcNokOfTwo(a, b);
		
		System.out.println("���������� ����� �������� ��� ����� " + a + " � " + b + " ����� " + nod);
		System.out.println("���������� ����� ������� ��� ����� " + a + " � " + b + " ����� " + nok);
		System.out.println();
		
		/////////////////////////////////////////////////////////////////
		
		int c1 = DecompositionTask01.readFromConsole("������� ����������� �����");
		int c2 = DecompositionTask01.readFromConsole("������� ����������� �����");
		int c3 = DecompositionTask01.readFromConsole("������� ����������� �����");
		
		int sum = DecompositionTask01.maxOfThree(c1, c2, c3) + DecompositionTask01.minOfThree(c1, c2, c3);
		
		System.out.println("����� �������� � �������� �� ���� ����� ����� " + sum);
		
		///////////////////////////////////////////////////////////////////
		
		double d = 2.5;   //����� ������� ��������������		
		
		double s1 = DecompositionTask01.sqrOfHexagon(d);
		
		System.out.println("������� ����������� �������������� �� �������� " + d + " ����� " + s1);
		System.out.println();
		
		
	}
	
	

}
