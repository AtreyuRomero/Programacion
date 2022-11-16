import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEyH {

	public static void main(String[] args) {
		System.out.println("------ Ejercicio 1 ------");
		String respuesta = "No";
		try{
            responder(respuesta);
        }catch(NegativeNumberException ex){
            System.out.println(ex.getMessage());
        }
		
		System.out.println("------ Ejercicio 3 ------");
		int[] intArray={2, -4, 15, 25};
		
		try {		
		//posicion(intArray.length -1, 5); //Fuerzo a que salga la excepción
		System.out.println(intArray[7]);
		}catch(Exception ex){
            System.out.println(ex.getMessage());
            }
	System.out.println("------ Ejercicio 4 ------");
	boolean t = true; 
	
	while(t){
		t=false;
		System.out.println("Introduce un número:");
		Scanner sc = new Scanner(System.in);
		try{
		int num = sc.nextInt();
		int numCuadrado=num * num;
		 System.out.println(num + " al cuadrado es " +numCuadrado);
		 t=false;
		 sc.close();
		}catch (InputMismatchException e) {
			t=true;
		}}
	}
	
	public static void responder (String frase) throws NegativeNumberException {
		if(frase == "No" || frase == "no")
		throw new NegativeNumberException("Sale esto por que ha escrito No, y no está permitido.");
		}
	
	/*public static void posicion (int len, int num) throws NegativeNumberException { //He reutiliado la clase NegativeNumberException.
		if(len < num)
		throw new NegativeNumberException("Esa posición no existe");
		}*/
	}
	