package ad211.dovbyshev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int index = 0, arrSize = 5, menu;
        Person[] person = new Person[arrSize];
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("\n1.New person\n2.See the list\n3.Exit\n");
            menu = scanner.nextInt();

            switch(menu){
                case 1:
                    newPerson(person, index);
                    index++;
                    break;
                case 2:
                    seeList(person, index);
                    break;
                case 3:
                    System.out.print("\nClosing the program...");
                    System.exit(0);
                default:
                    System.out.print("\nNon-existent menu number");
            }
        }
    }

    static void newPerson(Person[] person, int index) {
        int menu;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        System.out.print("\n1.Person\n2.Student\n3.Lecturer\n");
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                person[index] = new Person();
                break;
            case 2:
                person[index] = new Student();
                break;
            case 3:
                person[index] = new Lecturer();
                break;
        }

        System.out.print("Enter name: ");
        person[index].setName(scannerStr.nextLine());

        System.out.print("Enter surname: ");
        person[index].setSurname(scannerStr.nextLine());

        System.out.print("Enter age: ");
        person[index].setAge(scanner.nextInt());

        if (person[index] instanceof Student) {
            System.out.print("Enter group: ");
            ((Student)person[index]).setGroup(scannerStr.nextLine());

            System.out.print("Enter ID: ");
            ((Student)person[index]).setID(scannerStr.nextLine());
        }
        else if(person[index] instanceof Lecturer) {
            System.out.print("Enter department: ");
            ((Lecturer)person[index]).setDepartment(scannerStr.nextLine());

            System.out.print("Enter salary amount: ");
            ((Lecturer)person[index]).setSalary(scanner.nextDouble());
        }
    }

    static void seeList(Person[] person, int index) {
        for (int i = 0; i < index; i++) {
            System.out.print("\n№" + (i + 1) + " - ");
            person[i].printInfo();
        }
    }
}
