package com.epam.izh;

import java.util.Scanner;

public class ComputerLogic {
    private Messager messager = new Messager();
    private int matchesCount = 20;
    private int playerMatchesCount = 1; // начальное значение для взятия компьютером 3 спичек

    public int getMatchesCount() {
        return matchesCount;
    }

    boolean isEndGame(int matchesCount) {
        if (matchesCount <= 1) {
            return true;
        }
        return false;
    }

    int getComputerMatchesCount(int playerMatchesCount) {
        int SUM_PLAYER_AND_COMPUTER_MATCHES_FOR_WIN = 4;
        return SUM_PLAYER_AND_COMPUTER_MATCHES_FOR_WIN - playerMatchesCount;
    }

    int getPlayerMatchesCount() {
        int playerMatchesCount = 0;
        while (!isCorrectCount(playerMatchesCount)){
            messager.printPlayerMove();
            playerMatchesCount = new Scanner(System.in).nextInt();
            if (!isCorrectCount(playerMatchesCount)) {
                messager.printErrorMessage();
            }
        }
        return playerMatchesCount;
    }

    boolean isCorrectCount(int playerMatchesCount) {
        if (!(playerMatchesCount < 1 || playerMatchesCount > 3)) {
            return true;
        }
        return false;
    }

    void moveComputer() {
        int computerMatchesCount = getComputerMatchesCount(playerMatchesCount);
        messager.printComputerMatchesCount(computerMatchesCount);
        matchesCount -= computerMatchesCount;
        messager.printMatchesCount(matchesCount);
    }

    void movePlayer() {
        playerMatchesCount = getPlayerMatchesCount();
        matchesCount -= playerMatchesCount;
        messager.printMatchesCount(matchesCount);
    }
}
