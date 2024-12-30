package entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;
    private double netSalary;


    public Employee(){}

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public double getTax() {
        return tax;
    }

    public double netSalary(){
        this.netSalary = grossSalary-tax;
        return netSalary;
    }

    public void increaseSalary(double percentage){
        this.netSalary += (percentage/100) * grossSalary;
    }


    @Override
    public String toString() {
        return "Employee:" +
                "\nName='" + name +
                "\nGrossSalary=" + grossSalary +
                "\nTax=" + tax +
                "\nNetSalary=" + netSalary;
    }
}