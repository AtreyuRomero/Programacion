
import java.util.Scanner;

public class ControlNumeros {
	public static int controlnumeros(String StringEjecutar){
		
	Scanner sc = new Scanner(System.in);
	boolean false0 = false;
	
	boolean comprobar = StringEjecutar.matches("[+-]?\\d*(\\.\\d+)?");
	//En este bucle se ejecuta si no se ha introducido un n�mero
	while(false0 == comprobar) {
		System.out.println("Debes introducir un n�mero");
		StringEjecutar = sc.next();
		comprobar = StringEjecutar.matches("[+-]?\\d*(\\.\\d+)?");
		}
	
	int EneteroEjecutar = Integer.parseInt(StringEjecutar);
	return EneteroEjecutar;
	}
}
