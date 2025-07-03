package org.calculator;

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
        for (String num : nums) {
            String trimmed = num.trim();
            if (!trimmed.isEmpty()) {
                sum += Integer.parseInt(trimmed);
            }
        }
        return sum;
    }
}
