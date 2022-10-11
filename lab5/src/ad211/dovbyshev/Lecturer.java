package ad211.dovbyshev;

public class Lecturer extends Person{

    String department;
    double salary;

    public Lecturer () { super(); }
    public Lecturer (String  surname, String name, int age, String department, double salary) {
        super(surname, name, age);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Lecturer in the department of " + getDepartment() + " " + getSurname() + " " + getName() + ", age " + getAge() + ".");
        System.out.print("Salary: " + getSalary());
    }
}
