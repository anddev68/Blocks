/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocks;

/**
 *  ブロックがおかれるゲームボード
 */
public class GameBoard {
    public static final int BOARD_X = 20;
    public static final int BOARD_Y = 20;
    public static final int NONE = -1;    //  誰も持っていない
    
    int[][] owner;   /* 所有権が誰にあるかのフラグ */
    
    public GameBoard(){
        owner = new int[BOARD_Y][BOARD_X];
    }
    
    public void init(){
        int i,j;
        for(i=0;i<BOARD_Y;i++){
            for(j=0;j<BOARD_X;j++){
                owner[i][j] = NONE;
            }
        }
    }
    
    public int getOwner(int x,int y){
        return owner[y][x];
    }
    
    
    
    
}
