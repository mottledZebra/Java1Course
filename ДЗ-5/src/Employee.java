public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployee() {
        System.out.println("ФИО:\t\t" + fullName);
        System.out.println("должность:\t" + position);
        System.out.println("e-mail:\t\t" + email);
        System.out.println("телефон:\t" + phone);
        System.out.println("зарплата:\t" + salary);
        System.out.println("возраст:\t" + age);
        System.out.println();
    }
}
