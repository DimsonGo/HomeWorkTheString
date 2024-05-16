public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich ";
        String fullName = firstName + middleName + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println();
        System.out.println("Задача 2");
        System.out.println(fullName.toUpperCase());

        System.out.println();
        System.out.println("Задача 3");
        //У нас уже есть переменная fullName, но в задачи указано, чтобы мы переменную так же назвали
        String fullNameFull = "Иванов Семён Семёнович";
        fullNameFull = fullNameFull.replace("ё", "е");
        System.out.println(fullNameFull);
    }
}