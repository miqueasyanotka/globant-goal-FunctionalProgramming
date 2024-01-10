| **Código Java**                                                                                                                                                                | **Resultado**            | **Descripción**                                                                             |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------|---------------------------------------------------------------------------------------------|
| `(a, b) -> a + b` `n -> n % 2 == 0`                                                                                                                                            | -                        | **Expresiones Lambda:** Suma de dos números y Verificación de paridad.                      |
| ```List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6) ``` <br> ```numeros = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList())```                      | `[2, 4, 6]` `[4, 8, 12]` | **Interfaces Funcionales:** Filtrar números pares y Duplicar elementos de una lista.        |
| ```List<String> nombres = Arrays.asList("Ana", "Juan", "Pedro")` `nombres.forEach(System.out::println)`                                                                          | - `15`                   | **Métodos de Referencia y Streams:** Imprimir lista y Sumar elementos de una lista.         |
| ```List<String> frutas = List.of("Manzana", "Plátano", "Fresa")` `Map<String, Integer> edades = Map.of("Juan", 25, "Ana", 30, "Pedro", 28)`                                      | -                        | **Inmutabilidad y Colecciones Inmutables:** Crear listas y mapas inmutables.                |
| ```Function<Integer, Integer> cuadrado = x -> x * x` `Function<Integer, Integer> doble = x -> x * 2` `Function<Integer, Integer> cuadradoDoble = cuadrado.andThen(doble)`        | `50`                     | **Composición de Funciones:** Componer funciones para cuadruplicar un número.               |
| ```Function<String, Integer> convertirAEntero = s -> { try { return Integer.parseInt(s); } catch (NumberFormatException e) { return 0; } }`                                      | -                        | **Manejo de Excepciones con Lambda:** Manejar excepciones al convertir String a Integer.    |
| ```Supplier<List<String>> listaVacia = ArrayList::new`                                                                                                                           | -                        | **Referencias de Constructores:** Crear instancia de lista vacía.                           |
| -                                                                                                                                                                              | -                        | **Programación Reactiva:** Ejemplo básico con Reactor.                                      |
| ```Optional<String> nombre = Optional.ofNullable(algunMetodoQueDevuelveNull())`                                                                                                  | -                        | **Monads:** Utilizar `Optional` como un tipo monádico.                                      |
| ```int suma = numeros.parallelStream().mapToInt(Integer::intValue).sum()`                                                                                                        | -                        | **Streams Paralelos:** Calcular la suma de una lista de manera paralela.                    |
| ```Function<Integer, Function<Integer, Integer>> sumaCurried = a -> b -> a + b`                                                                                                  | -                        | **Currying y Parcialización de Funciones:** Ejemplo de currying en Java.                    |
| ```public final class Punto { private final int x; private final int y; public Punto(int x, int y) { this.x = x; this.y = y; } }`                                                | -                        | **Tipos de Datos Inmutables:** Ejemplo básico de una clase inmutable.                       |
| ```int suma = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum()`                                                                                        | `15`                     | **Programación Funcional en Estilo Declarativo:** Filtrar, mapear y sumar en un solo flujo. |
| ```Function<Integer, Integer> factorial = n -> n == 0 ? 1 : n * factorial.apply(n - 1)`                                                                                          | -                        | **Recursión Funcional:** Calcular el factorial de un número de manera recursiva.            |
| ```Stream<String> stream = Stream.of("uno", "dos", "tres")` `Stream<String> resultado = stream.map(s -> { System.out.println("Transformando: " + s); return s.toUpperCase(); })` | -                        | **Estrategias de Evaluación:** Ejemplo básico de evaluación perezosa con Stream.            |




| **Código Java** | **Resultado** | **Descripción** |
|-----------------|---------------|-----------------|
| ```java (a, b) -> a + b
```<br>```java |
n -> n % 2 == 0
   ``` | - | **Expresiones Lambda:** Suma de dos números y Verificación de paridad. |
| ```java
   List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
   numeros = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
   ```<br>```java
   List<Integer> duplicados = numeros.stream().map(n -> n * 2).collect(Collectors.toList());
   ``` | `[2, 4, 6]`<br>`[4, 8, 12]` | **Interfaces Funcionales:** Filtrar números pares y Duplicar elementos de una lista. |
| ```java
   List<String> nombres = Arrays.asList("Ana", "Juan", "Pedro");
   nombres.forEach(System.out::println);
   ```<br>```java
   int suma = numeros.stream().reduce(0, Integer::sum);
   ``` | -<br>`15` | **Métodos de Referencia y Streams:** Imprimir lista y Sumar elementos de una lista. |
| ```java
   List<String> frutas = List.of("Manzana", "Plátano", "Fresa");
   ```<br>```java
   Map<String, Integer> edades = Map.of("Juan", 25, "Ana", 30, "Pedro", 28);
   ``` | - | **Inmutabilidad y Colecciones Inmutables:** Crear listas y mapas inmutables. |
| ```java
   Function<Integer, Integer> cuadrado = x -> x * x;
   Function<Integer, Integer> doble = x -> x * 2;
   Function<Integer, Integer> cuadradoDoble = cuadrado.andThen(doble);
   ``` | `50` | **Composición de Funciones:** Componer funciones para cuadruplicar un número. |
| ```java
   Function<String, Integer> convertirAEntero = s -> {
       try {
           return Integer.parseInt(s);
       } catch (NumberFormatException e) {
           return 0;
       }
   };
   ``` | - | **Manejo de Excepciones con Lambda:** Manejar excepciones al convertir String a Integer. |
| ```java
   Supplier<List<String>> listaVacia = ArrayList::new;
   ``` | - | **Referencias de Constructores:** Crear instancia de lista vacía. |
| - | - | **Programación Reactiva:** Ejemplo básico con Reactor. |
| ```java
   Optional<String> nombre = Optional.ofNullable(algunMetodoQueDevuelveNull());
   ``` | - | **Monads:** Utilizar `Optional` como un tipo monádico. |
| ```java
   int suma = numeros.parallelStream().mapToInt(Integer::intValue).sum();
   ``` | - | **Streams Paralelos:** Calcular la suma de una lista de manera paralela. |
| ```java
   Function<Integer, Function<Integer, Integer>> sumaCurried = a -> b -> a + b;
   ``` | - | **Currying y Parcialización de Funciones:** Ejemplo de currying en Java. |
| ```java
   public final class Punto {
       private final int x;
       private final int y;
   
       public Punto(int x, int y) {
           this.x = x;
           this.y = y;
       }
       // Métodos getter, sin setters
   }
   ``` | - | **Tipos de Datos Inmutables:** Ejemplo básico de una clase inmutable. |
| ```java
   int suma = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
   ``` | `15` | **Programación Funcional en Estilo Declarativo:** Filtrar, mapear y sumar en un solo flujo. |
| ```java
   Function<Integer, Integer> factorial = n -> n == 0 ? 1 : n * factorial.apply(n - 1);
   ``` | - | **Recursión Funcional:** Calcular el factorial de un número de manera recursiva. |
| ```java
   Stream<String> stream = Stream.of("uno", "dos", "tres");
   Stream<String> resultado = stream.map(s -> {
       System.out.println("Transformando: " + s);
       return s.toUpperCase();
   });
   ``` | - | **Estrategias de Evaluación:** Ejemplo básico de evaluación perezosa con Stream. |



