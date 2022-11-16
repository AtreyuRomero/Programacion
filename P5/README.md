# P5: Excepciones y Herencias

>>Todos los ejercicios están en el main, pero algunos tienen referencias a otras clases, en este trabajo no hay menú y el usuario solo interacciona en el ejercicio 4.

## Ejercicio 1

<span style="color:green">El código funciona correctamente y no me ha dado problemas.</span>

## Ejercicio 2
< Estas RuntimeException se diferencian del resto de excepciones en que no son de tipo checked. Una excepción de tipo checked debe ser capturada o bien especificar que puede ser lanzada de forma obligatoria, y si no lo hacemos obtendremos un error de compilación. >

## Ejercicio 3

    int[] intArray={2, -4, 15, 25};
		try {		
		//posicion(intArray.length -1, 5); //Fuerzo a que salga la excepción
		System.out.println(intArray[7]);
		}catch(Exception ex){
            System.out.println(ex.getMessage());
            }
<span style="color:green">El código funciona correctamente.</span>
## Ejercicio 4

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
<span style="color:green">El código funciona correctamente.</span>
## Ejercicio 5
Este ejercicio esta en el README de EX_05.
