package solver;
import administrationLogic.Solver;
public class Solvertest {
	public static void main(String[] args){
		///*
		
		byte[][] model= new byte[9][9];
	      model[0][3] = 2 ;
	      model[0][5] = 1 ;

	      model[2][3] = 9 ;
	      model[2][4] = 5 ;
	      model[2][5] = 7 ;

	      model[3][0] = 3 ;
	      model[3][2] = 9 ;
	      model[3][3] = 7 ;
	      model[3][5] = 5 ;
	      model[3][6] = 1 ;
	      model[3][8] = 6 ;

	      model[4][2] = 2 ;
	      model[4][6] = 5 ;

	      model[5][0] = 4 ;
	      model[5][2] = 5 ;
	      model[5][3] = 1 ;
	      model[5][5] = 8 ;
	      model[5][6] = 3 ;
	      model[5][8] = 9 ;

	      model[6][3] = 5 ;
	      
	      byte[][] example= new byte[][]{
				{5,3,4,6,7,8,9,1,2},
				{6,7,0,0,0,0,0,0,8},
				{1,0,0,0,0,0,0,0,7},
				{8,0,0,0,0,0,0,0,3},
				{4,0,0,0,0,0,0,0,1},
				{7,0,0,0,0,0,0,0,6},
				{9,6,0,0,0,0,0,0,0},
				{2,0,0,0,0,0,0,0,5},
				{3,4,5,2,8,6,1,7,9},
			};
			
			byte[][] example2= new byte[][]{
				{5,3,0,0,7,0,0,0,0},
				{6,0,0,1,9,5,0,0,0},
				{0,9,8,0,0,0,0,6,0},
				{8,0,0,0,6,0,0,0,3},
				{4,0,0,8,0,3,0,0,1},
				{7,0,0,0,2,0,0,0,6},
				{0,6,0,0,0,0,2,8,0},
				{0,0,0,4,1,9,0,0,5},
				{0,0,0,0,8,0,0,7,9},
			};
			byte[][] example3= new byte[][]{
				{5,3,4,6,7,8,9,1,2},
				{6,7,9,1,9,5,3,4,8},
				{1,9,8,3,4,2,5,6,7},
				{8,5,9,7,6,1,4,2,3},
				{4,2,6,8,0,3,7,9,1},
				{7,1,3,9,2,4,8,5,6},
				{9,6,1,5,0,7,2,8,5},
				{2,8,7,4,1,9,6,3,5},
				{3,4,5,2,8,6,1,7,8},
			};
			byte[][] example4=new byte[9][9];

		/*
	      model= new byte[][]{
			{5,3,0,0,7,0,0,0,0},
			{6,0,0,1,9,5,0,0,0},
			{0,9,8,0,0,0,0,6,0},
			{8,0,0,0,6,0,0,0,3},
			{4,0,0,8,0,3,0,0,1},
			{7,0,0,0,2,0,0,0,6},
			{0,6,0,0,0,0,2,8,0},
			{0,0,0,4,1,9,0,0,5},
			{0,0,0,0,8,0,0,7,9},
		};//*/
		//IntelligentBacktracking a= new IntelligentBacktracking();
	      byte[][] TEST=model;
	      for(int x=0;x<9;x++){
				for(int y=0;y<9;y++){
					System.out.print(" "+TEST[x][y]);
				}
				System.out.println("");
			}
		Solver a=new Solver();
		byte[][] Test=a.solver(TEST);
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				System.out.print(" "+Test[x][y]);
			}
			System.out.println("");
		}
		long startTime = System.currentTimeMillis();
		for (int i=0;i<1000;i++){
		a.solver(TEST);
		a.solver(example3);
		a.solver(example2);
		a.solver(example2);
		a.solver(example);
		a.solver(example4);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Zeit um 1000 Sudokus zu l�sen: "+((endTime-startTime)/6));
		
		//*/
		
		/*
		
		//example=new byte[9][9];
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				System.out.print(" "+example[x][y]);
			}
			System.out.println("");
		}
		//example[8][0]=7;
		
		System.out.println("");
		System.out.println("");
		
		LogicSolv i=new LogicSolv();
		byte[][] solve=i.solver(example);
		System.out.println("Solv1:");
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				System.out.print(" "+solve[x][y]);
			}
			System.out.println("");
		}
		System.out.println("Solv2:");
		byte[][] solve2=i.solver(solve);
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				System.out.print(" "+solve2[x][y]);
			}
			System.out.println("");
		}
		
		byte[][] solve3=i.solver(example2);
		System.out.println("Solv3:");
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				System.out.print(" "+solve3[x][y]);
			}
			System.out.println("");
		}

		
		byte[][] solve4=i.solver(example3);
		System.out.println("Solv4:");
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				System.out.print(" "+solve4[x][y]);
			}
			System.out.println("");
		}
		//*/
		
	}
}
