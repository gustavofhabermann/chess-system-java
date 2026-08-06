import chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("chess system");

        ChessMatch cm = new ChessMatch();
        
        UI.printBoard(cm.getPieces());

    }
}