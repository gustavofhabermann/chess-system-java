import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("chess system");

        ChessMatch cm = new ChessMatch();
        while(true){
            try {
                UI.clearScreen();
                UI.printBoard(cm.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedChessPiece = cm.performanceChessMove(source, target);
            } catch (ChessException e) {
                e.getMessage();
                sc.nextLine();
            } catch (InputMismatchException e) {
                e.getMessage();
                sc.nextLine();
            }
            
        }

    }
}