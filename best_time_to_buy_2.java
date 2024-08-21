import java.util.*;
public class best_time_to_buy_2{
    public static int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE; //variable declation
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){   //5<6
            if(prices[i]<minPrice){         //6<1
                minPrice=prices[i];         //1
            }
            else if(prices[i]-minPrice>maxProfit){  //5>4
                maxProfit=prices[i]-minPrice;  //5

            }
        }
        return maxProfit;
        }
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        int profit=maxProfit(prices);
        System.out.println(profit);
    }
}

