public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 1.4");

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 100;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, он достиг совершеннолетия");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, сегодня холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, сегодня тепло, можно идти без шапкин");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 18;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то его место в университете");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, то ты еще мелкий");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageKid = 14;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + " лет, то ему нельзя кататься на аттракционе");
        } else if (ageKid < 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " лет, то ему нельзя кататься на аттракционе одному, " +
                    "но можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageKid + " лет, то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int passengerCount = 59;

        int capacity = 102;
        int seatPlacesCount = 60;
        int standingPlaceCount = capacity - seatPlacesCount;
        if (passengerCount >= capacity) {
            System.out.println("Если количество пассажиров " + passengerCount + " в вагоне мест нет");
        } else if (passengerCount < capacity && passengerCount >= seatPlacesCount) {
            System.out.println("Если количество пассажиров " + passengerCount + " в вагоне только стоячие места");
        } else if (passengerCount < seatPlacesCount) {
            System.out.println("Если количество пассажиров " + passengerCount + " в вагоне есть сидячие и стоячие места");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 100;
        int two = 10;
        int three = 100;
        if (one >= two && one >= three) {
            System.out.println("Число " + one + " самое большое");
        } else if (two >= one && two >= three) {
            System.out.println("Число " + two + " самое большое");
        } else if (three >= one && three >= two) {
            System.out.println("Число " + three + " самое большое");
        }
    }

}