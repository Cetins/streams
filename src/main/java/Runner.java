import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {

//        List<String> myList = Arrays.asList("John", "Jarrod", "Stan", "Zsolt");
//
//        myList.stream()
//                .map(String::toUpperCase)
//                .forEach(result -> System.out.println(result));

//        Stream.of("Zsolt", "Jarrod", "Stan", "John")
//                .map(string -> string.toUpperCase())
//                .forEach(result -> {
//                    System.out.println(result);
//                });

//        Stream.of("Zsolt", "Jarrod", "Stan", "John")
//                .map(string -> string.toUpperCase())
//                .forEach(System.out::println);
//
//        List <String> streamOutput = Stream.of("Zsolt", "Jarrod", "Stan", "John")
//                .map(string -> string.toUpperCase())
//                .collect(Collectors.toList());
//
//        System.out.println(streamOutput);

//        String total = Stream.of(1, 2, 3, 4, 5, 6, 7)
//                .reduce(0, (sum, number) -> sum += number)
//                .toString();

//         Stream.of(1, 2, 3, 4, 5, 6, 7)
//                 .filter(num -> num %2 == 0)
//                 .forEach(System.out::println);

//        Stream.of(99, 1, 2, 3, 56, 4, 5, 28, 6, 7)
//                .sorted()
//                .forEach(System.out::println);

//        Stream.of(99, 1, 2, 3, 56, 4, 5, 28, 6, 7)
//                .sorted()
//                .limit(4)
//                .forEach(System.out::println);

//        OptionalDouble average =  Stream.of(99, 1, 2, 3, 56, 4, 5, 28, 6, 7)
//                .mapToInt(n -> n)
//                .average();

//        Double average =  Stream.of(99, 1, 2, 3, 56, 4, 5, 28, 6, 7)
//                .mapToInt(n -> n)
//                .average()
//                .getAsDouble();

//        int result = Stream.of(99, 1, 2, 3, 56, 4, 5, 28, 6, 7)
//                .mapToInt(n -> n)
//                .max()
//                .getAsInt();

        int result = IntStream.of(99, 1, 2, 3, 56, 4, 5, 28, 6, 7)
                .peek(numbers -> System.out.printf("original %d%n", numbers))
                .map(number -> number *2)
                .peek(numbers -> System.out.println(numbers))
                .sum();

        System.out.println(result);
    }
}
