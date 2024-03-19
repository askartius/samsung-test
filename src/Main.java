import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String,String> map = new TreeMap<String,String>();
        map.put("A", "1");
        map.put("C", "2");
        map.put("QQ", "3");
        map.put("QW", "4");
        map.put("R", "5");
        map.put("S", "6");
        map.put("T", "7");
        map.put("QA", "8");

        SortedMap<String,String> subMap = map.subMap("Q", "R");

        System.out.println(subMap);
    }
}