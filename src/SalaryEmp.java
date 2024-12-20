public class SalaryEmp extends Employee {
    public SalaryEmp (String firstName, String lastName, String title, double payRate) {
        super(firstName, lastName, title, payRate);
        }
        @Override
    public double calculateSalary() {
        return getPayRate() / 24;
    }
    public void display() {
        System.out.println( "\n" + "Employee: " + getFirstName() + " " + getLastName() + ", " + "Title: " + getTitle() + "\n" + "Bi-monthly Salary: " + "$" + calculateSalary());
    }


    }
