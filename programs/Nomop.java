class Nomop{

	public static void main(String[] args){
		Player[] players = new Player[4];

		for(int i = 0; i <players.length; i ++){
			players[i] = new Player(1000, 0);
			System.out.println("Created new player with $"+players[i].getVal() + " at square "+ players[i].getLoc());
		}

		
		Square[] board = new Square[10];

		for(int i = 0; i < board.length; i ++){
			board[i] = new Square(((int)(Math.random()*(4) + 1) * 100));
			System.out.println("Created new Square with price"+board[i].getPrice());
		}

		while(true){
			for(int pnum = 0; pnum <= 3; pnum ++){
				Player p = players[pnum]; //shortcut, 111ers won't know to do this, it isn't needed
				int roll = (int)(Math.random()*3 + 1);
				
				System.out.println("========================================\nrolled a " + roll + " for player " + pnum);
				p.moveUp(roll);
				System.out.println("Player " + pnum + " is now on " + p.getLoc());
				
				if(board[p.getLoc()].getOwner() == -1){
					p.removeVal(board[p.getLoc()].getPrice());
					board[p.getLoc()].setOwner(pnum);
					System.out.println("Player " + pnum + " now owns block " + p.getLoc() + "and has $" + p.getVal());
				}else{
					p.removeVal(board[p.getLoc()].getPrice());
					players[board[p.getLoc()].getOwner()].addVal(board[p.getLoc()].getPrice()); //yuck
					System.out.println("Player " + pnum + " now just paid " + board[p.getLoc()].getPrice() + " to player " + board[p.getLoc()].getOwner()+ " and has $" + p.getVal());

				}


				if(p.getVal() <= 0){
					System.out.println("Player " + pnum + " has run out of money and won!\n\nPlayer wallets and positions:");
					for(int i = 0; i<players.length; i ++){
						System.out.println("Player " + i + " is at " + players[i].getLoc() + " with $" + players[i].getVal());
					}
					return;
				}
			}	
		}	
	}
}
