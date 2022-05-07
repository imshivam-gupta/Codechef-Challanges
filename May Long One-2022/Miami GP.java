// Chef has finally got the chance of his lifetime to drive in the F1 tournament. But, there is one problem. Chef did not know about the 107% rule and now he is worried whether he will be allowed to race in the main event or not.

// Given the fastest finish time as X seconds and Chef's finish time as Y seconds, determine whether Chef will be allowed to race in the main event or not.

// Note that, Chef will only be allowed to race if his finish time is within 107% of the fastest finish time.

// Input Format
// First line will contain T, number of testcases. Then the testcases follow.
// Each testcase contains of a single line of input, two space separated integers X and Y denoting the fastest finish time and Chef's finish time respectively.
// Output Format
// For each test case, output YES if Chef will be allowed to race in the main event, else output NO.

// You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

// Constraints
// 1≤T≤2⋅104
// 1≤X≤Y≤200
// Sample Input 1 
// 4
// 1 2
// 15 16
// 15 17
// 100 107
// Sample Output 1 
// NO
// YES
// NO
// YES
// Explanation
// Test case 1: The fastest car finished in 1 second. Thus, Chef should have finished on or before 1.07 seconds to ensure qualification but he finished in 2 seconds. Hence, Chef will not be allowed to race in the main event.

// Test case 2: The fastest car finished in 15 seconds. Thus, Chef should have finished on or before 16.05 seconds to ensure qualification and he managed to finish in 16 seconds. Hence, Chef will be allowed to race in the main event.

// Test case 3: The fastest car finished in 15 seconds. Thus, Chef should have finished on or before 16.05 seconds to ensure qualification but he finished in 17 seconds. Hence, Chef will not be allowed to race in the main event.

// Test case 4: The fastest car finished in 100 seconds. Thus, Chef should have finished on or before 107 seconds to ensure qualification and he finished just in time for qualification. Hence, Chef will be allowed to race in the main event.


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
            
            if(107*x<100*y){
                System.out.println("NO");
            }

            else{
                System.out.println("YES");
            }
            
        } 
	}
}
