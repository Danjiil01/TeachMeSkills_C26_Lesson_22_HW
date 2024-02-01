package org.example.model;


import lombok.Data;


@Data
public class Operation {
    private double num1;
    private double num2;
    private String operation;
    private double result;

    public Operation(double num1, double num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }
}
