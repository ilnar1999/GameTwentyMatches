package com.epam.izh;

import java.util.Scanner;
import static com.epam.izh.Messager.*;

public class ComputerLogic {
    private final static int SUM_PLAYER_AND_COMPUTER_MATCHES_FOR_WIN = 4;
    private static int matchesCount = 20;
    private static int playerMatchesCount = 1; // начальное значение для взятия компьютером 3 спичек
    private static int computerMatchesCount;

    public static int getMatchesCount() {
        return matchesCount;
    }

    static boolean isEndGame(int matchesCount) {
        if (matchesCount <= 1) {
            return true;
        }
        return false;
    }

    static  int getComputerMatchesCount(int playerMatchesCount) {
        return SUM_PLAYER_AND_COMPUTER_MATCHES_FOR_WIN - playerMatchesCount;
    }

    static int getPlayerMatchesCount() {
        int playerMatchesCount = 0;
        while (!isCorrectCount(playerMatchesCount)){
            printPlayerMove();
            playerMatchesCount = new Scanner(System.in).nextInt();
            if (!isCorrectCount(playerMatchesCount)) {
                printErrorMessage();
            }
        }
        return playerMatchesCount;
    }

    static boolean isCorrectCount(int playerMatchesCount) {
        if (!(playerMatchesCount < 1 || playerMatchesCount > 3)) {
            return true;
        }
        return false;
    }

    static void moveComputer() {
        computerMatchesCount = getComputerMatchesCount(playerMatchesCount);
        printComputerMatchesCount(computerMatchesCount);
        matchesCount -= computerMatchesCount;
        printMatchesCount(matchesCount);
    }

    static void movePlayer() {
        playerMatchesCount = getPlayerMatchesCount();
        matchesCount -= playerMatchesCount;
        printMatchesCount(matchesCount);
    }
}
