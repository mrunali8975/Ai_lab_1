package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        environment e = new environment();
        SimpleReflexAgent simpleReflexAgent = new SimpleReflexAgent();


           int n= simpleReflexAgent.suck();
        System.out.println(n);

    }
}
