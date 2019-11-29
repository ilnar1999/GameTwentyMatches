package com.epam.izh;

public class Messager {
    public static void printGameStart() {
        System.out.println("Игра началась. На столе лежит 20 спичек.");
    }

    public static void printMatchesCount(int count) {
        if (count > 4) {
            System.out.printf("На столе осталось %d спичек.\n", count);
        } else if (count > 1){
            System.out.printf("На столе осталось %d спички.\n", count);
        }
    }

    public static void pringErrorMessage() {
        System.out.println("Некорректное количество спичек!");
    }

    public static void printGameEnd() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }

    public static void printComputerMatchesCount(int computerCount) {
        System.out.printf(" - Количество выбранных компьютером спичек = %s.\n", computerCount);
    }

    public static void printPlayerMove() {
        System.out.print(" - Ход игрока. Введите количество спичек: ");
    }
}
