package eqAndhash;

import java.util.HashSet;
import java.util.Set;

public class AppEqualsAndHash {

    public static void main(String[] args) {

        Person person1 = new Person(35, "Bill", "Terner");

        Person person2 = new Person(35, "Bill", "Terner");

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person1.equals(person2));

        Set<Integer> set =new HashSet<>();



    }

}
