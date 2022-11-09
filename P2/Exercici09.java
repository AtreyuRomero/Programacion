import java.util.ArrayList;

public class Exercici09 {
public static void E09(){
	ArrayList<String> lista = new ArrayList<String>(); //Creo un arraylist de cadenas
    lista.add("palabra1"); //Le añado palabras
    lista.add("palabra2");
    lista.add("palabra3");
    lista.add("palabra4");
    
    String[] array = new String[lista.size()]; //Creo el array en el que voy a copiar los datos, y le asigno el tamaño de la lista, usando .size para saber el tamaño
    array = lista.toArray(array); //Con el metodo toArray paso los datos de la lista a el array
    
    
    for(String s : array)  //Creo un bucle for para mostrar el array
    	  System.out.println(s); //No he añadido los {}, por que si quiero que se repita solo la siguiente linea, no hace falta.
}
}
