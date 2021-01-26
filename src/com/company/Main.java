package com.company;

import java.util.*;

class Setter {

    public Set removeEvenLength(Set set) {

        Set s = new LinkedHashSet<String>(set);
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String st = it.next();
            if (st.length() % 2 == 0) {
                s.remove(st);
            }
        }
        return s;
    }
}

public class Main {

    public static void main(String[] args) {
        Setter c = new Setter();
        Set<String> set = new LinkedHashSet<String>(Arrays.asList("foo",
                "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));

        System.out.println("Set List: " + set);
        System.out.println("Uneven Set: " + c.removeEvenLength(set));
    }
}