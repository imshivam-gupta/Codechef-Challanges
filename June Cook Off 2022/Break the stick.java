// Chef has a stick of length N.

// He can break the stick into 2 or more parts such that the parity of length of each part is same. For example, a stick of length 11 can be broken into three sticks of lengths {3,3,5} since each part is odd, but it cannot be broken into two sticks of lengths {5,6} since one is even and the other is odd.

// Chef can then continue applying this operation on the smaller sticks he obtains, as many times as he likes.

// Can Chef obtain a stick of length exactly X by doing this?

// Input Format
// The first line of input will contain a single integer T, denoting the number of test cases. The description of the test cases follows.
// Each test case consists of a single line of input, containing two space-separated integers N,X.
// Output Format
// For each test case, output on a new line YES if Chef can obtain a stick of length exactly X, and NO otherwise.

// Each letter of the output may be printed in either lowercase or uppercase. For example, the strings YES, yEs, and Yes will be considered identical.

// Constraints
// 1≤T≤1000
// 1≤X<N≤109
// Sample Input 1 
// 3
// 6 1
// 3 2
// 4 3
// Sample Output 1 
// YES
// NO
// YES
// Explanation
// Test case 1: Chef can initially break the stick into 3 parts of length 2 each. After that, Chef can pick any segment of length 2 and break it into 2 sticks of length 1 each.

// Test case 2: Chef cannot obtain a stick of length 2, since the only way to break a stick of length 3 following the given conditions is into three parts of length 1 each.

// Test case 3: Chef can break the stick into lengths 3 and 1.


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
            
            int n=s.nextInt();
            int x=s.nextInt();
            
            if(x%2!=0)
                System.out.println("YES");
                
            else{
                if((n-x)%2==0)
                    System.out.println("YES");
                    
                else
                    System.out.println("NO");
            }
            
            
        } 
	}
}
