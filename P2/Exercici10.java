import java.util.HashSet;
import java.util.Set;

public class Exercici10 {
public static void E10() {
	Set<String> hashset = new HashSet <>(); //Creo un HashSet
	hashset.add("palabra1"); //Le añado palabras
	hashset.add("palabra2");
	hashset.add("palabra3");
	hashset.add("palabra4");
	
	for(String h: hashset){ //Creo un bucle for para mostrar el array
		System.out.println(h); 
		}
}
}
