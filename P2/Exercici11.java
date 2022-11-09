import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercici11 {
public static void E11() {
	Map<String, String> hashmap = new HashMap <>(); //Creo un Hashmap
	hashmap.put("1", "P1"); //Añado datos al HashMap
	hashmap.put("2", "P2");
	hashmap.put("3", "P3");
	
	TreeMap<String, String> treemap = new TreeMap<>(); //Creo un Treemap (también se podria hacer con una lista)
	treemap.putAll(hashmap); //Puedo pasarle los datos asi, o poniendo hasmap como parametro en el constructor
	System.out.println(treemap); //Le he añaido como parametro el hashmap, por lo tanto ya se han añaido. Los muestro
}
}
