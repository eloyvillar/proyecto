package com.dam.calculadora;

import java.util.Scanner;

import com.dam.aritmetica.OperacionesBasicas;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		while (true) {
			System.out.println("CALCULADORA");
			System.out.println("1.- SUMA.");
			System.out.println("2.- RESTA.");
			System.out.println("3.- MULTIPLICACION");
			System.out.println("4.- DIVISION");
			System.out.println("5.- RAIZ_CUADRADA:");
			System.out.println("6.- AREA_CIRCULO");
			System.out.println("7.- AREA_TRIANGULO");
			System.out.println("0.- SALIR");
			System.out.println("INTRODUZCA OPCION");

			int opcion = teclado.nextInt();

			System.out.println("Introduzca valor a:");
			int a = teclado.nextInt();
			System.out.println("Introduzca valor b:");
			int b = teclado.nextInt();

			switch (opcion) 
			{
				case 1:
					System.out.println("SUMA:");
					System.out.println(OperacionesBasicas.suma(a, b));
					break;
				case 2:
					System.out.println("RESTA:");
					System.out.println(OperacionesBasicas.resta(a, b));
					break;
				case 3:
					System.out.println("MULTIPLICACION:");
					System.out.println(OperacionesBasicas.multiplicacion(a, b));
					break;
				case 4:
					System.out.println("DIVISION:");
					System.out.println(OperacionesBasicas.division(a, b));
					break;
				case 5:
					System.out.println("RAIZ CUADRADA:");
					System.out.println(OperacionesBasicas.raizCuadrada(a));
					break;
				case 6:
					System.out.println("AREA CIRCULO:");
					System.out.println(OperacionesBasicas.areaCirculo(a, b));
					break;
				case 7:
					System.out.println("AREA TRIANGULO");
					System.out.println(OperacionesBasicas.areaTriangulo(a, b));
				case 0:
					return;
			}

		}

	}

}