package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;

import java.util.*;
import java.util.stream.Collectors;

public class ApplianceParse {


    public List<String> parse(List<String> applianceData) {
        ArrayList<String> parsedAppilianceData = new ArrayList<String>();
        Map<String, String> map = new HashMap<String, String>();
        for (java.lang.String line : applianceData) {

            map = Arrays.stream(line.split(":"))
                    .map(s -> s.split("", 2))
                    .collect(Collectors.toMap(a -> a[0], a -> a.length > 1 ? a[1] : ""));

            parsedAppilianceData.add(map.toString());
        }


        return parsedAppilianceData;


    }

    public List<String> parse(List<String> applianceData, String groupSearchName) {
        ArrayList<String> parsedAppilianceData = new ArrayList<String>();

        Map<String, String> map = new HashMap<String, String>();
        for (java.lang.String line : applianceData) {

            map = Arrays.stream(line.split(","))
                    .map(s -> s.split("", 2))
                    .collect(Collectors.toMap(a -> a[0], a -> a.length > 1 ? a[1] : ""));

            parsedAppilianceData.add(map.toString());
            for (int i=0;i< map.size();i++){
            String[] words = parsedAppilianceData.toArray()[i].toString().split(",");
            for (String word : words) {
                if (word.trim().equalsIgnoreCase(groupSearchName)) {

                    for (int j = 0; j < words.length; j++)
                        parsedAppilianceData.add(words[j]);

                }
                }

            }

        }

       // System.out.println("$$$"+groupSearchName+parsedAppilianceData);
        return parsedAppilianceData;
    }
}


