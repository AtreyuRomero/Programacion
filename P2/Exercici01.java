import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercici01 {
	public static void E01() {
		Scanner sc = new Scanner(System.in);
		String nyA;
		String[] AnyA;
		nyA = "Francisco Jose Lopez Perez";
		
		//System.out.println("Introduce nombre y apellidos"); nyA = sc.nextLine(); // Descomenta este, si quieres probar con varios nombres.		
		
		AnyA = nyA.split(" "); // El split me genera un Array a partir de un string separando las palabras segun el criterio
		
		int n = AnyA.length; //Aquí creo un int con la longitut del array
		 
       String[] apellidos = new String[2]; //Creo el array donde voy a almacenar los apellidos, que supondre que siempre van a ser dos
       String[] nombre = new String[n - apellidos.length]; //Creo el array donde almaceno el nombre, el numero de nombres varia
 
        for (int i = 0; i < n; i++) //Relleno los Arrays de nombre y apellidos.
        {
            if (i < apellidos.length) { 
                apellidos[i] = AnyA[AnyA.length-1-i]; //Para rellenar los apellidos obtengo las dos ultimas palabras
            }
            else {
                nombre[i - apellidos.length] = AnyA[AnyA.length-1-i]; //Para rellenar el nombre obtengo el resto de palabras
            }
        }
		
		//Invertir array con auxiliar
        String[] invertido = new String[apellidos.length]; //Invierto el array de los apellidos, para que aparezcan ordenados 
        for(int i=0;i<apellidos.length;i++){
            invertido[i] = apellidos[apellidos.length-1-i]; 
        }
        apellidos = invertido;
        
        String[] invertido1 = new String[nombre.length]; //Invierto también los nombres, podria evitar estos pasos inviertiendo el primer array. 
        for(int i=0;i<nombre.length;i++){
            invertido1[i] = nombre[nombre.length-1-i]; 
        }
        nombre = invertido1;
        
        String[] auxiliar = new String[nombre.length]; //Aquí creo un array que almacene solo las primeras letras del array nombre.
        String nombreaux, letraaux;
        for(int i=0; i<nombre.length;i++) {
       nombreaux = nombre[i]; 
       letraaux = String.valueOf(nombreaux.charAt(0));
       auxiliar[i]=letraaux;
        }
        
        System.out.println("---Ejercicio 1---");
       for(int i=0;i<apellidos.length;i++) //Muestro por pantalla los apellidos
        {
            System.out.print(apellidos[i]+" ");
        }; 
        
        System.out.print(", ");
        
        for(int i=0;i<auxiliar.length;i++) // Muestro por pantalla los nombres
        {
            System.out.print(auxiliar[i]+".");
        };
	}
}
