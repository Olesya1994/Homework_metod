public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println(checkLeap(2021));
        System.out.println("Задача 2");
        System.out.println(defineVersion(2021, 0));
        System.out.println("Задача 3");
        deliverydays(900);
    }

    public static String checkLeap(int year) {
        String leap = "Год не высокосный";
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                leap = "Год высокосный";
            } else if (year % 100 == 0) {
                leap = "Год не высокосный";
            } else {
                leap = "Год высокосный";
            }
            return leap;
        }
        return leap;
    }

    public static String defineVersion(int year, int clientOS) {
        // (0 — iOS, 1 — Android)
        String version = "Установите версию приложения для Android по ссылке";
        switch (clientOS) {
            case 1:
                if (year < 2015) {
                    version = "Установите облегченную версию приложения для Android по ссылке";
                }
                break;
            case 0:
                if (year < 2015) {
                    version = "Установите облегченную версию приложения для iOS по ссылке";
                } else {
                    version = "Установите версию приложения для iOS по ссылке";
                }
                break;
        }
        return version;
    }

    public static void deliverydays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

    }
}