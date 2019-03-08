package com.lwh.factory.abstractfactory;

public class HaseeFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new HaseeComputer();
    }
}
