import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Условый оператор. Домашние задания");
        // task 1
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
    }
}
