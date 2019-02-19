import java.util.Collection;

public class Math {

    Math math;

    public Math() {
    }


    public int getSum(Collection<Integer> collection){
        Integer sum = 0;
        for (Integer i : collection) {
            sum += i;
        }

        return sum;
    }

    public int getMid(Collection<Integer> collection){
        return getSum(collection)/collection.size();
    }

    public int mult(Integer a, Integer b){
        return a * b;
    }

}
