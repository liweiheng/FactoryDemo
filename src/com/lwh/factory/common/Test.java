package com.lwh.factory.common;


public class Test {
    public static void main(String[] args) {
        Computer computer=ComputerFactory.createAppoleComputer();
        System.out.println(computer.name());
        Computer computer2=ComputerFactory.createHaseeComputer();
        System.out.println(computer2.name());

    }
}


