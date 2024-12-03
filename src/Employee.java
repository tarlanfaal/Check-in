import java.util.Objects;
import java.util.Scanner;

public class Employee {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String title;
    private double payRate;
    public Employee() {}

    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }

    public Employee inputEmployee() {
        System.out.print("Enter employee type salaried/hourly): ");
        String employeeType = scanner.nextLine();
        System.out.print("\n" + "Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("\n" + "Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("\n" + "Enter title: ");
        String title = scanner.nextLine();

        if (employeeType.equals("salaried")) {
            System.out.print("\n" + "Enter annual salary: ");
            double annualSalary = scanner.nextDouble();
            SalaryEmp salary = new SalaryEmp(firstName, lastName, title, annualSalary);

            salary.display();
        } else if (employeeType.equals("hourly")) {
            System.out.println("\n" + "Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            System.out.println("\n" + "Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();
            HourlyEmployee employee = new HourlyEmployee(firstName, lastName, title, payRate, hoursWorked, hourlyRate);
            employee.display();
        }
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double calculateSalary() {
        return 0.0;
    }

    public double calculateWeeklySalary(){
        double weeklySalary = payRate * 40;
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", payRate=" + payRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(payRate, employee.payRate) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(title, employee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title);
    }



}
