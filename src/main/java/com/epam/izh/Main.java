package com.epam.izh;

import static com.epam.izh.ComputerLogic.*;
import static com.epam.izh.Messager.*;

public class Main {
    public static void main(String[] args) {
        printGameStart();
        moveComputer();
        while(!isEndGame(getMatchesCount())) {
            movePlayer();
            moveComputer();
        }
        printGameEnd();
    }
}
