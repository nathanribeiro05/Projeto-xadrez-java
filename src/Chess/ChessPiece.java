package Chess;

import BoardGame.Board;
import BoardGame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() { //somente o get para que a cor de uma peça não possa ser modificada pelo set.
        return color;
    }
        
}
