package ru.rtk.java.classes;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Создание televisor");
        Televisor televisor = new Televisor();
        System.out.println("Проверка включен ли televisor\n: " + televisor.isWorking());

        System.out.println(televisor.isWorking());

        System.out.println("Создание televisor2 включенным");
        Televisor televisor2 = new Televisor(true);
        System.out.println("Проверка включен ли televisor2: " + televisor2.isWorking());
        System.out.println("Выкл televisor2");
        televisor2.turnOff();
        System.out.println("Проверка включен ли televisor2: " + televisor2.isWorking());
        System.out.println("Включаем televisor2");
        televisor2.turnOn();
        System.out.println("Проверка включен ли televisor2\n: " + televisor2.isWorking());

        System.out.print("На какой канал переключиться? ");
        int choice = sc.nextInt();
        System.out.println("Переключиться на " + choice + " канал");
        televisor2.switchChannel(choice);
        System.out.println("Текущий канал у tv2\n: " + televisor2.getChannel());


        Random r = new Random();
        choice = r.nextInt(10);
        System.out.println("Получили рандомное число - " + choice);
        System.out.println("Переключиться на " + choice + " канал");
        System.out.println("Текущий канал у televisor2\n: " + televisor2.getChannel());

        System.out.println(televisor2.toString());
    }
}


