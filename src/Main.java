public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("task1:");

        int clientOS = 1;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else
            System.out.println("Неизвестная операционна система");
    }

    public static void task2() {
        System.out.println("task2:");

        int clientOS = 1;
        int clientDeviceYear = 2010;

        if (clientOS == 0 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке");
        if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if (clientOS == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else
            System.out.println("Неизвестная операционна система");
    }

    public static void task3() {
        System.out.println("task3:");

        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");
    }

    public static void task4() {
        System.out.println("task4:");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20)
            System.out.println("Потребуется 1 день");
        else if (deliveryDistance <= 60)
            System.out.println("Потребуется 2 дня");
        else if (deliveryDistance <= 100)
            System.out.println("Потребуется 3 дня");
        else
            System.out.println("Доставки нет");
    }

    public static void task5() {
        System.out.println("task5:");

        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;

            default:
                System.out.println(monthNumber + " месяц не существует");
        }
    }
}