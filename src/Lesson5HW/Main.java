package Lesson5HW;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Tigrov Igor", "Teamlead", "tigr@mail.ru", "89203857481", 40000, 28);
        employeeArray[1] = new Employee("Rebrov Anton", "Java Developer", "rebro@mail.ru", "89185354416", 41000, 44);
        employeeArray[2] = new Employee("Kucharov Kirill", "QA-Engineer", "kucha@mail.ru", "89164558888", 42000, 40);
        employeeArray[3] = new Employee("Vorobyov Evgeny", "Java Developer", "vorobei@mail.ru", "8900315113", 43000, 41);
        employeeArray[4] = new Employee("Vasyutkin Nikolay", "QA-Engineer", "vasya@mail.ru", "89153458587", 44000, 49);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
