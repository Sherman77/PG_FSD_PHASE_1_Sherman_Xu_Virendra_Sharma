package General;

import java.util.TreeSet;

public class Practice2 {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Python");
        ts.add("Java");
        ts.add("C++");
        ts.add("C");
        ts.add("Python3");
        ts.add("Swift");

        ts.remove("Python");
        ts.remove("Java");

        ts.add("Javascript");
        ts.add("Ruby");
        ts.add("C#");

        System.out.println(ts.contains("Java"));
        while (!ts.isEmpty()) {
            String element = ts.pollLast();
            System.out.println(element);
        }
    }
}
