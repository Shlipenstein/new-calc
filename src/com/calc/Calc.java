package com.calc;

import com.calc.Resources.Calculating;
import com.calc.Resources.InputValue;

public class Calc {
    public static void main(String[] args) {
        InputValue inputValue = new InputValue();
        inputValue.inputValue();
        Calculating calculating = new Calculating(inputValue.getFirstNumber(), inputValue.getSecondNumber(), inputValue.getAction());
        calculating.calculate();
        }


}
