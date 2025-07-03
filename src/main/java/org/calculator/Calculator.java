package org.calculator;

public class Calculator {
    public int addition(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        String[] nums = numbers.split(",");
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
