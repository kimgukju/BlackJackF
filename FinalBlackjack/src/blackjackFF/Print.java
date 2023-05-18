package blackjackFF;

import java.util.ArrayList;
import java.util.List;

public class Print {
	//BlackjackGame game;
	List<String> playerHand;
	List<String> dealerHand;
	int playerScore;
	int dealerScore;
	
	public Print() {
		// TODO Auto-generated constructor stub
		//game = new BlackjackGame();  
		// 이런식으로  bjgame,print 문에 서로 선언해서 써버리면 StackOverflowError 남 
		// 그래서 bjgame 에 public static 으로 바꾸고 여기서 bjgame.~~ 식으로 호출해서 프린트하게함 
		playerHand = new ArrayList<String>();
		dealerHand = new ArrayList<String>();
		playerScore = 0;
		dealerScore = 0;
	}
	
	public void printPlayerHand() {
		System.out.print("            " + "┌───┐ ".repeat(BlackjackGame.playerHand.size()) + "\n");
		System.out.print("유저 손패 : ");
		for (int i = 0; i < BlackjackGame.playerHand.size(); i++) {
			if (BlackjackGame.playerHand.get(i).equals("♠10") || BlackjackGame.playerHand.get(i).equals("♥10") || BlackjackGame.playerHand.get(i).equals("♦10")
					|| BlackjackGame.playerHand.get(i).equals("♣10")) {
				System.out.print("│" + BlackjackGame.playerHand.get(i) + "│ ");
			} else {
				System.out.print("│ " + BlackjackGame.playerHand.get(i) + "│ ");
			}
		}
		System.out.print("점수: " + BlackjackGame.playerScore);
		System.out.println();
		System.out.print("            " + "└───┘ ".repeat(BlackjackGame.playerHand.size()) + "\n");
	}

	public void printDealerAllHand() {
		System.out.print("            " + "┌───┐ ".repeat(BlackjackGame.dealerHand.size()) + "\n");
		System.out.print("딜러 손패 : ");
		for (int i = 0; i < BlackjackGame.dealerHand.size(); i++) {
			if (BlackjackGame.dealerHand.get(i).equals("♠10") || BlackjackGame.dealerHand.get(i).equals("♥10") ||BlackjackGame.dealerHand.get(i).equals("♦10")
					|| BlackjackGame.dealerHand.get(i).equals("♣10")) {
				System.out.print("│" + BlackjackGame.dealerHand.get(i) + "│ ");
			} else {
				System.out.print("│ " + BlackjackGame.dealerHand.get(i) + "│ ");
			}
		}
		System.out.print("점수: " + BlackjackGame.dealerScore);
		System.out.println();
		System.out.print("            " + "└───┘ ".repeat(BlackjackGame.dealerHand.size()) + "\n");
	}

	public void printDealerHand() {
		System.out.print("            " + "┌───┐ ".repeat(BlackjackGame.dealerHand.size()) + "\n");
		System.out.print("딜러 손패 : ");
		if (BlackjackGame.dealerHand.get(0).equals("♠10") || BlackjackGame.dealerHand.get(0).equals("♥10") || BlackjackGame.dealerHand.get(0).equals("♦10")
				|| BlackjackGame.dealerHand.get(0).equals("♣10")) {
			System.out.print("│" + BlackjackGame.dealerHand.get(0) + "│ ");
		} else {
			System.out.print("│ " + BlackjackGame.dealerHand.get(0) + "│ ");
		}

		System.out.print("│ ? │ ".repeat(BlackjackGame.dealerHand.size() - 1));
		System.out.println();
		System.out.print("            " + "└───┘ ".repeat(BlackjackGame.dealerHand.size()) + "\n");
	}

}