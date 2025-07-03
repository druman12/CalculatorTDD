package org.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Calculator {
    public int addition(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        // if there is not specified delimiter then
        String delimiter = ",|\n";

        if (numbers.startsWith("//[")) {
            int newlineIndex = numbers.indexOf("\n");
            //cover the part of string from index 2 to new line.
            String delimiterPart = numbers.substring(2, newlineIndex); // e.g. [***]
            // content is now from new line to end
            String content = numbers.substring(newlineIndex + 1);

            delimiter = Pattern.quote(delimiterPart.substring(1, delimiterPart.length() - 1)); // remove square brackets
            numbers = content;
        }
        else  if (numbers.startsWith("//")) {        // specified delimiter always start with //
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
