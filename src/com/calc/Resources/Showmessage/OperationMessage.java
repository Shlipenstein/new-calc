package com.calc.Resources.Showmessage;

public class OperationMessage extends MainMessage {
    @Override
    public void sendMainMessage() {
        System.out.println("Enter the action (+,-,/,*): ");
    }
}
