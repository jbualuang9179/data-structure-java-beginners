package com.jbualuang9179.collection;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args) {
        // Need for a Separate Collection Framework in Java

        // Creating instances of the array,
        // vector and hashtable
        int[] arr = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String> h = new Hashtable<>();

        // Adding the element into the vector
        v.addElement(1);
        v.addElement(2);

        // Adding the element into the hashtable
        h.put(1, "collection");
        h.put(2, "collection2");

        // Array instance creation requires [],
        // while Vector and hashtable require ()
        // Vector element insertion requires addElement(),
        // but hashtable element insertion requires put()

        // Accession the first element of the
        // array, vector and hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

        // Array elements are accessed using [],
        // vector elements using elementAt()
        // and hashtable element using get()

    }
}
