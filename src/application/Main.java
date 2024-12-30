package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Employee employee = requestData(read); // Cria o objeto retornado pelo método
        System.out.println(employee); // Exibe o objeto final

        read.close();
    }

    public static Employee requestData(Scanner read) {
        System.out.print("\nName: ");
        String name = read.nextLine();

        System.out.print("\nGross salary: ");
        double grossSalary = read.nextDouble();

        System.out.print("\nTax: ");
        double tax = read.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax); // Cria o objeto com os dados

        System.out.println("Employee: " + employee.getName() + " R$ " + employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = read.nextDouble();
        employee.increaseSalary(percentage); // Aplica o aumento de salário

        return employee; // Retorna o objeto criado
    }
}
