// It is the final day of La Liga. Chef has a certain criteria for assessing football matches.
// In particular, he only likes a match if:

// The match ends in a draw, and,
// At least one goal has been scored by either team.
// Given the goals scored by both the teams as X and Y respectively, determine whether Chef will like the match or not.

// Input Format
// The first line of input will contain a single integer T, denoting the number of test cases. The description of T test cases follows.
// Each test case consists of a single line of input containing two space-separated integers X and Y — the goals scored by each team.
// Output Format
// For each test case, output YES if Chef will like the match, else output NO.

// You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

// Constraints
// 1≤T≤100
// 0≤X,Y≤9
// Sample Input 1 
// 4
// 1 1
// 0 1
// 0 0
// 2 2
// Sample Output 1 
// YES
// NO
// NO
// YES
// Explanation
// Test case 1: It is a draw in which both teams have scored a goal, Chef will like this match.

// Test case 2: The game is not a draw. Hence, Chef will not like this match.

// Test case 3: Neither team scored a goal, so Chef will not like this match.

// Test case 4: It is a draw in which both teams scored 2 goals each. Chef will like this match.


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
            
            if(x==y && x>0 && y>0){
                System.out.println("YES");
            }

            else{
                System.out.println("NO");
            }
            
        } 
	}
}
