package com.calc.Resources.Showmessage;

public class ResultMessage extends MainMessage {
    private final double result;
    public ResultMessage(double result){
        this.result = result;
    }

    @Override
    public void sendMainMessage() {
        if (result % 1 != 0) {
            System.out.print("Calculation result = " + result);}
        else {
            System.out.println("Calculation result = " + (int) result);
            }

    }
}

