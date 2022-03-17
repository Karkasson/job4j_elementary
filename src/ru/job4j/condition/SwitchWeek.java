package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println("1 - " + nameOfDay(1));
        System.out.println("2 - " + nameOfDay(2));
        System.out.println("3 - " + nameOfDay(3));
        System.out.println("4 - " + nameOfDay(4));
        System.out.println("5 - " + nameOfDay(5));
        System.out.println("6 - " + nameOfDay(6));
        System.out.println("7 - " + nameOfDay(7));
        System.out.println("9 - " + nameOfDay(9));
    }
}
