package com.lwh.factory.abstractfactory;

public class IBMFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new IBMComputer();
    }
}
