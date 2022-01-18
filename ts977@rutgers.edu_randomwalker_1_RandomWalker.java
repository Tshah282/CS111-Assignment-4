/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    // WRITE YOUR CODE HERE
    public static void main(String[] args) {

        int x = 0; 
        int y = 0;
        int randDistance;
        double totDistance=0;
        int n = Integer.parseInt(args[0]);
        System.out.println("(" + x + "," + y + ")");
        for ( int i = 0; i < n; i++)
        {
            randDistance=(int)(Math.random() * 4);
           if (randDistance== 0) {
               x++;
           } 
           else if (randDistance ==1) 
           {
               x--;
           }
           else if (randDistance ==2){
               y++;
           }
           else if (randDistance== 3){
               y--;
           }
            System.out.println("(" + x + "," + y + ")");
        }
        totDistance = Math.pow(x,2) + Math.pow(y,2);
        System.out.println("Squared Distance = " + totDistance);
    
    }
}
