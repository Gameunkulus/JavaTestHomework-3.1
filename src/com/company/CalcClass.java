package com.company;

public class CalcClass {
    public static int calculate(int price) {
        int bonus = 0;
        if (price > 20) {
            bonus = price / 20;
        }
        return bonus;
    }
}
