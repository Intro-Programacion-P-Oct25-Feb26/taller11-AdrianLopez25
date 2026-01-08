# Taller 11 (Laboratorio)
## Construcción de programas usando módulos y funciones

## Actividades que se deben realizar por cada problema

1. Usar el archivo analisis_previo.txt, ubicado en el paquete respectivo al problema, para que antes de escribir el código se genere una descripción clara de la idea que va a implementar. Esta descripción debe responder, de manera general, a los siguientes aspectos: Qué datos necesita el programa. Qué proceso principal se realiza sobre esos datos. Qué decisiones, condiciones, estructuras intervienen en el proceso. Qué resultado se espera obtener. La explicación debe tener entre 5 y 6 líneas, redactadas con sus propias palabras, sin utilizar fragmentos de código ni sintaxis de programación.

2. Realizar la solución en lenguaje de alto nivel


3. Usar el archivo analisis_posterior.txt, ubicado en el paquete respectivo al problema, para que despúes de generar la solución responder una pregunta de reflexión relacionada con el ejercicio desarrollado. La respuesta debe tener entre 3 y 5 líneas y centrarse en el proceso seguido, no en la repetición de la solución. Preguntas de reflexión: 

  *  ¿Qué parte del problema le resultó más difícil de comprender y por qué?

  * ¿Qué error cometió al inicio y cómo lo corrigió?

  * ¿Qué parte de la solución considera más importante?

  * ¿Qué aprendió con este ejercicio que no tenía claro antes?
  

### Problema 01

Se requiere diseñar un procedimiento (método que no retorna ningún valor) que permita procesar un arreglo bidimensional de números enteros.

El procedimiento debe recorrer completamente la estructura bidimensional y seleccionar únicamente aquellos elementos cuyo valor sea par. Los valores que cumplan esta condición deberán ser concatenados y mostrados en una única cadena de texto, respetando el orden en el que aparecen dentro del arreglo.

El procedimiento no debe generar ni devolver nuevos arreglos, sino que su función será exclusivamente procesar la información recibida y presentar el resultado por pantalla.

Para la verificación de la solución, se trabajará con el siguiente arreglo bidimensional:

```
int[][] informacion = {
  {1, 2, 3}, 
  {10, 20, 30}, 
  {100, 200, 300}
};
```
El procedimiento deberá recibir el arreglo bidimensional como parámetro y ser invocado desde el método principal (main), garantizando una adecuada separación entre la lógica de control del programa y la lógica de procesamiento de datos.

### Problema 02

Realizar una solución para el control anual de consumo eléctrico por viviendas. Se dispone de un conjunto de 10 viviendas de una urbanización. Para cada vivienda se desea registrar el consumo de energía eléctrica correspondiente a cada mes del año.

Desde un procedimiento principal se debe realizar lo siguiente:

1. Llamar y generar una función que devuelva el listado de viviendas.

    • En esta función se deben solicitar por teclado los datos correspondientes al identificador o nombre de cada vivienda.
  
    • La función debe retornar un arreglo unidimensional con los datos ingresados.
  
2. Llamar y generar una función que devuelva la matriz de consumos eléctricos mensuales.

    • En esta función se deben solicitar por teclado los valores de consumo eléctrico de cada vivienda para cada mes del año.
  
    • Los datos deben almacenarse en una matriz bidimensional, donde:
  
        ◦ Las filas representen las viviendas,
        ◦ Las columnas representen los meses del año.
        ◦ La función debe retornar dicha matriz.
3. Llamar y generar una función adicional que reciba como parámetro la matriz de consumos eléctricos.

    • Esta función debe:
  
        ◦ Calcular la suma total anual de consumo para cada vivienda,
        ◦ Almacenar los resultados en un arreglo unidimensional, donde cada posición corresponda a una vivienda.
        ◦ Retornar el arreglo de suma total de consumo por cada vivienda
      
4. Generar un procedimiento que reciba como parámetros:

    • El arreglo de viviendas,
  
    • El arreglo con la suma anual de consumo por vivienda.
  
    • Este procedimiento debe:
  
        ◦ Construir un reporte en formato de texto, utilizando una sola cadena,
        ◦ Presentar en pantalla el consumo anual correspondiente a cada vivienda.
***

### Problema 03
* Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo. Cada procedimiento debe solicitar los datos necesarios y presentar o imprimir el valor correspondiente. Se debe invocar a los procedimientos desde un método principal; Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
	* El área del cuadrado es igual a lado x lado
	* El área del triángulo es igual a (base x altura)/2
	* El área del rectángulo es igual a base x altura
***

### Problema 04
* Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble.
Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).

En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes. Y se presenta en pantalla el siguiente reporte:
Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10

En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble. Y se presenta el siguiente reporte:

Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.

En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se  llama al procedimiento calcularPredio. Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.

***
### Problema 05
Generar un función, método que devuelva la suma entre dos arreglos bidimensionales; que los recibe como parámetro.

Los arreglo para probar la solución son:
```
int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
```
El método debe se invocado desde el método main (principal); además el método debe recibir como parámetro los arreglos.


***
### Problema 06
Dado un arreglo; por ejemplo:
```
int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
```
Generar las siguiente funciones:

* Función que devuelva la media aritmética del arreglo; recibe como parámetro un arreglo de tipo entero

* Función que devuelva el valor de la desviación estándar de los valores del arreglo; recibe como parámetro un arreglo de tipo entero y un valor de tipo decimal para representar la media aritemética


Los método deben ser invocados desde el método main (principal); además, las funciones deben recibir como parámetro. En el método principal imprimir el valor de la media aritmética y el valor de la desviación estándar.

### Problema 07
* Generar una función que devuelva un arreglo unidimensional de cadenas. En dicha función se debe pedir por teclado el número de elementos de arreglo, además de ingresar los elementos por teclado, los datos a ingresar pueden ser ciudades del Ecuador.

* Generar un procedimiento que reciba como parámetro un arreglo unidimensional de cadenas; el mismo, se debe imprimir únicamente los valores del arreglo que tengan 4 o 5 caracteres.

* Desde el método principal, se debe llamar a la función que devuelva el arreglo unidimensional y además llamar al procedimiento que imprima los valores con las consideraciones expuestas.
