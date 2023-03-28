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
    }
}