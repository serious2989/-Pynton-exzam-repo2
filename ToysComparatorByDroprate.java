import java.util.Comparator;

public class ToysComparatorByDroprate<T extends Toy> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        return o1.getDroprate().compareTo(o2.getDroprate());
    }
    
}
