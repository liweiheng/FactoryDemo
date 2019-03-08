package com.lwh.factory.abstractfactory;

public class Test {
    public static void main(String[] args) {
        ComputerFactory factory=new AppoleFactory();
        Computer computer=factory.createComputer();
        System.out.println(computer.name());
    }
}
