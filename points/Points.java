/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package points;

/**
 *
 * @author siobhan
 */
public class Points {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("points: " + countPoints(0, -1));
    }
    
    private static int countPoints(int x, int y) {
        int distance = Math.max(Math.abs(x), Math.abs(y)) - 1;
        System.out.println("distance: " + distance);
        int points;
        points = (int)Math.pow(distance * 2 + 1, 2);
       
        int n = 0;
        if(Math.abs(x) > Math.abs(y)) {
            if(x >= 0) {
                n = (x * 2) + (x - y);
            } else {
                n = (Math.abs(x) * 2 * 4) + (-x + y);
            }
        } else {
            if(y > 0) {
                
                n = ((y-1) * 2) + (y - x);
            } else if(y <= 0) {
                n = ((Math.abs(y)- 1) * 2 + (Math.abs(y)) * 4 ) + (- y + x);
            } 
        }
        points += n;
        return points;
    }
    
}
