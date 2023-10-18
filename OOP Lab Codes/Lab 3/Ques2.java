import java.lang.Math;
import java.util.*;

class player{
	int guessed, playerNum;
	public player(int guessed, int playerNum){
		this.guessed = guessed;
		this.playerNum = playerNum;
	}
	public int guess(){
		System.out.println("Player "+playerNum+" enter number: ");
		return new Scanner(System.in).nextInt();
	}
}

class GuessGame{
	player p1,p2,p3;
	public GuessGame(){
		p1 = new player(0,1);
		p2 = new player(0,2);
		p3 = new player(0,3);
	}
	public void startGame(){
		int num;
		num =(int)(Math.random()*9+1);
		if (p1.guess()==num) {System.out.println("Correct guess");}
		else if (p2.guess()==num) {System.out.println("Correct guess");}
		else if (p3.guess()==num) {System.out.println("Correct guess");}
		else {System.out.println("Wrong, the correct number was: "+num);}
	}
}

public class Ques2{
	public static void main(String[] args){
		new GuessGame().startGame();
	}
}
