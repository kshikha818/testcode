import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String args[ ]) {
    Map<Integer,String> states = new HashMap<Integer,String>();
    states.put(1, "INDIA");
    states.put(2, "USA");

    states.put(3, null);    // Okay
    states.put(null,"UK");

    System.out.println(states.get(1));
    System.out.println(states.get(2));
    System.out.println(states.get(3));

    }
}