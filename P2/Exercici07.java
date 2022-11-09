import java.util.ArrayList;
import java.util.Iterator;

public class Exercici07 {
	public static void E07() {
		 ArrayList<String> lista = new ArrayList<String>(); //Creo un arraylist de cadenas
		    lista.add("palabra1");
		    lista.add("palabra2");
		    lista.add("palabra3");
		    lista.add("palabra4");
		    
		    Iterator<String> iterators = lista.iterator(); //Creo un iterator de cadenas
		    
		    while(iterators.hasNext()) { //Creo un bucle que se pare cuando encuentre el final, es decir que no haya siguiente palabra.
		    	  System.out.println(iterators.next()); 
		    	}
	}
}
