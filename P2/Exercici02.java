
public class Exercici02 {
	public static void E02() {
		String cadena="";
		String cadena1 = "Fran";
		String cadena2 = "Ma nu";
		cadena1= cadena1.replace(" ",""); //Asi reemplazo los espacios por "" es decir, ningun caracter.
		cadena2= cadena2.replace(" ","");
		
		for(int i=0; i<cadena1.length();i++) { //Hago un buclre para ayudandome del metodo charAt() recorrerme los Strings
			cadena = cadena+cadena1.charAt(i)+cadena2.charAt(i); //Aquí concateno las cadenas
		}System.out.println(cadena); //Muestro el resultado
	}
}
