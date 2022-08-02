package com.calc.Resources;
import com.calc.Resources.Showmessage.ResultMessage;

public class Calculating implements CalcInterface {
    private final int firstNumber, secondNumber;
    private double result;
    private final String action;

    public Calculating(int firstNumber, int secondNumber, String action) {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
        this.action=action;
    }

    @Override
    public void calculate() {

        switch (action) {
            case "+":
                result = firstNumber + secondNumber;
                new ResultMessage(result).sendMainMessage();
                break;
            case "-":
                result = firstNumber - secondNumber;
                new ResultMessage(result).sendMainMessage();
                break;
            case "*":
                result = firstNumber * secondNumber;
                new ResultMessage(result).sendMainMessage();
                break;
            case "/":
                if (secondNumber != 0) {
                    result = (double) firstNumber / secondNumber;
                    new ResultMessage(result).sendMainMessage();
                }else {
                    throw new IllegalArgumentException("Invalid value. In this simple calculator, division by zero is not allowed. Please select a different value.");
                }
                break;
            default:
                System.out.println("Invalid Action, please enter valid value.");

        }
    }
}
