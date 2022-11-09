import java.util.Scanner;

public class Exercici04 {
	public static void E04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
		System.out.println("Ahora introduce el caracter que deseas buscar");
		String caracter = sc.next();
		if(-1 != frase.lastIndexOf(caracter)) { //Aqui compruebo que la letra buscada exista
		System.out.println("El caracter se encuentra en la posición: "+ (frase.indexOf(caracter)+1)); //Le suemo 1, por que empieza a contar en 0.
		}else System.out.println("No se ha podido encontrar ese caracter.");
		
	}
}
