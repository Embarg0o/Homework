package Lesson5HW;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[]{new Employee("Tigrov Igor", "Teamlead", "tigr@mail.ru", "89203857481", 40000, 28),
                new Employee("Rebrov Anton", "Java Developer", "rebro@mail.ru", "89185354416", 41000, 44),
                new Employee("Kucharov Kirill", "QA-Engineer", "kucha@mail.ru", "89164558888", 42000, 40),
                new Employee("Vorobyov Evgeny", "Java Developer", "vorobei@mail.ru", "8900315113", 43000, 41),
                new Employee("Vasyutkin Nikolay", "QA-Engineer", "vasya@mail.ru", "89153458587", 44000, 49)};

        for(int i = 0; i < employeeArray.length; ++i) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }

    }
}
