package com.proto;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {
    private Map<Integer,ChessPiece> chessPieceMap= new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieceMap.put(1,new ChessPiece(1,"车",ChessPiece.Color.BLACK,0,0));
        chessPieceMap.put(1,new ChessPiece(1,"马",ChessPiece.Color.BLACK,0,1));

    }

    public void move(int chesspieceId,int toPositionX,int toPositionY) {

    }
}
