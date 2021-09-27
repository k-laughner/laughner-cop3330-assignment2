/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex40;
import java.util.*;

class searchingData {
    public ArrayList maps(){
        // creating a list to store maps in
        ArrayList list = new ArrayList();

        // creating maps for each person
        Map<String, String> map1 = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<String, String>();
        Map<String, String> map3 = new HashMap<String, String>();
        Map<String, String> map4 = new HashMap<String, String>();
        Map<String, String> map5 = new HashMap<String, String>();
        Map<String, String> map6 = new HashMap<String, String>();

        // adding map 1 entry
        map1.put("First", "John");
        map1.put("Last", "Johnson");
        map1.put("Position", "Manager");
        map1.put("Separation Date", "2016-12-31");
        // adding map 2 entry
        map2.put("First", "Tou");
        map2.put("Last", "Xiong");
        map2.put("Position", "Software Engineer");
        map2.put("Separation Date", "2016-10-05");
        // adding map 3 entry
        map3.put("First", "Michaela");
        map3.put("Last", "Michaelson");
        map3.put("Position", "District Manager");
        map3.put("Separation Date", "2015-12-19");
        // adding map 4 entry
        map4.put("First", "Jake");
        map4.put("Last", "Jacobson");
        map4.put("Position", "Programmer");
        map4.put("Separation Date", "");
        // adding map 5 entry
        map5.put("First", "Jacquelyn");
        map5.put("Last", "Jackson");
        map5.put("Position", "DBA");
        map5.put("Separation Date", "");
        // adding map 6 entry
        map6.put("First", "Sally");
        map6.put("Last", "Weber");
        map6.put("Position", "Web Developer");
        map6.put("Separation Date", "2015-12-18");

        // adding the maps to a list
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);

        return list;
    }
    // method to search the data
    public ArrayList search(ArrayList <Map<String, String>>list, String search) {
        // creating arrayList for maps that match the search
        ArrayList<Map<String, String>> searchResults = new ArrayList<>();
        // setting String search to lower case
        search = search.toLowerCase();
        // checks each map to see if the first and last contains the search string
        for (int i=0; i<list.size(); i++){
            // convert to lower case so that case will not throw off search results
            String first = list.get(i).get("First").toLowerCase();
            String last = list.get(i).get("Last").toLowerCase();
            if (first.contains(search) || last.contains(search)) {
                searchResults.add(list.get(i));
            }
        }
        return searchResults;
    }
}
public class App {
    public static void main(String[] args){
        // getting search input
        System.out.println("Enter a search string: ");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();

        // calling search functions to search the data
        searchingData d = new searchingData();
        ArrayList <Map<String,String>> list = d.search(d.maps(), search);

        // printing search results
        System.out.println("Name                      | Position             | Separation Date");
        System.out.println("--------------------------|----------------------|-----------------");
        for (int i=0; i<list.size(); i++) {
            String name = list.get(i).get("First") + " " + list.get(i).get("Last");
            System.out.format("%-25s | %-20s | %-15s\n", name, list.get(i).get("Position"), list.get(i).get("Separation Date"));
        }
    }
}
