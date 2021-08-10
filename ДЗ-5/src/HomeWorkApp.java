public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Петров П.П.", "директор", "petrov@rogaikopita.ru",
                "8-999-123-45-67", 150000, 25);
        employees[1] = new Employee("Смирнова В.А.", "бухгалтер", "smirnova@rogaikopita.ru",
                "8-999-123-45-68", 100000, 34);
        employees[2] = new Employee("Васечкин Н.И.", "менеджер", "vasechkin@rogaikopita.ru",
                "8-999-123-45-69", 50000, 44);
        employees[3] = new Employee("Пупкин В.И.", "менеджер", "pupkin@rogaikopita.ru",
                "8-999-123-45-69", 50000, 27);
        employees[4] = new Employee("Васечкина С.Л.", "завхоз", "vasechkina@rogaikopita.ru",
                "8-999-123-45-70", 30000, 41);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) employees[i].getEmployee();
        }
    }
}
