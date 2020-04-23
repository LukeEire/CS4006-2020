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
		int[][] X = new int[4][3];
		int[][] M = new int[8][8];
	
		int userStartx;
		int userStarty;
		int userGoalx;
		int userGoaly;
	
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter starting X co-ordinant");
		userStartx = (in.nextInt()-1);
		System.out.println("Please enter starting Y co-ordinant");
		userStarty = (in.nextInt()-1);
		System.out.println("Please enter goal X co-ordinant");
		userGoalx = (in.nextInt()-1);
		System.out.println("Please enter goal Y co-ordinant");
		userGoaly = (in.nextInt()-1);
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
                   grid [ranY][ranX] = "[]";
                   continue;
                 }
                          
             if(grid [ranY][ranX +2] != "[S]" && grid [ranY][ranX +2] != "[G]") {
                grid [ranY][ranX +2] = "[*]";
                           }
                 else if(grid[ranY][ranX +1] == "[*]" && grid[ranY][ranX] == "[*]") {
                  grid[ranY][ranX +1] = "[]";
                  grid[ranY][ranX] = "[]";
                  continue;
                           }

              if(grid [ranY +1][ranX +1] != "[S]" && grid [ranY +1][ranX +1] != "[G]") {
                 grid [ranY +1][ranX+1] = "[*]";
                           }
                 else if (grid[ranY][ranX] == "[*]" && grid[ranY][ranX+1] == "[*]" && grid[ranY][ranX +2] == "[*]") {
                          grid[ranY][ranX] = "[]";
                          grid[ranY][ranX +1] = "[]";
                          grid[ranY][ranX +2] = "[]";
                          continue;
                          }

                          
               if(grid [ranY +2][ranX +1] != "[S]" && grid [ranY +2][ranX +1] != "[G]") {
                  grid [ranY +2][ranX+1] = "[*]";
  				obsDone = true;
                           }
                  else if( grid[ranY][ranX] == "[*]" && grid[ranY][ranX+1] == "[*]" && grid[ranY][ranX +2] == "[*]" && grid[ranY +1][ranX +1] == "[*]") {
                           grid[ranY][ranX] = "[]";
                           grid[ranY][ranX+1] = "[]";
                           grid[ranY][ranX +2] = "[]";
                           grid[ranY +1][ranX +1] = "[]";
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
					grid[ranY][ranX] = "[]";
					continue;
				}
				
				if(grid [ranY+2][ranX] != "[S]" && grid [ranY+2][ranX] != "[G]") {
				grid [ranY+2][ranX] = "[*]";
				}
				else if(grid[ranY][ranX] =="[*]" && grid[ranY +1][ranX] =="[*]") {
					grid[ranY][ranX] ="[]";
					grid[ranY +1][ranX] ="[]";
					continue;
				}
				
				if(grid [ranY+2][ranX+1] !="[S]" && grid [ranY+2][ranX+1] != "[G]") {
				grid [ranY+2][ranX+1] = "[*]";
				}
				else if(grid[ranY][ranX] =="[*]" && grid[ranY +1][ranX] =="[*]" && grid [ranY+2][ranX] =="[*]") {
					grid[ranY][ranX] ="[]";
					grid[ranY +1][ranX] ="[]";
					grid[ranY +2][ranX] ="[]";
					continue;
				}
				if(grid [ranY+2][ranX+2] != "[S]" && grid [ranY+2][ranX+2] != "[G]") {
				grid [ranY+2][ranX+2] = "[*]";
				obsDone = true; 
				}
				else if(grid[ranY][ranX] =="[*]" && grid[ranY +1][ranX] =="[*]" && grid [ranY+2][ranX] =="[*]" && grid [ranY+2][ranX+1] == "[*]") {
					grid[ranY][ranX] ="[]";
					grid[ranY +1][ranX] ="[]";
					grid[ranY +2][ranX] ="[]";
					grid[ranY +2][ranX +1] ="[]";
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
		
		while((currentX != userGoalx) && (currentY != userGoaly)) {
			
			//Used to get the g value
			int count = 1;
			
			//Checks available moves and adds valid ones to X	
			if(currentX < 7) {
				if(grid[currentY][currentX +1] != "[*]") {
					X[Xcount][0] = (M[currentY][currentX+1]);
					X[Xcount][1] = currentY;
					X[Xcount][2] = currentX;
					Xcount++;
				}
			}
			
			if(currentX > 0) {
				if(grid[currentY][currentX -1] != "[*]") {
					X[Xcount][0] = M[currentY][currentX-1];
					X[Xcount][1] = currentY;
					X[Xcount][2] = currentX;
					Xcount++;
				}
			}
			
			if(currentY < 7) {
				if(grid[currentY+1][currentX] != "[*]") {
					X[Xcount][0] = M[currentY+1][currentX];
					X[Xcount][1] = currentY;
					X[Xcount][2] = currentX;
					Xcount++;
				}
			}
			
			if(currentY > 0) {
				if(grid[currentY -1][currentX] != "[*]") {
					X[Xcount][0] = M[currentY-1][currentX];
					X[Xcount][1] = currentY;
					X[Xcount][2] = currentX;
					Xcount++;
				}
			}
			
			//System.out.println("reached line 250");
			//Add X items to open
			for (int i=0; i<Xcount; i++) {
				if(closed.contains(X[i][0])) {
					X[i][0] = 0;
					X[i][1] = 0;
					X[i][2] = 0;
				}else {
				open.add(X[i][0]);
				X[i][0] = 0;
				X[i][1] = 0;
				X[i][2] = 0;
				}
			}
			int newMoves = Xcount;
			Xcount = 0;
			
			//Add current point into closed list
			closed.add(M[currentY][currentX]);
			
			//Removes items in closed from open
			/*for(int i = 0; i < newMoves; i++) {
				if(closed.contains(open.get(open.size()-i))) {
					open.remove(open.size()-i);
				}
			}*/
			
			Object[] closedTemp = closed.toArray();
			
			for(int i = 0; i < closedTemp.length; i++) {
				if(open.contains(closedTemp[i])) {
					open.remove(closedTemp[i]);
				}
			}
					
				
			
			//System.out.println("reached line 287");
			//Sorts data in order of [Node][g value][h value][f value]
			//Contains issue as it will hit an out of bounds exception because open is bigger than the allocated fscore array size of 4
			//For this section it needs some other method to track placement rather than going of the size of open as it causes too many out of bounds errors
			//I would say it might need some other kind of count to keep track of whats in open for our sake or even writing it down so we get the logic and can
			//remove the correct entry from open without all the extra confusion
			//Another potential option is the iterator.remove function within array lists that might be of use. Can you try mess with both of these please
			for(int i = 0; i < newMoves; i++) {
				tempFscore[i][0] = open.get((open.size()-i)-1);
				tempFscore[i][1] = count *10;
				tempFscore[i][2] = getH(currentX, currentY, userGoalx, userGoaly);
				tempFscore[i][3] = tempFscore[i][1] + tempFscore[i][2];
			}
			
			//System.out.println("reached line 300");
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
					}
				}
			}
			
			System.out.println("Current node = " + bestNodeID);
			
		}
		
		//Brief specifies that grid must be printed before user input and again after when all the calculations have been done and the path is found
			for (int i = 0; i < 8; i++) {
				//System.out.println("reached i loop");
				for (int j = 0; j < 8; j++) {

					
					System.out.print(grid[i][j]);
					if(j == 7) {
						System.out.println("");
					}
				}
			}
			System.out.println("reached line 334");
	}
	
	public static int getH(int currentX, int currentY, int goalX, int goalY) {
		int hValue = 0;
		currentX = currentX*10;
		currentY = currentY*10;
		goalX = goalX*10;
		goalY = goalY*10;
		//Manhattan distance
		hValue = (currentX - goalX) + (currentY + goalY);
		if(hValue < 0) {
			hValue = hValue * -1;
		}
		return hValue;
	}
}
	
