import java.util.Scanner;

public class Exercici05 {
	public static void E05(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una contraseña");
		String contraseña =sc.nextLine();
		int NumSimbolos = contraseña.length() - (contarMayus(contraseña) + contarMinus(contraseña) + contarNums(contraseña)); //Lo que no son, letras ni numeros lo cuento como simbolos.
		
		if(contarMayus(contraseña)>=1 && contarMinus(contraseña)>=1 && contarNums(contraseña)>=1 && NumSimbolos>=1 && contraseña.length()>=8){ //Aqui le digo q cumpla las condiciones para ser una contraseña fuerte, si no las cumple, es debil
			System.out.println("La contraseña es fuerte.");
		}else System.out.println("La contraseña es debil");
		
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
