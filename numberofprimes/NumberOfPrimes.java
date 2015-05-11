
package numberofprimes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author siobhan
 */
public class NumberOfPrimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = null;
//        try {
//            bw = new BufferedWriter(new FileWriter(fileName));
//        } catch (IOException ex) {
//            Logger.getLogger(NumberOfPrimes.class.getName()).log(Level.SEVERE, null, ex);
//        }
        int res;
        int _N;
        _N = Integer.parseInt(in.nextLine());
        res = getNumberOfPrimes(_N);
//        bw.write(String.valueOf(res));
//        bw.newLine();
//        
//        bw.close();
        System.out.println(": " + res);
    }
    
    static int getNumberOfPrimes(int N) {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        int loops = N - 3;
        for(int i = 2; i < loops; i++) {
            if(check(primes, i)) {
                primes.add(i);
               
            }
            
        }
        return primes.size();
    }
    
    private static boolean check(ArrayList<Integer> primes, int n) {
        for (Integer prime : primes) {
            if (n % prime == 0 && n != prime) {
                return false;
            }
        }
        return true;
    }
    
    
}
