package com.example.gameboard;

import com.example.gameboard.config.Initialization;
import com.example.gameboard.utils.MenuUtil;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Initialization.initializer();
            MenuUtil.menuInfinite();
        } catch (IOException | ClassNotFoundException e) {
        }
    }

}
