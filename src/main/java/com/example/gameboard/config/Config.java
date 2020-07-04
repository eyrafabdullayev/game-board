package com.example.gameboard.config;

import com.example.gameboard.beans.Board;
import java.io.Serializable;

public class Config implements Serializable{
    
    private Board[][] board = null;
    private int point = 0;
    
    public Config(){
        
    }
    
    public Config(Board[][] board){
        this.board = board;
    }

    public Board[][] getBoard() {
        return board;
    }

    public void setBoard(Board[][] board) {
        this.board = board;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

}
