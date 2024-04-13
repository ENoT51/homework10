import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int year = 1583;
        checkYear(year);

        int OS = 0;
        int dataOS = 2015;
        recommendAppVersionBasedOnOS(OS, dataOS);
        int delivery = 41;
        calculateDeliveryDays(delivery);
    }
    public static void checkYear(int yearToCheck) {
        if (yearToCheck < 1584){
            System.out.println("Високосный год ввели в 1584");
        }
        else if (yearToCheck % 4 == 0 && yearToCheck % 100 != 0 || yearToCheck % 400 == 0) {
            System.out.println(yearToCheck   + " год является високосным");
        } else {
            System.out.println(yearToCheck + " год не является високосным");
        }
    }


    public static void recommendAppVersionBasedOnOS(int clienOS2, int clienData) {
        if (clienOS2 == 0 && clienData > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clienData <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clienOS2 == 1 && clienData > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clienData <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void calculateDeliveryDays( int deliveryDistance) {
        if ( deliveryDistance > 0 && deliveryDistance < 20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }
}


