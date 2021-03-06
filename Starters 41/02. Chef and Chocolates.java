// Chef has X 5 rupee coins and Y 10 rupee coins. Chef goes to a shop to buy chocolates for Chefina where each chocolate costs Z rupees. Find the maximum number of chocolates that Chef can buy for Chefina.

// Input Format
// The first line contains a single integer T — the number of test cases. Then the test cases follow.
// The first and only line of each test case contains three integers X, Y and Z — the number of 5 rupee coins, the number of 10 rupee coins and the cost of each chocolate.
// Output Format
// For each test case, output the maximum number of chocolates that Chef can buy for Chefina.

// Constraints
// 1≤T≤100
// 1≤X,Y,Z≤1000
// Sample Input 1 
// 4
// 10 10 10
// 3 1 8
// 8 1 3
// 4 4 1000
// Sample Output 1 
// 15
// 3
// 16
// 0
// Explanation
// Test case 1: Chef has 10⋅5+10⋅10=150 rupees in total. Since each chocolate costs 10 rupees, Chef can spend all 150 rupees and buy 15 chocolates for Chefina.

// Test case 2: Chef has 3⋅5+1⋅10=25 rupees in total. Since each chocolate costs 8 rupees, Chef can buy a maximum of 3 chocolates for Chefina, leaving him with 1 rupee.

// Test case 3: Chef has 8⋅5+1⋅10=50 rupees in total. Since each chocolate costs 3 rupees, Chef can buy a maximum of 16 chocolates for Chefina, leaving him with 2 rupee.

// Test case 4: Chef has 4⋅5+4⋅10=60 rupees in total. Since each chocolate costs 1000 rupees, Chef can buy no chocolate for Chefina, leaving him with 60 rupees.

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
            int y=s.nextInt();
            int z=s.nextInt();
            
            System.out.println((5*x+10*y)/z);
            
          
        } 
	}
}
