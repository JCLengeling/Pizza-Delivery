import java.util.Scanner;


public class Main {
	static Scanner reader;
	static int[][] city;
	
	public static void main(String[] args) {
		reader = new Scanner (System.in);
		int number, x,y;
		//System.out.println("How many test cases (between 1 and 20)?");
		number = reader.nextInt();
		
		while (number >= 1){
			number -= 1;
			//init city and cost
			//System.out.println("Size of the city X and Y (between 1 and 100)?");
			
			x = reader.nextInt();
			y = reader.nextInt();
			
			//System.out.println("Number of deliveries?"); 
			city = new int[y][];
			for (int i = 0; i < y;i++){
				city[i] = new int[x];
				for(int j = 0; j <x;j++){
					city[i][j] = reader.nextInt();
				}
			}
			
			int bestCost = 0;
			
			for (int i = 0; i < y;i++){
				for(int j = 0; j <x;j++){
					int localCost = 0;
					for (int k = 0; k < y;k++){
						for(int l = 0; l <x;l++){
							int delta = Math.abs(i-k) + Math.abs(j-l);
							localCost = localCost + delta*city[k][l];
						}
					}
					if(bestCost == 0 || localCost < bestCost){
						bestCost = localCost;
					}
					
				}
			}
			//System.out.println("Best cost is " + bestCost + " blocks");
			System.out.println("" + bestCost + " blocks");
			
		}
	}
}
