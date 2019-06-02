package com.amrut;

public class Example {

	
	int west=100;
	int south=200;
	int north=400;
	int east=300;
	double [][]input =new double[5][5];
	
	
	public static void main(String[] args) {
		Example service=new Example();
		service.calculateTemprature();
		
		
	}

	
	
	public void calculateTemprature(){
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				input[i][j]=150;
			}
		}
		
		for(int count=0;count<7;count++){
			input[0][0]=calculateTp1(input[0][1],input[1][0]);
			for(int x=1;x<4;x++)
			input[0][x]=calculateSouthLine(input[0][x-1],input[1][x],input[0][x+1]);
			
			
			input[0][4]=calculateTp5(input[0][3],input[1][4]);
			
			for(int x=1;x<4;x++)
				input[x][0]=calculateWestLine(input[x-1][0],input[x][1],input[x+1][0]);
				
			
			input[4][0]=calculateTp21(input[3][0],input[4][1]);
			
			for(int x=1;x<4;x++)
				input[4][x]=calculateNorthLine(input[4][x-1],input[3][x],input[4][x+1]);
			
			input[4][4]=calculateTp25(input[4][3],input[3][4]);
			
			
			for(int x=1;x<4;x++)
				input[x][4]=calculateEastLine(input[x-1][4],input[x][3],input[x+1][4]);
				
			
			for(int i=1;i<4;i++){
				for( int j=1;j<4;j++ ){
					input[i][j]=	calculateCenter(input[i-1][j],input[i][j-1],input[i][j+1],input[i+1][j]);
				}
			}
		}
		
		
			
			for(int y=0;y<5;y++){
				System.out.println();
				for(int z=0;z<5;z++){
					System.out.print(input[y][z]+"  ");
					
				}
			}
		
	}
	public double calculateTp1(double a,double b){
		 double tp1=(2*west+2*south+a+b)/6;
		 return tp1;
	}
	public double calculateSouthLine(double a,double b,double c){
		 double southLine=(2*south+a+b+c)/5;
		 return southLine;
	}
	public double calculateTp5(double a,double b){
		 double tp5=(2*east+2*south+a+b)/6;
		 return tp5;
	}
	public double calculateWestLine(double a,double b,double c){
		 double westLine=(2*west+a+b+c)/5;
		 return westLine;
	}

	public double calculateTp21(double a,double b){
		 double tp21=(2*north+2*west+a+b)/6;
		 return tp21;
	}
	public double calculateNorthLine(double a,double b,double c){
		 double northLine=(2*north+a+b+c)/5;
		 return northLine;
	}
	
	
	public double calculateTp25(double a,double b){
		 double tp25=(2*north+2*east+a+b)/6;
		 return tp25;
	}
	
	public double calculateEastLine(double a,double b,double c){
		 double eastLine=(2*east+a+b+c)/5;
		 return eastLine;
	}
	
	
	public double calculateCenter(double a,double b,double c,double d){
		 double center=(a+b+c+d)/4;
		 return center;
	}
	
	
	
	
}
