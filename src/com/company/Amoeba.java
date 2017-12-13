package com.company;

/**
 * Created by java1 on 2017.12.13..
 */
public class Amoeba {
    char [][] board = new  char [3][3];

    public Amoeba(){
        init();

    }

    public void play(){

    }

    public void drawBoard(){
        for (int i=0; i< board.length; ++i){

            for(int j=0; j<board[0].length; ++j){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();

        }

    }

    private void init (){


            for (int i=0; i< board.length; ++i){
                for(int j=0; j<board[0].length; ++j){
                    board[i][j] = '_';
                }

            }
    }

    public boolean isCharacterWinner(char symbol){
        return checkRow(symbol)|| checkColumn(symbol)|| checkDiagonalLeftToRight(symbol)|| checkDiagonalRightToLeft(symbol);

    }

    private boolean checkRow(char symbol){
        int x =0;
        for (int i=0; i< board.length; i++){
            for(int j=0; j<board[0].length; ++j){

                if (board[i][j] == symbol){
                    x++;
                }

            }

        }
        if (x == board.length){
            return true;
        }
 return  false;
    }

    private boolean checkColumn(char symbol){
        return  false;
    }

    private boolean checkDiagonalLeftToRight(char symbol) {
        return  false;
    }
    private boolean checkDiagonalRightToLeft(char symbol) {
        return  false;
    }


}
