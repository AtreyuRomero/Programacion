import java.util.Scanner;

public class Exercici05 {
	public static void E05(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una contraseņa");
		String contraseņa =sc.nextLine();
		int NumSimbolos = contraseņa.length() - (contarMayus(contraseņa) + contarMinus(contraseņa) + contarNums(contraseņa)); //Lo que no son, letras ni numeros lo cuento como simbolos.
		
		if(contarMayus(contraseņa)>=1 && contarMinus(contraseņa)>=1 && contarNums(contraseņa)>=1 && NumSimbolos>=1 && contraseņa.length()>=8){ //Aqui le digo q cumpla las condiciones para ser una contraseņa fuerte, si no las cumple, es debil
			System.out.println("La contraseņa es fuerte.");
		}else System.out.println("La contraseņa es debil");
		
	}
	
	
	
public static int contarMinus(String str) { //Este metodo lo uso para contar caracteres en minuscula
		
		int small=0;
        for(int i=0;i<str.length();i++){
                         // El siguiente paso es contar
        	if(str.charAt(i)<='z'&&str.charAt(i)>='a'){
                small++;
            }
        }
	return small;
	}

public static int contarMayus(String str) { //Este metodo lo uso para contar caracteres en mayusculas
	
	int big=0;
    for(int i=0;i<str.length();i++){
                     // El siguiente paso es contar
        if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
            big++;
        }
    }
return big;
}

public static int contarNums(String str) { //Este metodo lo uso para contar digitos
	
	int num=0;
	for(int i=0;i<str.length();i++){
		// El siguiente paso es contar
		if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
        num++;
		}
	}
return num;
}
}
