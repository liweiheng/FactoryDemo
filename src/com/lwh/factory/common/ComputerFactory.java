package com.lwh.factory.common;

public class ComputerFactory {
    public static Computer createAppoleComputer() {
        return new AppoleComputer();
    }

    public static Computer createHaseeComputer() {
        return new HaseeComputer();
    }

    public static Computer createIBMComputer() {
        return new IBMComputer();
    }
}
