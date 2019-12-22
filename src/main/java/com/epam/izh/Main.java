package com.epam.izh;

public class Main {
    public static void main(String[] args) {
        ComputerLogic computerLogic = new ComputerLogic();
        Messager messager = new Messager();
        messager.printGameStart();
        computerLogic.moveComputer();
        while(!computerLogic.isEndGame(computerLogic.getMatchesCount())) {
            computerLogic.movePlayer();
            computerLogic.moveComputer();
        }
        messager.printGameEnd();
    }
}
