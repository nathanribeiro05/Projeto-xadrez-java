package BoardGame;

public abstract class Piece {
    
    protected Position position; 
    private Board board;

    public Piece(Board board) { //somente com o tabuleiro pq primeira posição da peça sera nula.
        this.board = board;
        position = null;
    }

    protected Board getBoard() { //protected apenas para classes do mesmo pacote ou subclasses.
        return board;            // somente o get para não permitir que o tabuleiro seja alterado com o set.
    }

    public abstract boolean[][] possibleMoves(); 

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    } 

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
