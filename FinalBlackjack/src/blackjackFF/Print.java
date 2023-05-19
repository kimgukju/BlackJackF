package blackjackFF;


public class Print {
	
	/*
	 *    ♠ 포함하면 검정색
	 *    ♥ 포함하면 빨광색
	 *    ♦ 포함하면 보라색
	 *    ♣ 포함하면 초록색
	 *    단, 10은 2자리수라 범위차지해서 따로 카드폼 만들어주셔서 또 따로 선언
	 */
	
	public void printPlayerHand() {
		System.out.print("            " + "┌───┐ ".repeat(BlackjackGame.playerHand.size()) + "\n");
		System.out.print("유저 손패 : ");
		for (int i = 0; i < BlackjackGame.playerHand.size(); i++) {
			if (BlackjackGame.playerHand.get(i).equals("♠10")) {
				System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.playerHand.get(i)) + "│ ");
			} else if(BlackjackGame.playerHand.get(i).equals("♥10")) {
				System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.playerHand.get(i)) + "│ ");
			} else if(BlackjackGame.playerHand.get(i).equals("♦10")) {
				System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.playerHand.get(i)) + "│ ");
			} else if(BlackjackGame.playerHand.get(i).equals("♣10")) {
				System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.playerHand.get(i)) + "│ ");
			}
			else if(BlackjackGame.playerHand.get(i).contains("♠")) {
				System.out.print("│ " + AnsiConsol.BLACK(BlackjackGame.playerHand.get(i))+ "│ ");
			} else if(BlackjackGame.playerHand.get(i).contains("♥")) {
				System.out.print("│ " + AnsiConsol.RED(BlackjackGame.playerHand.get(i))+ "│ ");
			}
			else if(BlackjackGame.playerHand.get(i).contains("♦")) {
				System.out.print("│ " + AnsiConsol.BLUE(BlackjackGame.playerHand.get(i))+ "│ ");
			}
			else if(BlackjackGame.playerHand.get(i).contains("♣")) {
				System.out.print("│ " + AnsiConsol.GREEN(BlackjackGame.playerHand.get(i))+ "│ ");
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
//			if (BlackjackGame.dealerHand.get(i).equals("♠10") || BlackjackGame.dealerHand.get(i).equals("♥10") ||BlackjackGame.dealerHand.get(i).equals("♦10")
//					|| BlackjackGame.dealerHand.get(i).equals("♣10")) {
//				System.out.print("│" + BlackjackGame.dealerHand.get(i) + "│ ");
//			} else {
//				System.out.print("│ " + BlackjackGame.dealerHand.get(i) + "│ ");
//			}
			if (BlackjackGame.dealerHand.get(i).equals("♠10")) {
				System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.dealerHand.get(i)) + "│ ");
			} else if(BlackjackGame.dealerHand.get(i).equals("♥10")) {
				System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.dealerHand.get(i)) + "│ ");
			} else if(BlackjackGame.dealerHand.get(i).equals("♦10")) {
				System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.dealerHand.get(i)) + "│ ");
			} else if(BlackjackGame.dealerHand.get(i).equals("♣10")) {
				System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.dealerHand.get(i)) + "│ ");
			}
			else if(BlackjackGame.dealerHand.get(i).contains("♠")) {
				System.out.print("│ " + AnsiConsol.BLACK(BlackjackGame.dealerHand.get(i))+ "│ ");
			} else if(BlackjackGame.dealerHand.get(i).contains("♥")) {
				System.out.print("│ " + AnsiConsol.RED(BlackjackGame.dealerHand.get(i))+ "│ ");
			}
			else if(BlackjackGame.dealerHand.get(i).contains("♦")) {
				System.out.print("│ " + AnsiConsol.BLUE(BlackjackGame.dealerHand.get(i))+ "│ ");
			}
			else if(BlackjackGame.dealerHand.get(i).contains("♣")) {
				System.out.print("│ " + AnsiConsol.GREEN(BlackjackGame.dealerHand.get(i))+ "│ ");
			}
		}
		System.out.print("점수: " + BlackjackGame.dealerScore);
		System.out.println();
		System.out.print("            " + "└───┘ ".repeat(BlackjackGame.dealerHand.size()) + "\n");
	}

	public void printDealerHand() {
		System.out.print("            " + "┌───┐ ".repeat(BlackjackGame.dealerHand.size()) + "\n");
		System.out.print("딜러 손패 : ");
//		if (BlackjackGame.dealerHand.get(0).equals("♠10") || BlackjackGame.dealerHand.get(0).equals("♥10") || BlackjackGame.dealerHand.get(0).equals("♦10")
//				|| BlackjackGame.dealerHand.get(0).equals("♣10")) {
//			System.out.print("│" + BlackjackGame.dealerHand.get(0) + "│ ");
//		} else {
//			System.out.print("│ " + BlackjackGame.dealerHand.get(0) + "│ ");
//		}
		if (BlackjackGame.dealerHand.get(0).equals("♠10")) {
			System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.dealerHand.get(0)) + "│ ");
		} else if(BlackjackGame.dealerHand.get(0).equals("♥10")) {
			System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.dealerHand.get(0)) + "│ ");
		} else if(BlackjackGame.dealerHand.get(0).equals("♦10")) {
			System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.dealerHand.get(0)) + "│ ");
		} else if(BlackjackGame.dealerHand.get(0).equals("♣10")) {
			System.out.print("│" + AnsiConsol.BLACK(BlackjackGame.dealerHand.get(0)) + "│ ");
		}
		else if(BlackjackGame.dealerHand.get(0).contains("♠")) {
			System.out.print("│ " + AnsiConsol.BLACK(BlackjackGame.dealerHand.get(0))+ "│ ");
		} else if(BlackjackGame.dealerHand.get(0).contains("♥")) {
			System.out.print("│ " + AnsiConsol.RED(BlackjackGame.dealerHand.get(0))+ "│ ");
		}
		else if(BlackjackGame.dealerHand.get(0).contains("♦")) {
			System.out.print("│ " + AnsiConsol.BLUE(BlackjackGame.dealerHand.get(0))+ "│ ");
		}
		else if(BlackjackGame.dealerHand.get(0).contains("♣")) {
			System.out.print("│ " + AnsiConsol.GREEN(BlackjackGame.dealerHand.get(0))+ "│ ");
		}
		

		System.out.print("│ ? │ ".repeat(BlackjackGame.dealerHand.size() - 1));
		System.out.println();
		System.out.print("            " + "└───┘ ".repeat(BlackjackGame.dealerHand.size()) + "\n");
	}

}