package com.example.gameboard.beans;

import java.io.Serializable;

public class Board implements Serializable{

    private char letter;
    private boolean show = false;
    
    public Board(char letter,boolean show){
        this.letter = letter;
        this.show = show;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
