/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Tejas Shah
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE
		int counter = 2;
		int numRow = Integer.parseInt(args[0]);
		int numCol= Integer.parseInt(args[1]);
		int [][] arr = new int [numRow] [numCol];
		int sum=0;
		int [] totArr = new int [numCol];

		for (int i=0; i< numRow; i++){
			for(int j=0; j< numCol; j++){
				arr[i][j] = Integer.parseInt(args[counter]);
				counter++;
			}
		}
		for (int i =0; i< numCol; i++){
			for (int j =0; j< numRow; j++){
				sum+= arr[j][i];
			}
			totArr[i]= sum;
			sum=0;
		}
		int output =0;
		int numOfIndex=0;
		for (int i =0; i< numCol; i++){
			if (totArr[i]> output){
				output = totArr[i];
				numOfIndex=i;
			}
		}
		System.out.println(numOfIndex);

	
	}
}
