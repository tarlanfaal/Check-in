public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String title, double payRate, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, title, payRate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void display() {
        System.out.println( "\n" + "Employee: " + getFirstName() + " " + getLastName() + ", " + "Title: " + getTitle() + "\n" + "Hours Worked: " + getHoursWorked() + "\n" + "Weekly Pay: " + "$" + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return getHourlyRate() * getHoursWorked();
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
