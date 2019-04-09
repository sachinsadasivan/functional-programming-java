package org.sachin.java.functinalprogramming.chapter.one.simplegreeter;

public class SimpleGreeter {

    public void greet() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        SimpleGreeter greeter = new SimpleGreeter();
        greeter.greet();
    }

}
