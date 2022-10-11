package ad211.dovbyshev;

public class Student extends Person{

    String group;
    String ID;

    public Student () { super(); }
    public Student (String  surname, String name, int age, String group, String ID) {
        super(surname, name, age);
        this.group = group;
        this.ID = ID;
    }

    public String getGroup() {
        return group;
    }

    public String getID() {
        return ID;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public void printInfo() {
        System.out.println("Student of the group " + getGroup() + " " + getSurname() + " " + getName() + ", age: " + getAge() + ".");
        System.out.println("ID number: " + getID());
    }
}
