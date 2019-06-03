package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input){
        int count = 0;
        ArrayList<String> subs = new ArrayList<>(0);

        for (int i = 0; i < input.length(); i++){
            for (int j = i+1; j <= input.length(); j++){
                subs.add(input.substring(i, j));
            }
        }

        for (String element : subs){
            String reversed = new StringBuilder(element).reverse().toString();
            if (element.equals(reversed)){
                count++;
            }
        }

        return count;
    }
}
