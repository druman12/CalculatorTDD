package org.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int addition(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        // if there is not specified delimiter then
        String delimiter = ",|\n";
        // specified delimiter always start with //
        if (numbers.startsWith("//")) {
            // extract the customer delimiter
            int index = numbers.indexOf("\n");
            delimiter = java.util.regex.Pattern.quote(numbers.substring(2, index));

            numbers = numbers.substring(index + 1); // new number string after the delimiter
        }
        String[] nums = numbers.split(delimiter); // split the number with updated delimiter
        int sum = 0;

        List<Integer> negatives = new ArrayList<>();


        for (String num : nums) {
            String trimmed = num.trim();
            if (!trimmed.isEmpty()) {
                int n = Integer.parseInt(trimmed);
                if (n < 0){
                    negatives.add(n);
                }else if (n <= 1000) {
                    sum += n;
                }
                // numbers > 1000 are ignored
            }
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
        }
        return sum;
    }
}
