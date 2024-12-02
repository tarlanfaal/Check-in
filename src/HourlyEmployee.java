public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String title, double payRate, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, title, payRate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void display() {
        System.out.println(getFirstName() + " " + getLastName() + " " + getTitle() + " " + getHoursWorked() + " " + calculateWeeklySalary());
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
