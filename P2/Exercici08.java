import java.util.ArrayList;

public class Exercici08 {
public static void E08() {
	 ArrayList<String> lista = new ArrayList<String>(); //Creo un arraylist de cadenas
	    lista.add("palabra1");
	    lista.add("palabra2");
	    lista.add("palabra3");
	    lista.add("palabra4");
	    
	    
	    lista.forEach((final String name) -> System.out.println(name)); //Recorro el arraylist con una función anónima (lambda) 
}
}
