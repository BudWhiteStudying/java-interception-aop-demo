package com.budwhite.studying.intercept.execution;

import com.budwhite.studying.sample.library.Model;
import com.budwhite.studying.sample.library.SomeImplementingClass;

public class Main {
    public static void main(String[] args) {
        try {
            (new SomeImplementingClass()).someInterfaceMethod(new Model("pippo", 7));
        }
        catch (Exception e) {
            System.err.println("Oh noes " + e.getMessage());
        }
    }
}
