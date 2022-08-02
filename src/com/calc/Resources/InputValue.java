package com.calc.Resources;
import com.calc.Resources.Showmessage.MainMessage;
import com.calc.Resources.Showmessage.NumberMessage;
import com.calc.Resources.Showmessage.OperationMessage;

import java.util.Scanner;

public class InputValue {
        private int firstNumber, secondNumber, number;
        private String action;
        private MainMessage numberMessage = new NumberMessage();
        private MainMessage operationMessage = new OperationMessage();
        private Scanner scanner = new Scanner(System.in);

        public void inputValue () {
            numberMessage.sendMainMessage();
            inputNumber();
            this.firstNumber = number;

            operationMessage.sendMainMessage();
            inputOperation();

            numberMessage.sendMainMessage();
            inputNumber();
            this.secondNumber = number;

        }

        private int inputNumber () {
            number = scanner.nextInt();
            return number;
        }

        private String inputOperation () {
            action = scanner.next();
            return action;
        }

        public int getfirstNumber () {
            return firstNumber;
        }

        public int getsecondNumber () {
            return secondNumber;
        }

        public String getAction () {
            return action;
        }


    }
