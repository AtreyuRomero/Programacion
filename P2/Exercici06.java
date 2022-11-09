import java.nio.charset.StandardCharsets;

public class Exercici06 {
	public static void E06() {
		String frase = "Cadena de texto y coleccionables";
		
		byte[] ascii = frase.getBytes(StandardCharsets.US_ASCII); //Esto convierte la cadena a un array de bytes, y el parametro se asegura que sean el numero ASCII, aun que no es necesario.
		
		for(int i=0;i<frase.length();i++) { //He creado un buvle para recorrer el array de bytes y la cadena caracter a caracter
			System.out.println("ASCII: "+ascii[i]+" es equivalente a: "+frase.charAt(i));
		}
	}
}
