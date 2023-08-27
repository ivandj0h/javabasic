package com.ivandjoh.myjava;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class MyjavaApplication {

    public static void main(String[] args) {

        // Convert hashMD5 to ArrayList
        HashMap<String, Integer> hasCompany = new HashMap<String, Integer>();
        hasCompany.put("Google", 10000);
        hasCompany.put("Facebook", 20000);
        hasCompany.put("Twitter", 30000);


        // Print the ArrayList
        System.out.println("Company size: " + hasCompany.size());

        for (Map.Entry<String, Integer> stringIntegerEntry : hasCompany.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " => " + stringIntegerEntry.getValue());
        }
    }
}
