import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		System.out.println("------ Ejercicio 5 ------");
		Random random = new Random();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce un numero");
		try {
			int num1 = sc1.nextInt();
			sc1.close();
			int value = random.nextInt(4 - 1);
			//System.out.println(value);
			int resultado = num1/value;
			System.out.println(num1+" dividido entre " + value + " da " + resultado);
		}catch (ArithmeticException n) {
			System.out.println("Ha habido un error, por que no se puede dividir entre 0");
		}catch (InputMismatchException i) {
			System.out.println("La proxima vez introduzca un número");
		}finally {
			System.out.println("El programa a finalizado :)");
		}
	}
}
