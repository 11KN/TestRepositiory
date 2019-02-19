import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static Integer sum(List list){
        return 0;
    }

    public static void main(String[] args) {




        String string = "35 2 7 3 2 983 6 2";

        List<Integer> arrayList = Arrays.stream(string.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        for (Integer i: arrayList ) {
            System.out.println(i);
        }













        //---------ArrayList Exerceses----------------
//
//        List<Integer> colors = new ArrayList<Integer>();
//
//        colors.add(24);
//        colors.add(233);
//        colors.add(73);
//
//        colors.add(0, -345);
//
//        for (Iterator iterator = colors.iterator(); iterator.hasNext();){
//            System.out.println(iterator.next());
//
//        }
//
//        Collections.swap(colors, 0, colors.size()-1);



        //---------LinkedList Exerceses----------------

//        List<String> oldColors = new LinkedList<String>();
//        oldColors.add("Gray");
//        oldColors.add("Orange");
//
//        LinkedList<String>  colors = new LinkedList<String>();
//
//        colors.add("Black");
//        colors.add("White");
//        colors.addLast("Red");
//
//        colors.addAll(oldColors);
//
//
//        for (int i = colors.size()-1; i >= 0; i--){
//            System.out.println((colors.get(i)));
//        }
//
//        System.out.println(colors.isEmpty());


        //--------------------HashSet----------------


//        HashSet<String> hashSet = new HashSet<String>();
//
//        hashSet.add("S1");
//        hashSet.add("S2");
//
//        for (String s : hashSet    ) {
//            System.out.println(s);
//        }
//
//        TreeSet<String > newHash = new TreeSet<String>();
//
//        newHash.add("S3");
//        newHash.add("S2");
//        newHash.add("S4");
//
//        for (String s : newHash    ) {
//            System.out.println(s);
//        }









    }

}
