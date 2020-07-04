package com.example.gameboard.config;

import com.example.gameboard.utils.FileUtil;
import java.io.IOException;

public class Initialization {

    public static Config config = null;

    public static void initializer() throws IOException, ClassNotFoundException {

        config = new Config();
        
        try {

            Object obj = FileUtil.readFromFile("board.txt");
            if (obj != null) {
                config = (Config) obj;
            }
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
        }

    }
    
    public static void configRefresh(){
        FileUtil.writeToFile("board.txt", config);
    }

}
