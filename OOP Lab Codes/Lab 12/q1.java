import java.util.*;

interface Movable {
    void move(String newPos);
}

abstract class Piece implements Movable{
    String name;
    String color;
    String curPos;
    public Piece(String name, String color, String curPos) {
        this.color = color;
        this.name = name;
        this.curPos = curPos;
    }
}

class King extends Piece{
    public King(String name, String color, String curPos) {
        super(name, color, curPos);
    }

    @Override
    public void move(String newPos) {
        System.out.println(color+" King moved from "+curPos+" to "+newPos);
        curPos = newPos;
    }
}
class Queen extends Piece{
    public Queen(String name, String color, String curPos) {
        super(name, color, curPos);
    }

    @Override
    public void move(String newPos) {
        System.out.println(color+" Queen moved from "+curPos+" to "+newPos);
        curPos = newPos;
    }
}
class Pawn extends Piece{
    public Pawn(String name, String color, String curPos) {
        super(name, color, curPos);
    }

    @Override
    public void move(String newPos) {
        System.out.println(color+" Pawn moved from "+curPos+" to "+newPos);
        curPos = newPos;
    }
}

public class q1 {
    public static void main(String[] args) {
        String temp;
        String[] inp;
        Scanner sc = new Scanner(System.in);
        ArrayList<Piece> piece = new ArrayList<>();
        King king = new King("King", "White", "e1");
        Queen queen = new Queen("Queen", "Black", "d1");
        Pawn pawn = new Pawn("Pawn", "White", "e2");
        System.out.println("Created 3 chess pieces: White King (1), Black Queen (2) and White Pawn (3).");
        piece.add(king);
        piece.add(queen);
        piece.add(pawn);

        while (true) {
            System.out.println("Enter which piece to be moved and new position: (0 to exit)");
            temp = sc.nextLine();
            inp = temp.split(" ");
            int n = Integer.parseInt(inp[0]);
            if(n==0) {
                System.out.println("Bye, Thank you.");
                System.exit(0);
            }
            else if(n==1) { piece.get(0).move(inp[1]); }
            else if(n==2) { piece.get(1).move(inp[1]); }
            else if(n==3) { piece.get(2).move(inp[1]); }
            else System.out.println("invalid input");
        }
    }
}
