package org.example;

import org.example.web.WebApplication;

public class Main {
    public static void main(String[] args) {
        Applicationable application = new WebApplication();
        application.run();
    }
}

// link:  http://localhost:8080/calculate?num1=12&num2=3&type=div
