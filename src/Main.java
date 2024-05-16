public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Семён"; // имя
        String lastName = "Семёнович"; // отчество
        String middleName = "Семёркин"; //фамилия
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println();
        System.out.println("Задача 2");
        System.out.println(fullName.toUpperCase());

        System.out.println();
        System.out.println("Задача 3");
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);

    }
}