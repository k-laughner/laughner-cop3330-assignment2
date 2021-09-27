/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex40;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AppTest {
    searchingData s;

    @BeforeEach
    void setup() {
        s = new searchingData();
    }

    @Test
    void testSearchingData() {
        // adding expected search results as a list of maps
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        // adding expected results to map
        // adding map 1 entry
        map1.put("First", "Jake");
        map1.put("Last", "Jacobson");
        map1.put("Position", "Programmer");
        map1.put("Separation Date", "");
        // adding map 2 entry
        map2.put("First", "Jacquelyn");
        map2.put("Last", "Jackson");
        map2.put("Position", "DBA");
        map2.put("Separation Date", "");
        // creating and storing maps in ArrayList
        ArrayList output = new ArrayList();
        output.add(map1);
        output.add(map2);

        // actual results using function
        ArrayList input = s.maps();
        String search = "ja";
        ArrayList actualOutput = s.search(input, search);

        assertArrayEquals(output.toArray(), actualOutput.toArray());
    }
}
