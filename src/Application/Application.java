package Application;

import Chess.ChessMatch;

public class Application {

    public static void main (String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}