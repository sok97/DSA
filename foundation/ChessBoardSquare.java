package foundation;
/**
 * ChessBoardSquare
 */
public class ChessBoardSquare {
    public static boolean squareIsWhite(String coordinates){
        
        int col = coordinates.charAt(0)-'a';
        int row = coordinates.charAt(1)-1;

        
        return (row+col)%2==1;
    }
    public static void main(String[] args) {
     

    }
}