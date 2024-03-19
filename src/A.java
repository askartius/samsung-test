import java.util.ArrayList;
import java.util.Iterator;

class A implements Iterable<Integer> {
    ArrayList<Integer> a = new ArrayList<>();
    void add(Integer e) {
        a.add(e);
    }

    @Override
    public Iterator<Integer> iterator() {
        return a.iterator();
    }
}