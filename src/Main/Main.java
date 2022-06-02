package Main;

import clases.Employee;
import clases.Intern;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) throws IOException {


        FileWriter textEmployees = new FileWriter("employees.txt");

        ArrayList<Employee> arrayEmployees = new ArrayList<>();
        arrayEmployees.add(new Employee("Rocio","rocioal@hotmail.com","engineering", 22000));
        arrayEmployees.add(new Employee("Carlos","carloshm@hotmail.com","engineering", 24000));
        arrayEmployees.add(new Employee("Ana","anapll@hotmail.com","psychology", 21000));
        arrayEmployees.add(new Employee("Salud","saludlr@hotmail.com","administrative", 25000));
        arrayEmployees.add(new Employee("Dama","damaah@hotmail.com","dog therapy", 40000));
        arrayEmployees.add(new Intern("Jose Alberto", "jaga@hotmail.com", "nursing", 19000));
        arrayEmployees.add(new Intern("Antonio Ruben", "arga@hotmail.com", "engineering", 21000));
        arrayEmployees.add(new Intern("Francisco", "fjaa@hotmail.com", "administrative", 19500));
        arrayEmployees.add(new Intern("Turco", "turcoh@hotmail.com", "dog therapy", 32000));
        arrayEmployees.add(new Intern("Orion", "orito@hotmail.com", "dog therapy", 65048));

        for (Employee employee : arrayEmployees){
            System.out.println(employee);
            textEmployees.write(employee.toString() + "\n");
        }
        textEmployees.close();

        // --- TESTS: comprobación de restricción de constructor y setter de salario ---

        arrayEmployees.get(8).setSalary(50000);
        System.out.println(arrayEmployees.get(8));

    }
}
