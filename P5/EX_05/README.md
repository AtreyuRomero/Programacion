## Enunciado del ejercicio 5
Haz un programa que divida un número introducido por el usuario, entre un número aleatorio del 0 al 2.

Si el usuario introduce un digito no numerico, el programa ha de mostrar un mensaje de «La proxima vez introduce un número.»
Al dividir por 0 debera mostrar un mensaje de «Ha habido un error, no se puede dividir por 0.»,
y al final del programa, SIEMPRE deberá indicar «Programa finalizado».

**Resultado:** 

		Random random = new Random();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce un numero");
		try {
			int num1 = sc1.nextInt();
			sc1.close();
			int value = random.nextInt(4 - 1);
			//System.out.println(value);
			int resultado = num1/value;
			System.out.println(num1+" dividido entre " + value + " da " + resultado);
		}catch (ArithmeticException n) {
			System.out.println("Ha habido un error, por que no se puede dividir entre 0");
		}catch (InputMismatchException i) {
			System.out.println("La proxima vez introduzca un número");
		}finally {
			System.out.println("El programa a finalizado :)");
		}

_El resultado también esta en el alrchivo .java_