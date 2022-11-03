package org.example;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class DebugSample {
    public static void main(String[] args) throws IOException {
        List sampleNames = createNames();
        printNames(sampleNames);
        addName(sampleNames, "Harris");
      //  System.in.read();
        printNames(sampleNames);
    }

    private static List createNames() {
        ArrayList listNames = new ArrayList<>();
        listNames.add("saqlain");
        listNames.add("Harris");
        return listNames;

    }

    private static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);

        }
    }

    private static void addName(List<String> l, String name) {
        l.add(name);
    }

    private static void removeNames(List l, String name) {
        int position = l.indexOf(name);
        if (position == -1) {
            // the name is not in the list

        } else {
            l.remove(position);
            printNames(l);
        }
    }
}
