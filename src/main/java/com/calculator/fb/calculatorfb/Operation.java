package com.calculator.fb.calculatorfb;

public class Operation {
    private String number;
    private String result;

    public Operation(String number) {
        this.number = number;
        this.result = Long.toString(fibonacci(Integer.parseInt(number)));
    }


    public static long fibonacci(int n) {
        return (long) ((Math.pow(1 + Math.sqrt(5), n) - Math.pow(1 - Math.sqrt(5), n)) /
                (Math.pow(2, n) * Math.sqrt(5)));
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
