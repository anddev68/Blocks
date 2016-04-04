/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocks;

import java.awt.Color;
import java.util.ArrayList;

/**
 *  プレイヤークラス
 */
public class Player{
    
    String name;        /* プレイヤー名 */
    int id;                 /* プレイヤーID */
    int negativePoint;  /* 計算を省くためにマイナス点を別でカウントしておく */
    ArrayList<Block> blockList;     /* 持ってるブロック */
    
    
    /**
     * ブロックを所持している数（＝マイナスポイント）を取得します
     * @return 
     */
    public int getNegativePoint(){
        return negativePoint;
    }
    
    
    public static Color id2Color(int id){
        switch(id){
            case 0:
                return Color.YELLOW;
            case 1:
                return Color.BLUE;
            case 2:
                return Color.RED;
            case 3:
                return Color.GREEN;
        }
        return Color.WHITE;
    }
}
