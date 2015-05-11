
package passingcars;

/**
 *
 * @author siobhan
 */
public class PassingCars {
    private static int[] testArray = {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(solution(testArray));
    }
    
    public static int solution(int[] A) {
        int count0 = 0;
        int countPairs = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                count0++;
            } else {
                countPairs += count0;
            }
        }
        if(countPairs <= 1000000000 && countPairs >= 0) {
            return countPairs; 
        } else {
            return -1;
        }
        
    }
    
}
