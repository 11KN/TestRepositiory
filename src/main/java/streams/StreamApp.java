package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApp {

    public static String numToText(int num){
        switch (num){
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            default:return "zero";

        }
    }

    public static void main(String[] args) {


        //1. дано: массив строк. найти i-тый элемент,
        // иначе возвращаем строку “MISSING”

//        int i = 2;
//
//        String []strings = {"24", "64", "35", "grg", "  e", "  "};
//
//        String elem = Arrays.stream(strings)
//                .skip(i).findFirst().orElse("MISSING");
//
//        System.out.println(elem);


        //2. взять с i по j элемент из стрима (допускаем что в
        // массиве больше j элементов


//        int i = 2;
//        int j = 7;
//
//        String []strings = {"24", "64","64", "35", "grg", "  e", " 3 ", "35", "grg", "  e", "  "};
//
//        String []stringIJ = Arrays.stream(strings)
//                .skip(i)
//                .limit(j-i)
//                .toArray(size -> new String[size]);
//
//        Arrays.stream(stringIJ).forEach(System.out::println);


        //3. то же самое, что и 2, но если нет всех элементов
        // между i и j вернуть пустой список

        int i = 2;
        int j = 7;

        List<String> strings = new ArrayList<String>(Arrays.asList("24", "64","64", "35"));


        List<String> stringIJ =  strings.stream()
                .skip(i)
                .limit(j-i)
                .collect(Collectors.toList());



        stringIJ.stream().forEach(System.out::println);

        System.out.println(stringIJ.size());




        //4. из стрима строк содержащих числа сделать
        // стрим чисел, которые потом возвести в куб

//        String [] numbers = {"2", "3", "8", "1", "6"};
//
//        Arrays.stream(numbers)
//                .map(Integer::parseInt)
//                .map(x -> x*x*x)
//                .forEach(System.out::println);


        //5. преобразовать стрим чисел в стрим текстового представления
        // (отдельная функция, 1 = one, 5 = five, etc) числа, и выбрать
        // самое длинное слово (five, т.к. длиннее one)

//        Integer []num = {2,7,7,1,5,8,3,1,9};
//
//        String number = Arrays.stream(num).map(x -> numToText(x)).
//                max(Comparator.comparingInt(String::length))
//                .get();
//
//        System.out.println(number);


        //6. выбрать уникальные строки с использованием стримов (2 способа)

//        List<Integer> list = Arrays.asList(2, 7, 7, 1, 5, 8, 3, 1, 9, 5, 2, 4);
//
//        List<Integer> unList = list.stream().distinct().collect(Collectors.toList());



        //7. из стрима чисел получить карту значений,
        // где ключ - текстовое представление числа,
        // а значение - число умноженное на 2

//
//        Map<String, Integer> numbersMap = unList.stream()
//                .collect(Collectors
//                        .toMap(StreamApp::numToText, x -> x * 2 ));
//
//        numbersMap.entrySet().stream().forEach(System.out::println);
//
//
//        //8. из карты пункта 7 сделать карту наоборот -
//        // поменять ключ и значения местами (пара способов)
//
//        Map<Integer, String> numbersMapInverse = numbersMap.entrySet()
//                .stream()
//                .collect(Collectors.toMap(
//                        k -> k.getValue(),
//                        k -> k.getKey()
//                ));
//
//
//        numbersMapInverse.entrySet().stream().forEach(System.out::println);


        // 9. сделать метод, который принимает параметр i, которое задает
        // самое большое число в стриме. первый элемент стрима 2. вывести
        // на экран пара значений - текущий элемент и “число“. “число” это
        // дробное число, полученное из текущего элемента поделенного на
        // (текущий элемент - 1)

//        Integer first = 2;
//
//        Integer num = 4;
//
//
//        Map<Integer, Double> collect = Stream.iterate(first, x -> x + 1)
//                .limit(num - first + 1)
//                .collect(Collectors.toMap(x -> x, x -> x.doubleValue()/(x-1)));
//
//        collect.entrySet().stream().forEach(System.out::println);


    }


}
