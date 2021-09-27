/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex39;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class AppTest {
    sortingData s;

    @BeforeEach
    void setUp() {
        s = new sortingData();
    }

    @Test
    void compareAscendTest(){
        // going to add new map to compare that is already in alphabetical order
        Map<String, String> map1 = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<String, String>();
        Map<String, String> map3 = new HashMap<String, String>();
        Map<String, String> map4 = new HashMap<String, String>();
        Map<String, String> map5 = new HashMap<String, String>();
        Map<String, String> map6 = new HashMap<String, String>();
        // adding map 1 entry
        map1.put("First", "Jacquelyn");
        map1.put("Last", "Jackson");
        map1.put("Position", "DBA");
        map1.put("Separation Date", "");
        // adding map 2 entry
        map2.put("First", "Jake");
        map2.put("Last", "Jacobson");
        map2.put("Position", "Programmer");
        map2.put("Separation Date", "");
        // adding map 3 entry
        map3.put("First", "John");
        map3.put("Last", "Johnson");
        map3.put("Position", "Manager");
        map3.put("Separation Date", "2016-12-31");
        // adding map 4 entry
        map4.put("First", "Michaela");
        map4.put("Last", "Michaelson");
        map4.put("Position", "District Manager");
        map4.put("Separation Date", "2015-12-19");
        // adding map 5 entry
        map5.put("First", "Sally");
        map5.put("Last", "Weber");
        map5.put("Position", "Web Developer");
        map5.put("Separation Date", "2015-12-18");
        // adding map 6 entry
        map6.put("First", "Tou");
        map6.put("Last", "Xiong");
        map6.put("Position", "Software Engineer");
        map6.put("Separation Date", "2016-10-05");
        // creating list to store maps
        ArrayList output = new ArrayList();
        // adding to list
        output.add(map1);
        output.add(map2);
        output.add(map3);
        output.add(map4);
        output.add(map5);
        output.add(map6);

        // input list
        ArrayList input = s.maps();
        // using function to sort input list
        ArrayList actual = s.compareAscend(input);

        // test to see if the ordered input list and already ordered output list are in same order
        assertArrayEquals(output.toArray(), actual.toArray());
    }
}
