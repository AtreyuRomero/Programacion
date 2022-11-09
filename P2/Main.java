import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que ejercio quieres corregir, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 o 11?\n");
		System.out.println("Clica otro número para salir o 0 para corregir todos");
		String opcionS = sc.next();
		int opcion = ControlNumeros.controlnumeros(opcionS);	
		switch(opcion) {
		case 0:
			Exercici01.E01();
			System.out.println("\r\r---Ejercicio 2---");
			Exercici02.E02();
			System.out.println("\r---Ejercicio 3---");
			Exercici03.E03();
			System.out.println("\r---Ejercicio 4---");
			Exercici04.E04();
			System.out.println("\r---Ejercicio 5---");
			Exercici05.E05();
			System.out.println("\r---Ejercicio 6---");
			Exercici06.E06();
			System.out.println("\r---Ejercicio 7---");
			Exercici07.E07();
			System.out.println("\r---Ejercicio 8---");
			Exercici08.E08();
			break;
		case 1:
			Exercici01.E01();
		break;
		case 2:
			System.out.println("\r\r---Ejercicio 2---");
			Exercici02.E02();
		break;
		case 3:
			System.out.println("\r---Ejercicio 3---");
			Exercici03.E03();
		break;
		case 4:
			System.out.println("\r---Ejercicio 4---");
			Exercici04.E04();
		break;
		case 5:
			System.out.println("\r---Ejercicio 5---");
			Exercici05.E05();
		break;
		case 6:
			System.out.println("\r---Ejercicio 6---");
			Exercici06.E06();
		break;
		case 7:
			System.out.println("\r---Ejercicio 7---");
			Exercici07.E07();
			break;
		case 8:
			System.out.println("\r---Ejercicio 8---");
			Exercici08.E08();
			break;
		case 9:
			System.out.println("\r---Ejercicio 9---");
			Exercici09.E09();
			break;
		case 10:
			System.out.println("\r---Ejercicio 10---");
			Exercici10.E10();
			break;
		case 11:
			System.out.println("\r---Ejercicio 11---");
			Exercici11.E11();
			break;
		default:
			System.out.println("Ha elegido salir");
		}
	}
}
