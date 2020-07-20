package com.proto;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED,BLACK
    }
}

class ChessPieceUnitFactory {
    private static final Map<Integer,ChessPieceUnit> pieces = new HashMap<>();
    static {
        pieces.put(1,new ChessPieceUnit(1,"车",ChessPieceUnit.Color.BLACK));
        pieces.put(2,new ChessPieceUnit(1,"马",ChessPieceUnit.Color.BLACK));

    }

    public static ChessPieceUnit getChessPiece(int chessPieceId) {
        return pieces.get(chessPieceId);
    }
}
