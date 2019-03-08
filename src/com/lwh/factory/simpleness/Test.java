package com.lwh.factory.simpleness;

public class Test {
    public static void main(String[] args) {
        Computer computer=ComputerFactory.createComputer("苹果");
        System.out.println(computer.name());
        Computer computer2=ComputerFactory.createComputer("华硕");
        System.out.println(computer2.name());

    }
}


