package vectores;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//p1();
		//p2();
		//p3();
		//p4();
		//p5();
		p6();
		//p7();
		//p8();
		//p9();
		//p10i();
		//p11();
		//p12();
		//p13();
		//p14();

	}
	
	public static  void p1() {
		String[] fruits = new String[] {"Pineapple", "Apple", "Orange", "Banana"};
		
		for(int i=0; i<fruits.length; i++) {//clasico
			System.out.println(fruits[i]);
		}
		for(String temp: fruits) { //foreach desde java 8
			System.out.println(temp);
		}
	}
	
	public static void p2() {
	
		int vector1[] = new int[] {1,2,3};
		int vector2[] = new int[] {4,5,6};
		
		for(int i=0; i<vector1.length;i++) {
			System.out.println("Componente "+i+": "+vector1[i]);
		}
		
		for(int i=0; i<vector2.length;i++) {
			System.out.println("Componente "+i+": "+vector2[i]);
	}
		
		int suma=0;
		for(int i=0; i<vector2.length; i++) {
			suma = suma + vector1[i]*vector2[i];
		}
		System.out.println("El producto escalar es "+ suma);
	}
	
	public static void p3() {
		Scanner lector = new Scanner(System.in);
		int vector[] = new int[] {1,2,3,4,5,6};
		System.out.println("Introduce el numero a buscar en el vector: ");
		int num = lector.nextInt();
		int i;
		for (i=0; i<vector.length; i++) {
			if (vector[i]==num) {
				System.out.println("Encontrado numero "+num+" en posicion "+i);
				break;
			}else if (i==vector.length-1){
				System.out.println("No se ha encontrado");
			}
		}
	}
	
	public static void p4() {
		Scanner lector = new Scanner(System.in);
		int vector[] = new int[] {11,12,63,24,75,36};
		int num = vector[vector.length-1];
		int suma = 0;
		for(int i=0; i<vector.length-1; i++) {
			if (vector[i]>num) {
				suma +=  vector[i];
			}
		}
		System.out.println("Suma es " +suma);
	}
	
	public static void p5() {
		
		Scanner lector = new Scanner(System.in);
		int v1[] = new int[] {11,12,3,4,5,6};
		int v2[] = new int[] {11,12,3,4,5,6};
		if (v1.length != v2.length)
			return; 
		boolean son_iguales = true;
		for(int i=0; i<6; i++) {
			if (v1[i]!=v2[i]) {
				son_iguales = false;
				break;
			}
		}
		if (son_iguales) System.out.println("son iguales");
		else					System.out.println("no son iguales");
	
	}
	
	public static void p6() {
		Scanner lector = new Scanner(System.in);
		int matriz[][] = {{1,2,3},
				                     {4,5,6},
				                     {7,8,9}};
		System.out.println("Introduce la fila: ");
		int fila = lector.nextInt();
		
		int suma = 0;
		for(int i=0; i<3; i++) {// fila
			for(int j=0; j<3; j++) {
				suma += matriz[i][j];
			}
		}
		System.out.println("son iguales");
	}
}
