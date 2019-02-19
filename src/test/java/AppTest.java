
import eqAndhash.Person;
import javafx.util.Pair;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class AppTest {

    private int exp;
    private List<Integer> collection;

    public AppTest(Pair<Integer, List<Integer>> pair){
        this.exp = pair.getKey();
        this.collection = pair.getValue();
    }

    @Parameters
    public static List<Pair> data(){

        List<Pair> pairs = new ArrayList<>();
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person());

        try {
            Scanner scanner = new Scanner(new File("in.txt"));

            String col;
            List<Integer> list;
            Integer key;

            while (scanner.hasNext()){
                col = scanner.nextLine();
                list = Arrays.stream(col.split(" "))
                        .mapToInt(Integer::parseInt)
                        .boxed()
                        .collect(Collectors.toList());
                key = Integer.valueOf(scanner.nextLine());

                Pair<Integer, List<Integer>> data = new Pair<>(key, list);
                pairs.add(data);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return pairs;
    }

    @Test()
    public void sum() {

        Math math = new Math();

        assertEquals( exp, math.getSum(collection));

    }

    @Test
    public void getMid(){

        Math math = new Math();


        HashSet<Integer> set = new HashSet<Integer>();



        set.add(145);
        set.add(70);
        set.add(55);


        assertEquals(90, math.getMid(set));

    }

    @Test
     public void mult() {
        Math math = new Math();

        assertEquals(0, math.mult(-1,0));

    }
}