package BoardGame;

public class Piece {
    
    protected Position position; 
    private Board board;

    public Piece(Board board) { //somente com o tabuleiro pq primeira posição da peça sera nula.
        this.board = board;
        position = null;
    }

    protected Board getBoard() { //proected apenas para classes do mesmo pacote ou subclasses.
        return board;            // somente o get para não permitir que o tabuleiro seja alterado com o set.
    }

       

}
