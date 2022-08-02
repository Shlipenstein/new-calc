package com.calc;

import com.calc.Resources.Calculating;
import com.calc.Resources.InputValue;

public class calc {
    public static void main(String[] args) {
        InputValue inputValue = new InputValue();
        inputValue.inputValue();
        Calculating calculating = new Calculating(inputValue.getfirstNumber(), inputValue.getsecondNumber(), inputValue.getAction());
        calculating.calculate();
        }


}
