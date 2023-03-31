import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Toys<T extends Toy> implements Iterable<T>, Double<T>{
    private T Toy;
    private List<T> toys = new ArrayList<>();

    public T getToy(){
        return Toy;
    }

    @Override
    public void addToy(T Toy){
        this.toys.add(Toy);
    }

    @Override
    public String print(){
        String res = new String();
        for (T toy : toys) {
            res += toy +"\n";
        }
        return res;
    }
    
    @Override
    public void sortByDroprate(){
        toys.sort(new ToysComparatorByDroprate<T>().reversed());
    }

    @Override
    public Iterator<T> iterator() {
        return new ToyIterator<T>(toys);
    }
    
}