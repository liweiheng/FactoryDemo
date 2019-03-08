package com.lwh.factory.simpleness;

public class ComputerFactory {
    public static Computer createComputer(String name) {
        Computer computer = null;
        switch (name) {
            case "苹果":
                computer = new AppoleComputer();
                break;
            case "神舟":
                computer = new HaseeComputer();
                break;
            case "IBM":
                computer = new IBMComputer();
                break;
            default:
                computer = new DefaultComputer();
                break;
        }
        return computer;
    }

}
