package homework5;

public class Employees {
    String fullName;
    String position;
    String email;
    String telephoneNumber;
    int age;
    int salary;
    Employees(String fullName, String position, String email, String telephoneNumber, int age, int salary){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.age = age;
        this.salary = salary;

    }
    void printInfo(){
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: "+ position);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + telephoneNumber);
        System.out.println("Возраст: " + age);
        System.out.println("Зарплата: " + salary);

    }
    int getAge()
    {
        return age;
    }
}
