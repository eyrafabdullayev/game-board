package com.example.gameboard.utils;

import com.example.gameboard.beans.MenuOption;
import java.util.Scanner;

public class MenuUtil {

    private static final Scanner sc = new Scanner(System.in);

    public static MenuOption showMenu() {
        MenuOption.printMenuOptions();

        System.out.println("Select menu: ");
        int selectedNumber = sc.nextInt();

        return MenuOption.getMenuOptionById(selectedNumber);
    }

    public static void menuInfinite() {
        boolean exit = false;

        while (!exit) {
            MenuOption mo = showMenu();

            switch (mo) {
                case start:
                    CompetitionUtil.start();
                    break;
                case point:
                    CompetitionUtil.showScore();
                    break;
                case exit:
                    CompetitionUtil.exit();
                    break;
                default:
                    System.out.println("Please select valid number ..");
                    break;
            }
        }
    }
}
