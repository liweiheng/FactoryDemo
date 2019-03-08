package com.lwh.factory.abstractfactory;

public class AppoleFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new AppoleComputer();
    }
}
