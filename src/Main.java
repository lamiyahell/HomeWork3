import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Условный оператор. Домашние задания");
        //task 1
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно пнемного подождать");
        }

        //task 2
        System.out.println("Задача 2");
        byte tempAir = -5;
        if (tempAir < 5) {
            System.out.println("На улице " + tempAir + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + tempAir + " градусов, можно идти без шапки");
        }
        //task 3
        System.out.println("Задача 3");
        int speedCar = 45;
        if (speedCar > 60) {
            System.out.println("Если скорость " + speedCar + ", придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedCar + ", можно ездить спокойно");
        }

        //task 4
        System.out.println("Задача 4");
        int ageHuman = 4;
        boolean kinderGarden = ageHuman >= 2 && ageHuman < 6;
        boolean pupilSchool = ageHuman >= 7 && ageHuman < 18;
        boolean student = ageHuman >= 18 && ageHuman < 24;
        boolean worker = ageHuman > 24;
        if (kinderGarden) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        } else if (pupilSchool) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        } else if (student) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет");
        } else if (worker) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу");
        }

        //task 5
        System.out.println("Задача 5");
        int ageChild = 16;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст человека равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (ageChild >= 14) {
            System.out.println("Если возраст человека равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //task 6
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int seatsInTheWagon = 60;
        int people = 104;
        if (people < seatsInTheWagon) {
            System.out.println("В вагоне есть место и можно занять сидячее место");
        } else if (people >= seatsInTheWagon && people < wagonCapacity) {
            System.out.println("В вагоне есть место, но только стоячее");
        } else if (people > 102) {
            System.out.println("Вагон уже полностью забит, мест нет");
        }

        //task 7
        System.out.println("Задача 7");
        int one;
        int two;
        int three;
        one = 1;
        two = 2;
        three = 3;
        if (one < two && one < three && two < three) {
            System.out.println("Из трёх чисел большее " + three);
        }


        System.out.println("Условный оператор. Урок 2. Домашние задания");
        //task 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2020;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //task 3
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //task 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance >= 20) {
            deliveryDays++;
        }

        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);

        } else {
           System.out.println("Доставки нет");
        }

        //task 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
