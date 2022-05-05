// hef wants to buy a new laptop. However, he is confused about which laptop to buy out of 10 different laptops. He asks his N friends for their recommendation. The ith friend recommends the Chef to buy the Aithlaptop (1≤Ai≤10).

// Chef will buy the laptop which is recommended by maximum number of friends. Determine which laptop Chef buys.
// Print CONFUSED if there are multiple laptops having maximum number of recommendations.

// Input Format
// The first line contains a single integer T - the number of test cases. Then the test cases follow.
// The first line of each test case contains an integer N - the number of Chef's friends.
// The second line of each test case contains N space-separated integers A1,A2,…,AN where Ai denotes the recommendation of the ith friend.
// Output Format
// For each test case, output in a single line, the laptop which has the maximum number of recommendations. Print CONFUSED if there are multiple laptops having maximum number of recommendations.

// You may print each character of CONFUSED in uppercase or lowercase (for example, Confused, coNFused, CONFused will be considered identical).

// Constraints
// 1≤T≤200
// 1≤N≤1000
// 1≤Ai≤10
// Sample Input 1 
// 4
// 5
// 4 4 4 2 1
// 7
// 1 2 3 4 5 6 6
// 6
// 2 2 3 3 10 8
// 4
// 7 7 8 8
// Sample Output 1 
// 4
// 6
// CONFUSED
// CONFUSED
// Explanation
// Test case 1: Laptop 4 has the maximum number of recommendations. Therefore, Chef will buy the 4th laptop.

// Test case 2: Laptop 6 has the maximum number of recommendations. Therefore, Chef will buy the 6th laptop.

// Test case 3: Laptops 2, 3 have the maximum number of recommendations. Therefore, Chef will still be CONFUSED.

// Test case 4: Laptops 7, 8 have the maximum number of recommendations. Therefore, Chef will still be CONFUSED.


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
{
	Scanner s=new Scanner(System.in);
		int t=s.nextInt();
        for(int k=1;k<=t;k++)
        {
            // CODE STARTS HERE
            int x=s.nextInt();
            int[] arr = new int[x];
            
             for (int i = 0; i < x; ++i) {
                arr[i] = s.nextInt();
            }
            
            HashMap<Integer, Integer> frq = new HashMap<Integer,Integer>();
            
            for(int i:arr)
            {
            
            if(frq.containsKey(i))
                frq.put(i,frq.get(i)+1);
            
            else
                frq.put(i,1);
            
                
            }
            
            
            int maxf=-1;
            int max=-1;
            
            for(int i:arr)
        {
             if(frq.get(i)>maxf)
             {
                 maxf=frq.get(i);
                 max=i;
             }
        }
        
        frq.remove(max,maxf);
        
        // System.out.println(max+" "+maxf);
        
        int maxf2=-1;
        int max2=-1;
            
            for(int i:arr)
        {
             if(frq.get(i)!=null && frq.get(i)>maxf2)
             {
                 maxf2=frq.get(i);
                 max2=i;
             }
        }
        
        // System.out.println(max2+" "+maxf2);
        
        if(maxf==maxf2){
            System.out.println("Confused");
        }
        
        else{
            System.out.println(max);
        }
        
           
            
           
	}
}
}
