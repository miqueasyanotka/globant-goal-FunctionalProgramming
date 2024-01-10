package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /* Métodos de referencia */
        List<String> names = Arrays.asList("Carlos", "Ana", "Pedro", "Juan");
        names.forEach(System.out::println);
        // Imprime cada nombre en la lista usando un método de referencia.

        System.out.println("numbers of elements = " + names.stream().count());
        // Cuenta el número de elementos en la lista usando un Stream.

        System.out.println("---------------------------------------");

        /* Streams */
        List<Integer> numbers = Arrays.asList(9,1,8,2,3,3,4,5,6,6,7,8,9,10,10);
        System.out.println("---------------------------------------");

        List<Integer> mul = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("mul = " + mul);
        // Duplica cada elemento en la lista y almacena los resultados en una nueva lista.

        System.out.println("---------------------------------------");

        List<Integer> pairNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("pairNumbers = " + pairNumbers);
        // Filtra los números pares de la lista y los almacena en una nueva lista.

        System.out.println("---------------------------------------");

        Integer maxNumber = numbers.stream().max(Integer::compareTo).get();
        System.out.println("maxNumber = " + maxNumber);
        // Encuentra el valor máximo en la lista.

        System.out.println("---------------------------------------");

        Integer minNumber = numbers.stream().min(Integer::compareTo).get();
        System.out.println("minNumber = " + minNumber);
        // Encuentra el valor mínimo en la lista.

        System.out.println("---------------------------------------");

        System.out.println("first = " + numbers.stream().findFirst());
        // Obtiene el primer elemento del stream (puede ser un Optional).

        System.out.println("---------------------------------------");

        // Elimina los duplicados
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinctNumbers = " + distinctNumbers);
        // Elimina los elementos duplicados de la lista y almacena los resultados en una nueva lista.

        System.out.println("---------------------------------------");

        Integer totalSum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("totalSum = " + totalSum);
        // Calcula la suma total de los elementos en la lista usando reduce.

        System.out.println("---------------------------------------");

        List<String> orderNames = names.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        System.out.println("orderNames = " + orderNames);
        // Ordena los nombres alfabéticamente y almacena los resultados en una nueva lista.


        System.out.println("---------------------------------------");
        // Map y FlatMap en Streams:
        List<String> words = Arrays.asList("Java", "Functional", "Programming");

        // Map: Convertir cada palabra a su longitud
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Word Lengths: " + wordLengths);
        System.out.println("---------------------------------------");


        // FlatMap: Convertir cada palabra a sus caracteres y obtener una lista plana
        List<Character> flatMappedChars = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Flat Mapped Characters: " + flatMappedChars);
        System.out.println("---------------------------------------");


        // Skip y Limit: Saltar los primeros 3 y limitar a 5 elementos
        List<Integer> skippedAndLimited = numbers.stream()
                .skip(3)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Skipped and Limited: " + skippedAndLimited);
        System.out.println("---------------------------------------");


        // Sorted: Ordenar los números
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);
        System.out.println("---------------------------------------");


        // Collectors:
        List<Person> people = Arrays.asList(
                new Person("John", 30),
                new Person("Alice", 25),
                new Person("Bob", 35)
        );

        // GroupingBy: Agrupar personas por edad
        Map<Integer, List<Person>> groupedByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println("Grouped by Age: " + groupedByAge);
        System.out.println("---------------------------------------");


        // PartitioningBy: Separar personas en menores y mayores de 30
        Map<Boolean, List<Person>> partitioned = people.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() > 30));
        System.out.println("Partitioned by Age: " + partitioned);
        System.out.println("---------------------------------------");


        // Joining: Obtener una cadena con los nombres concatenados
        String allNames = people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println("All Names: " + allNames);


    }

}