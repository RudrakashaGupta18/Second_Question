/**
 * waterbottle
 */
public class waterbottle {
    public static void main(String[] args) {
        
    
        int numBottles=9;
        int numExchange=3;

        int ans = numBottles;

        while(numBottles >= numExchange){

            int newBottels = numBottles / numExchange;

            int remBottels = numBottles % numExchange;

            ans = ans + newBottels;

            numBottles = newBottels + remBottels;

        }
        System.out.println(ans);
    }

}