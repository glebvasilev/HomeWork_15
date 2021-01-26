package com.company;

import java.util.*;

interface Elements {
    void addElement(String name, int quantity);
    List<String> getElements();
    Set<String> removeEvenLength(Set<String> set);
}

class FilterElements implements Elements {
    /*
     *  Class serves to work with elements
     */

    Hashtable<String, Integer> set;

    public FilterElements() {

        set = new Hashtable<>();
    }

    public void addElement(String name, int quantity) {
        set.put(name, quantity);
    }

    public List<String> getElements() {
        List<String> li = Collections.list(set.keys());
        return li;
    }

    public Set<String> removeEvenLength(Set<String> set) {
       return null;
    }
}

public class Main {

    public static void main(String args[]) {

        FilterElements fe = new FilterElements();

        fe.addElement("foo", 2);
        fe.addElement("buzz",1);
        fe.addElement("bar", 3);
        fe.addElement("fork", 5);
        fe.addElement("bort", 8);
        fe.addElement("spoon", 7);
        fe.addElement("!", 1);
        fe.addElement("dude", 2);

        System.out.append("Current elements: " + fe.getElements());
        //System.out.append("Selected elements: " + fe.removeEvenLength());
        }
    }