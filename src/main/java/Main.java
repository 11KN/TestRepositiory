
import java.util.*;

public class Main {

    public static void main(String[] args) {


//        SortedSet sortedSet = new TreeSet();
//
//        sortedSet.add("First");
//        sortedSet.add("First");
//
//        sortedSet.add("Second");
//
//        for (Iterator it = sortedSet.iterator(); it.hasNext();) {
//
//            System.out.println(it.next());
//
//        }



        HashMap<Integer, Book> bookMap = new HashMap<Integer, Book>();

        bookMap.put(0, new Book("Stendal", "Black and red"));
        bookMap.put(3, new Book("Author C.D.", "SH"));
        bookMap.put(1, new Book("Author C.D.", "SH - 2"));

        bookMap.put(2, new Book("J. Rouling", "Harry Potter"));


//        for (int i = 0; i < bookMap.size(); i++){
//            System.out.println(bookMap.get(i) + " - " + bookMap.get(i).equals(new Book("Author C.D.", "SH")));
//        }


        for (Map.Entry<Integer, Book> entry: bookMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

        for (Map.Entry<Integer, Book> entry: bookMap.entrySet()) {
             if (bookMap.get(entry.getKey()).equals(new Book("J. Rouling", "Harry Potter"))){
                System.out.println(entry.getKey() + " - " + entry.getValue());
             }
        }

        System.out.println(bookMap.containsKey(3));


    }

}
