# P2: Cadenas de texto y coleccionables

>Antes de empezar el ejercicio he creado un menú en el Main para poder seleccionar los ejercicios a corregir. Cada ejercicio está en una clase diferente.

## Ejercicio 1
Para resolver el ejercicio he necesitado crear Arrays, cadenas y alguna variable de tipo in. 
También he usado bucles y métodos.


<span style="color:green">El código funciona correctamente.</span>


Puedo ahorrar invertir los Arrays Nombre y Apellidos, si invierto el Array AnyA al principio del código.

No lo he hecho, puesto que tendría que cambiar el código completo y solo me ahorro un bucle.


>Lo he explicado todo en el código usando comentarios.
>

## Ejercicio 2

Para resolver este ejercicio primero he quitado todos los espacios usando el método  ```replace()``` y después los he concatenado usando  ```+```, el método ```charAt()``` y un bucle ```for```.

## Ejercicio 3
He utilizado ```lastIndexOf()``` para encontrar la posición del carácter buscado. Para que me dé la posición de la primera letra y no de la última, he borrado las letras duplicadas creando un método que lo hace, para crear dicho método me he ayudado de internet.

>Se puede buscar un caracter o una convinación de caracteres.
>
## Ejercicio 4

En este ejercicio el procedimiento es igual que el anterior pero sin el método de eliminar duplicados, ya que el  ```indexOf()``` devuelve por defecto la posición de la primera letra encontrada.

## Ejercicio 5

Para hacer este ejercicio he reutilizado los métodos para contar tipos de caracteres, de un código que hice hace tiempo para un login más complejo.
En los métodos utilizo un bucle para identificar los caracteres de cada tipo y contar cuantos hay, despues he comprobado en un ```if()``` que contenga más de 1 carácter de cada tipo, y con ```lenght()``` que tenga más de 8 caracteres en total.

<span style="color:green">El código funciona muy bien</span>

## Ejercicio 6

En este ejercicio he creado una cadena, que luego he pasado a un array de bytes y he mostrado cada carácter por pantalla. 
>Esta también explicado en el código con comentarios.
>

## Ejercicio 7

He creado una lista, a la que le he añadido palabras, y después he creado un iterator a partir de esa lista para recorrer el iterator con un bucle ```while``` que termina al no encontrar más posiciones en el iterator, usando ```hasNext()```.

### Observaciones

He buscado información sobre iterator, y no me ha quedado muy claro que es, pero si he visto como se utiliza.
<span style="color:red">No he entendido muy bien que es un iterator y cual es la diferencia entre una lista y un iterator.</span>
También he leido que ```lisIterator``` permite atravesar una lista en dos direcciones mientras que ```iterator``` solo en una (avanzando).

<span style="color:green">No obstante el código funciona bien</span>

## Ejercicio 8

He buscado información sobre lambda y he recorrido un arraylist utilizando una función lambda.

<span style="color:green">Ha funcionado</span>

## Ejercicio 9

Para este ejercicio creo un arraylist de cadenas, y le añado palabras.
Luego creo el array en el que voy a copiar los datos y le asigno el tamaño de la lista, usando .size para saber el tamaño.

Con el metodo ```toArray``` paso los datos de la lista a el array y creo un bucle for para mostrar el array.

## Ejercicio 10

Este es parecido a el Ejercicio 9, creo un HashSet, le añado palabras y lo recorro con un bucle for.

## Ejercicio 11

Creo un HashMap de cadenas y le añado palabras.
Despues he volcado el HashMap en un TreeSet y lo he mostrado.

He buscado información y he visto que también se puede hacer usando Streams, Guava o ArrayList.

***
<span style="color:blue">**Todos los ejercicios funcionan**</span>
***