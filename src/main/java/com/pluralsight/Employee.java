package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(){
        this.employeeId = 0;
        this.name = "";
        this.hoursWorked = 0;
        this.payRate = 0;
    }


    public Employee(int employeeId, String name, Double hoursWorked, Double patRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = (double) hoursWorked;
    }

    public double isPatRate() {
        return payRate;
    }

    public void setPatRate(double patRate) {
        this.payRate = patRate;
    }

    public double getGrossPay(){
        double grossPay = this.hoursWorked * this.payRate;
        return grossPay;

    }


}


