package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        if ((int) number1 == (int) number2){
            if ((int)((number1 * 10)-((int)number1 * 10)) == ((int)((number2 *10)-((int)number2*10)))){
                if ((int)((number1 * 100)-((int)number1 * 100)) == ((int)((number2 *100)-((int)number2*100)))){
                    if ((int)((number1 * 1000)-((int)number1 * 1000)) == ((int)((number2 *1000)-((int)number2*1000)))){
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;

    }
}
