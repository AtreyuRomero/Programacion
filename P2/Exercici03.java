import java.util.Scanner;

public class Exercici03 {
	public static void E03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
		System.out.println("Ahora introduce el caracter que deseas buscar");
		String caracter = sc.next();
		if(-1 != frase.lastIndexOf(caracter)) { //Aqui compruebo que la letra buscada exista
		String fraseA=removeDuplicates(frase); //Y aquí elimino las letras duplicadas para que el indexof me devuelva la primera letra que coincida y no la ultima
		System.out.println("El caracter se encuentra en la posición: "+ (fraseA.lastIndexOf(caracter)+1)); //Le suemo 1, por que empieza a contar en 0.
		}else System.out.println("No se ha podido encontrar ese caracter.");
		
	}

	private static String removeDuplicates(String frase) { //Con este metodo, elimino las letras duplicadas
		{
			if (frase == null) {
				return null;
			}

			char[] chars = frase.toCharArray(); //Convierto la cadena en un char
			char prev = 0;
			int i = 0;

			for (char c: chars)
			{
				if (prev != c)
				{
					chars[i++] = c;
					prev = c;
				}
			}

			return new String(chars).substring(0, i);
		}
	}
}
