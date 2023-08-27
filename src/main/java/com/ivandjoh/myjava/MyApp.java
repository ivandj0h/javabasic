package com.ivandjoh.myjava;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) {

        HashMap<String, Integer> hasCompany = new HashMap<String, Integer>();
        hasCompany.put("Google", 10000);
        hasCompany.put("Facebook", 20000);
        hasCompany.put("Twitter", 30000);

        // Make a Double-Line
        System.out.println("====================================");

        // Print the ArrayList
        System.out.println("Company size: " + hasCompany.size());

        // Make a Single-Line
        System.out.println("------------------------------------");

        // Check if the ArrayList is empty
        System.out.println("Is the company empty? " + hasCompany.isEmpty());

        // Make a Single-Line
        System.out.println("------------------------------------");

        // Convert HashMap to ArrayList
        System.out.println("Convert HashMap to ArrayList : ");
        for (Map.Entry<String, Integer> stringIntegerEntry : hasCompany.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " => " + stringIntegerEntry.getValue());
        }

        // Make a Single-Line
        System.out.println("------------------------------------");

        // Convert HashMap Keys to ArrayList
        System.out.println("Convert HashMap Keys to ArrayList : ");
        List<String> companyNameList = new ArrayList<String>(hasCompany.keySet());
        for (String companyName : companyNameList) {
            System.out.println(companyName);
        }

        // Make a Double-Line
        System.out.println("====================================");
    }
}
