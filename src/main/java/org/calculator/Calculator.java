package org.calculator;

public class Calculator {
    public int addition(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        String[] nums = numbers.split(",|\n");
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
