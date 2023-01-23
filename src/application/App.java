package application;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;

public class App {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        System.out.println("test chess");

        UI.printBoard(chessMatch.getPieces());
        
    }
}
