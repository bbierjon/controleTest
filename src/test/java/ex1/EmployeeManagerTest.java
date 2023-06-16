package ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ex1.Employee.Niveau;

public class EmployeeManagerTest {

    @Test
    public void testCalculateSalaryForJuniorEmployeeWith1YearExperience() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee employee = new Employee("Bastien", "Bierjon", 1, Niveau.JUNIOR);

        double expectedSalary = 20000 * 1.05;
        double actualSalary = employeeManager.calculateSalary(employee);

        Assertions.assertEquals(expectedSalary, actualSalary);
    }
    
    @Test
    public void testCalculateSalaryForIntermediateEmployeeWith5YearsExperience() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee employee = new Employee("Alban", "Bierjon", 5, Niveau.INTERMEDIATE);

        double expectedSalary = 40000 * 1.25;
        double actualSalary = employeeManager.calculateSalary(employee);

        Assertions.assertEquals(expectedSalary, actualSalary);
    }
    
    @Test
    public void testCalculateSalaryForSeniorEmployeeWith10YearsExperience() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee employee = new Employee("Robin", "Bierjon", 10, Niveau.SENIOR);

        double expectedSalary = 60000 * 1.5;
        double actualSalary = employeeManager.calculateSalary(employee);

        Assertions.assertEquals(expectedSalary, actualSalary);
    }
    
    @Test
    public void testCalculateSalaryForSeniorEmployeeWith20YearsExperience() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee employee = new Employee("Jerome", "Bierjon", 20, Niveau.SENIOR);

        double expectedSalary = 60000 * 2.0;
        double actualSalary = employeeManager.calculateSalary(employee);

        Assertions.assertEquals(expectedSalary, actualSalary);
    }
    
    @Test
    public void testCalculateSalaryForIntermediateEmployeeWith3YearsExperience() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee employee = new Employee("Valerie", "Bierjon", 3, Niveau.INTERMEDIATE);

        double expectedSalary = 40000 * 1.15;
        double actualSalary = employeeManager.calculateSalary(employee);

        Assertions.assertEquals(expectedSalary, actualSalary);
    }
}

