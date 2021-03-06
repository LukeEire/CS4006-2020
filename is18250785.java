/*
 * Student 1: Luke Kellett Murray 18250785
 * Student 2: Scott Kelleher 18255078
 */

import java.util.ArrayList;
import java.util.Scanner;

public class is18250785 {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> open = new ArrayList<Integer>();
		ArrayList<Integer> closed = new ArrayList<Integer>();
		int[][] X = new int[4][4];
		int[][] M = new int[8][8];
	
		int userStartx = -1;
		int userStarty = -1;
		int userGoalx = -1;
		int userGoaly = -1;
	
		//Validate input here
		System.out.println("Co-Ordinates range from 1-8 on both the X-Axis and Y-axis");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter starting X co-ordinate");
		while( 0> userStartx || userStartx > 7) {
		while(!in.hasNextInt()) in.next();
		    userStartx = in.nextInt()-1;
		}
		
		System.out.println("Please enter starting Y co-ordinate");
		while(0> userStarty || userStarty>7) {
		while(!in.hasNextInt()) in.next();
		userStarty = (in.nextInt()-1);
		}
		System.out.println("Please enter goal X co-ordinate");
		while(0>userGoalx || userGoalx>7) {
		while(!in.hasNextInt()) in.next();
		userGoalx = (in.nextInt()-1);
		}
		System.out.println("Please enter goal Y co-ordinate");
		while(0>userGoaly || userGoaly>7) {
		while(!in.hasNextInt()) in.next();
		userGoaly = (in.nextInt()-1);
		}
		in.close();
		
		//Generate blank grid
		String[][] grid = 
			{
					{"[] ","[] ","[] ","[] ","[] ","[] ","[] ","[] ",},
					{"[] ","[] ","[] ","[] ","[] ","[] ","[] ","[] ",},
					{"[] ","[] ","[] ","[] ","[] ","[] ","[] ","[] ",},
					{"[] ","[] ","[] ","[] ","[] ","[] ","[] ","[] ",},
					{"[] ","[] ","[] ","[] ","[] ","[] ","[] ","[] ",},
					{"[] ","[] ","[] ","[] ","[] ","[] ","[] ","[] ",},
					{"[] ","[] ","[] ","[] ","[] ","[] ","[] ","[] ",},
					{"[] ","[] ","[] ","[] ","[] ","[] ","[] ","[] ",},
			};
	
		//Place user defined start and end point
		grid[userStarty][userStartx] = "[S]";
		grid[userGoaly][userGoalx] = "[G]";
		
		int ranShape = (int)((( Math.random() * 3)+1));
		boolean obsDone = false;
		
		//
		while(obsDone == false) {
			
			//Creates 3 block line
			if(ranShape == 1) {
				int ranX = (int) ((Math.random() * 4)+1);
				int ranY = (int) ((Math.random() * 4)+1);
				if(grid [ranY][ranX] != "[S]" && grid [ranY][ranX] != "[G]") {
				grid [ranY][ranX] = "[*]";
				}else {
					continue;
				}
				
				if(grid [ranY][ranX +1] != "[S]" && grid [ranY][ranX +1] != "[G]") {
				grid [ranY][ranX +1] = "[*]";
				}else if(grid [ranY][ranX] == "[*]") {
					grid [ranY][ranX] = "[] ";
					continue;
				}
				
				if(grid [ranY][ranX +2] != "[S]" && grid [ranY][ranX +2] != "[G]") {
				grid [ranY][ranX +2] = "[*]";
				obsDone = true;
				}else if (grid [ranY][ranX] == "[*]" && grid[ranY][ranX +1] == "[*]"){
					grid [ranY][ranX] = "[] ";
					grid [ranY][ranX +1] = "[] ";
					continue;
				}
			}	
		
	
            //Creates T block

            if(ranShape == 2) {

            int ranX = (int) ((Math.random() * 4)+1);
            int ranY = (int) ((Math.random() * 4)+1);

            if(grid [ranY][ranX] != "[S]" && grid [ranY][ranX] != "[G]") {
            	grid [ranY][ranX] = "[*]";
                           }
                  else { 
                   	continue;
                    }
                           
            if(grid [ranY][ranX +1] != "[S]" && grid [ranY][ranX +1] != "[G]") {
                grid [ranY][ranX +1] = "[*]";
                  }
                 else if (grid [ranY][ranX] == "[*]") {
                   grid [ranY][ranX] = "[] ";
                   continue;
                 }
                          
             if(grid [ranY][ranX +2] != "[S]" && grid [ranY][ranX +2] != "[G]") {
                grid [ranY][ranX +2] = "[*]";
                           }
                 else if(grid[ranY][ranX +1] == "[*]" && grid[ranY][ranX] == "[*]") {
                  grid[ranY][ranX +1] = "[] ";
                  grid[ranY][ranX] = "[] ";
                  continue;
                           }

              if(grid [ranY +1][ranX +1] != "[S]" && grid [ranY +1][ranX +1] != "[G]") {
                 grid [ranY +1][ranX+1] = "[*]";
                           }
                 else if (grid[ranY][ranX] == "[*]" && grid[ranY][ranX+1] == "[*]" && grid[ranY][ranX +2] == "[*]") {
                          grid[ranY][ranX] = "[] ";
                          grid[ranY][ranX +1] = "[] ";
                          grid[ranY][ranX +2] = "[] ";
                          continue;
                          }

                          
               if(grid [ranY +2][ranX +1] != "[S]" && grid [ranY +2][ranX +1] != "[G]") {
                  grid [ranY +2][ranX+1] = "[*]";
  				obsDone = true;
                           }
                  else if( grid[ranY][ranX] == "[*]" && grid[ranY][ranX+1] == "[*]" && grid[ranY][ranX +2] == "[*]" && grid[ranY +1][ranX +1] == "[*]") {
                           grid[ranY][ranX] = "[] ";
                           grid[ranY][ranX+1] = "[] ";
                           grid[ranY][ranX +2] = "[] ";
                           grid[ranY +1][ranX +1] = "[] ";
                           continue;
                            }
            }
	
			//Creates L block
			if(ranShape == 3) {
				int ranX = (int) ((Math.random() * 4)+1);
				int ranY = (int) ((Math.random() * 4)+1);
				
				if(grid[ranY][ranX] !="[S]" && grid[ranY][ranX] !="[G]") {
				grid [ranY][ranX] = "[*]";
				}
				else  {
					continue;
				}
				
				if(grid[ranY +1][ranX] !="[S]" && grid[ranY][ranX] !="[G]") {
				grid [ranY+1][ranX] = "[*]";
				}
				else if(grid[ranY][ranX] =="[*]") {
					grid[ranY][ranX] = "[] ";
					continue;
				}
				
				if(grid [ranY+2][ranX] != "[S]" && grid [ranY+2][ranX] != "[G]") {
				grid [ranY+2][ranX] = "[*]";
				}
				else if(grid[ranY][ranX] =="[*]" && grid[ranY +1][ranX] =="[*]") {
					grid[ranY][ranX] ="[] ";
					grid[ranY +1][ranX] ="[] ";
					continue;
				}
				
				if(grid [ranY+2][ranX+1] !="[S]" && grid [ranY+2][ranX+1] != "[G]") {
				grid [ranY+2][ranX+1] = "[*]";
				}
				else if(grid[ranY][ranX] =="[*]" && grid[ranY +1][ranX] =="[*]" && grid [ranY+2][ranX] =="[*]") {
					grid[ranY][ranX] ="[] ";
					grid[ranY +1][ranX] ="[] ";
					grid[ranY +2][ranX] ="[] ";
					continue;
				}
				if(grid [ranY+2][ranX+2] != "[S]" && grid [ranY+2][ranX+2] != "[G]") {
				grid [ranY+2][ranX+2] = "[*]";
				obsDone = true; 
				}
				else if(grid[ranY][ranX] =="[*]" && grid[ranY +1][ranX] =="[*]" && grid [ranY+2][ranX] =="[*]" && grid [ranY+2][ranX+1] == "[*]") {
					grid[ranY][ranX] ="[] ";
					grid[ranY +1][ranX] ="[] ";
					grid[ranY +2][ranX] ="[] ";
					grid[ranY +2][ranX +1] ="[] ";
					continue;
				}
			}	
		}	
		
		//fill out M with index number for each node
		int blockNum = 1;		
		for(int i =0; i < 8; i++) {
			for(int j =0; j < 8; j++) {
				M[i][j] = blockNum;
				blockNum++;
			}
		}		
			
		
		
		
		//Loop roughly goes here
		int currentX = userStartx;
		int currentY = userStarty;
		int Xcount = 0;
		int[][] tempFscore = new int[4][4];
		boolean complete = false;
		
		while(complete == false) {
			
			//Used to get the g value
			int count = 1;
			
			//Checks available moves and adds valid ones to X	
			if(currentX < 7) {
				if(grid[currentY][currentX +1] != "[*]" && (closed.contains(M[currentY][currentX+1]) == false)) {
					X[Xcount][0] = (M[currentY][currentX+1]);
					X[Xcount][1] = currentY;
					X[Xcount][2] = currentX +1;
					X[Xcount][3] = getH(currentX +1, currentY, userGoalx, userGoaly);
					Xcount++;
				}
			}
			
			if(currentX > 0) {
				if(grid[currentY][currentX -1] != "[*]" && (closed.contains(M[currentY][currentX -1]) == false)) {
					X[Xcount][0] = M[currentY][currentX-1];
					X[Xcount][1] = currentY;
					X[Xcount][2] = currentX -1;
					X[Xcount][3] = getH(currentX -1, currentY, userGoalx, userGoaly);
					Xcount++;
				}
			}
			
			if(currentY < 7) {
				if(grid[currentY+1][currentX] != "[*]" && (closed.contains(M[currentY+1][currentX]) == false)) {
					X[Xcount][0] = M[currentY+1][currentX];
					X[Xcount][1] = currentY +1;
					X[Xcount][2] = currentX;
					X[Xcount][3] = getH(currentX, currentY +1, userGoalx, userGoaly);
					Xcount++;
				}
			}
			
			if(currentY > 0) {
				if(grid[currentY -1][currentX] != "[*]" && (closed.contains(M[currentY -1][currentX]) == false)) {
					X[Xcount][0] = M[currentY-1][currentX];
					X[Xcount][1] = currentY -1;
					X[Xcount][2] = currentX;
					X[Xcount][3] = getH(currentX, currentY -1, userGoalx, userGoaly);
					Xcount++;
				}
			}
			
			//Add X items to open
			for (int i=0; i<Xcount; i++) {
					open.add(X[i][0]);
				}
			int newMoves = Xcount;
			Xcount = 0;
			
			//Add current point into closed list
			closed.add(M[currentY][currentX]);
			
			//Removes items in closed from open
			for(int i = 0; i < closed.size(); i++) {
				if(open.contains(closed.get(i))) {
					open.remove(closed.get(i));
				}
			}			
				
			//Sorts data in order of [Node][g value][h value][f value]
			for(int i = 0; i < newMoves; i++) {
				tempFscore[i][0] = open.get((open.size()-newMoves+i));
				tempFscore[i][1] = count *10;
				tempFscore[i][2] = X[i][3];
				tempFscore[i][3] = tempFscore[i][1] + tempFscore[i][2];
			}

			//Chooses the lowest f value
			int bestNode = 1000;
			int bestNodeID = M[currentY][currentX];
			for(int i = 0; i < newMoves; i++) {
				if(tempFscore[i][3] < bestNode) {
					bestNode = tempFscore[i][3];
					bestNodeID = tempFscore[i][0];
				}
				
			}
			
			//Assign current to the previous best node
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(M[i][j] == bestNodeID) {
						currentX = j;
						currentY = i;
						grid[i][j] = "[/]";
						grid[userGoaly][userGoalx] = "[G]";
					}
				}
			}
			
			
			
			//System.out.println("Current node = " + bestNodeID);
			//System.out.println("Current X: " + currentX + "\nCurrent Y: " + currentY); 
			
			if((currentX == userGoalx) && (currentY == userGoaly)) {
				complete = true;
				
			}
			
		}
		
		String movesMade = "";

		for (Integer i : closed)
		{
		    movesMade += i + " ";
		}
		System.out.println("Moves made: " + movesMade);
		
		
		//Brief specifies that grid must be printed before user input and again after when all the calculations have been done and the path is found
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {

					
					System.out.print(grid[i][j]);
					if(j == 7) {
						System.out.println("");
					}
				}
			}
	}
	
	public static int getH(int currentX, int currentY, int goalX, int goalY) {
		int hValue = 0;
		currentX = currentX*10;
		currentY = currentY*10;
		goalX = goalX*10;
		goalY = goalY*10;
		//Manhattan distance
		hValue = Math.abs((currentX - goalX)) + Math.abs((currentY - goalY));
		
		return hValue;
	}

}
	