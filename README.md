
# **INFORME DE INVESTIGACION**
![Enlace a GitHub](Assets/ups-icc.png)


### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Axel Banegas - [Enlace a GitHub](https://github.com/axelbanegas)
- Pedro Panjon - [Enlace a GitHub](https://github.com/PedroP57xd)

# Objetivos:

- Adquirir mayor conocimiento sobre la eficiencia de los distintos algoritmos.

- Poder reconocer la complejidad de los algoritmos implementados dentro de un programa.


# Marco Teórico: 

## **1. Teoría de la Complejidad**

*(Aquí el estudiante coloca su investigación)*

### 1.1 Definición general
Es un enfoque científico que estudia sistemas complejos (como los biológicos, sociales o naturales) reconociendo que no se pueden entender analizando sus partes de forma aislada, sino como un todo interconectado.

### 1.2 Importancia en la resolución de problemas

La teoría de la complejidad computacional es fundamental para entender qué tan difícil es resolver un problema con un algoritmo. No solo clasifica los problemas según los recursos necesarios (tiempo y espacio), sino que también guía la elección y el diseño de soluciones eficientes.

  🔍  ¿Por qué es importante?

- Permite evaluar la eficiencia de los algoritmos: Saber si un algoritmo es O(n), O(n²) u O(2ⁿ) ayuda a anticipar su rendimiento a diferentes escalas.

-    Ayuda a identificar problemas intratables: Algunos problemas, como los NP-completos, no tienen soluciones eficientes conocidas. Reconocerlos permite evitar enfoques inviables y buscar aproximaciones o heurísticas.

 -   Optimiza el uso de recursos: Un buen entendimiento de la complejidad evita desperdiciar tiempo computacional y memoria.

  -  Guía la toma de decisiones: En proyectos reales, un algoritmo “perfecto” pero demasiado lento puede ser inútil. Analizar la complejidad ayuda a elegir la estrategia más práctica.

   - Fomenta mejores prácticas de desarrollo: Comprender el impacto del crecimiento de los datos obliga a escribir código más limpio, escalable y sostenible.

### 1.3 Eficiencia de algoritmos

* Coste temporal:

    El coste temporal de un algoritmo se refiere al número de operaciones que debe realizar para completar su tarea en función del tamaño de la entrada n. Se mide con notación Big-O, que describe cómo crece el tiempo de ejecución cuando aumentan los datos. Por ejemplo, una búsqueda lineal tiene un coste O(n) porque necesita recorrer todos los elementos, mientras que una búsqueda binaria reduce el tiempo a O(\log n) al dividir el problema en mitades sucesivas.

* Coste espacial:

    El coste espacial mide la cantidad de memoria que un algoritmo necesita para ejecutarse correctamente. Incluye la memoria fija (variables y código), la memoria dependiente del tamaño de la entrada y la memoria adicional usada en estructuras auxiliares o recursión. Por ejemplo, MergeSort requiere O(n) espacio extra para arreglos temporales, mientras que algoritmos in-place como Quicksort solo necesitan O(\log n) espacio por la pila de recursión.


### 1.4 Factores de tiempo de ejecución

* Factores propios:

    Son características internas del algoritmo que determinan su eficiencia, independientemente del entorno donde se ejecute.

    Estructura del algoritmo: número de bucles, recursión, llamadas anidadas, etc.

    Complejidad temporal y espacial: qué tan rápido crecen las operaciones respecto al tamaño de entrada.

    Eficiencia de las operaciones usadas: búsquedas, ordenamientos, acceso a estructuras de datos, etc.

    Elección de estructuras de datos: algunas permiten operaciones más rápidas (por ejemplo, hash tables vs. listas).

    Estos factores no cambian según el hardware: dependen solo del diseño del algoritmo.

* Factores circunstanciales:

    Son condiciones externas que pueden afectar el tiempo real que tarda un algoritmo en ejecutarse.

    - Hardware disponible: velocidad del procesador, número de núcleos, memoria RAM, disco, GPU.

    - Carga del sistema: otros procesos ejecutándose simultáneamente.

    - Lenguaje de programación y compilador: algunos lenguajes generan código más optimizado.

    - Implementación específica de librerías o funciones estándar.

    - Sistema operativo y arquitectura.

    - Estos factores pueden variar incluso con el mismo algoritmo y afectan el rendimiento práctico.

📊 Métodos de análisis del rendimiento 
    
* Análisis teórico:

    Estudia el rendimiento del algoritmo de forma abstracta, independientemente del hardware.

    - Utiliza notaciones como O(n), Ω(n), Θ(n).

    - Permite comparar algoritmos según su crecimiento asintótico.

    - No mide tiempos reales, sino cómo escalan las operaciones para entradas grandes.

    - Es útil para elegir el algoritmo más adecuado desde una perspectiva general.

    Ejemplo: determinar que un algoritmo de ordenamiento es O(n log n) sin ejecutarlo.

* Análisis experimental

    Evalúa el comportamiento real del algoritmo mediante pruebas prácticas.

    - Se mide el tiempo de ejecución en distintos escenarios y tamaños de entrada.

    - Permite observar el impacto de factores circunstanciales.

    - Útil para comparar implementaciones, lenguajes, máquinas o versiones de código.

    - Puede descubrir comportamientos inesperados no visibles en el análisis teórico.

    Ejemplo: medir cuánto tarda realmente un algoritmo para n = 10⁶ en una máquina específica.

### 1.5 Notación de complejidad

* Big O:

    La notación Big O describe el límite superior del crecimiento de un algoritmo, es decir, cómo aumenta el número de operaciones en función del tamaño de la entrada n. Se utiliza para expresar el peor comportamiento posible en términos de tiempo o espacio, ignorando constantes y factores menores. Por ejemplo, un algoritmo de ordenamiento rápido tiene complejidad O(n\log n) en promedio, lo que significa que su tiempo de ejecución crece proporcionalmente a n\log n.

* Mejor caso:

     El mejor caso representa la situación más favorable para un algoritmo, cuando la entrada está en condiciones óptimas y el número de operaciones es mínimo. Por ejemplo, en la búsqueda lineal, si el elemento buscado está en la primera posición, el coste es O(1). Aunque es útil conocerlo, rara vez se usa como referencia principal porque no refleja el comportamiento típico.
* Peor caso:

    El peor caso indica el máximo número de operaciones que un algoritmo puede necesitar, es decir, el escenario más desfavorable. Es el más utilizado en análisis porque garantiza que el algoritmo no será más lento que ese límite. Por ejemplo, en la búsqueda lineal, si el elemento está al final o no existe, el coste es O(n).

* Caso promedio:

    El caso promedio estima el número esperado de operaciones considerando todas las posibles entradas y su probabilidad de ocurrencia. Es más realista que el mejor caso y más optimista que el peor caso. Por ejemplo, en la búsqueda lineal, si el elemento está distribuido aleatoriamente, el coste esperado es , que se simplifica a .

* Big O, Ω, Θ:

    Estas tres notaciones describen distintos límites de complejidad. Big O () indica el límite superior (máximo crecimiento). Omega () indica el límite inferior (mínimo crecimiento posible). Theta () indica el crecimiento exacto cuando el límite superior e inferior coinciden. Por ejemplo, para la búsqueda lineal, el tiempo de ejecución es  en el mejor caso,  en el peor caso, y  en el comportamiento general.


---

## **2. Ejemplos de Complejidad en Java**

---

## **2.1 Complejidad O(1) – Constante**

### **Archivo:** `ComplejidadConstante.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(1)");
    int x = 10;
    int y = 5;
    int suma = x + y;
}
```

### **Explicación resumida**

Este algoritmo siempre realiza la misma cantidad de operaciones sin importar el tamaño de la entrada. La suma de dos números y la impresión en pantalla son acciones fijas, por lo que el tiempo de ejecución no crece con n.

---
## **2.2 Complejidad O(n) – Tiempo lineal**

### **Archivo:** `ComplejidadLineal.java`

### **Código del ejemplo**

```java
public static void lineal(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
```

### **Explicación resumida**

Explicación resumida: El algoritmo recorre todos los elementos del arreglo una sola vez. El número de operaciones depende directamente del tamaño de la entrada n. Si el arreglo tiene 10 elementos, se hacen 10 impresiones; si tiene 100, se hacen 100. Por eso es lineal.

---
## **2.3 Complejidad O(n²) – Tiempo cuadrático**

### **Archivo:** `ComplejidadCuadratica.java`

### **Código del ejemplo**

```java
public static void cuadratica(int[] arr) {
        for (int i : arr) {
            for (int j : arr) {
                System.out.println(i + ", " + j);
            }
        }
    }
```

### **Explicación resumida**

Explicación resumida: Aquí se usan dos bucles anidados, lo que significa que por cada elemento del arreglo se recorre nuevamente todo el arreglo. El número de operaciones es proporcional a n\times n, es decir, n^2. Por eso se clasifica como cuadrática.

---
## **2.4 Complejidad O(log n) – Tiempo logarítmico**

### **Archivo:** `ComplejidadLogaritmico.java`

### **Código del ejemplo**

```java
public static boolean logaritmica(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arr[medio] == objetivo) {
                return true;
            } else if (arr[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return false;
    }
```

### **Explicación resumida**

Explicación resumida: El algoritmo aplica búsqueda binaria, dividiendo el arreglo a la mitad en cada iteración. En lugar de recorrer todos los elementos, reduce el problema a la mitad sucesivamente. El número de pasos crece en proporción a \log n, lo que lo hace logarítmico.

---
## **2.5 Complejidad O(n log n) – Merge Sort**

### **Archivo:** `ComplejidadMergeSort.java`

### **Código del ejemplo**

```java
public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] izquierda = java.util.Arrays.copyOfRange(arr, 0, mid);
        int[] derecha = java.util.Arrays.copyOfRange(arr, mid, arr.length);

        return merge(mergeSort(izquierda), mergeSort(derecha));
    }
```

### **Explicación resumida**

Explicación resumida: Merge Sort divide el arreglo en mitades recursivamente (\log n divisiones) y en cada nivel combina los elementos (n operaciones). Al multiplicar ambos factores, la complejidad total es O(n\log n).

---


# **Conclusiones**

1. En el presente informe adquirimos diferentes conocimientos acerca de los algoritmos de ordenamiento y su complejidad dentro de un programa, cuáles son sus características y factores que influyen en el desarrollo de los mismos y cómo podemos aprovechar sus recursos para hacerlos una herramienta en nuestros futuros programas. 

**POR ESTUDIANTE**: Axel David Banegas Lazo

2. En conclusion, gracias a esta investigacion se logro comprender lo que necesita un programa tanto en tiempo y espacio para poder funcionar de la manera mas eficiente, y mas especificamente en los metodos que se han venido trabajando en las ultimas clases, asi podremos comparar varios algoritmos y poder eleguir correctamente el mas eficiente para cada problematica, creando asi codigo rapido y ordenado. 

**POR ESTUDIANTE**: Pedro Fernando Panjón Peralta

---