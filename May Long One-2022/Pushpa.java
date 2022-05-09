// Pushpa has entered Chefland and wants to establish Pushpa-Raj here too.

// Chefland has N towers where the height of the ith tower is Hi. To establish Pushpa-Raj, Pushpa does the following:

// Initially, Pushpa chooses any tower i (1≤i≤N) and lands on the roof of that tower.
// Let X denote the height of the tower Pushpa is currently on, then, Pushpa can land on the roof of any tower j (1≤j≤N) such that the height of the jth tower is (X+1).
// Let i denote the index of the tower on which Pushpa lands, then, the height of all towers except tower i increases by 1 after each jump including the initial jump.

// To establish Pushpa-Raj, Pushpa wants to land at the maximum height possible. Determine the maximum height Pushpa can reach.

// Input Format
// The first line contains a single integer T - the number of test cases. Then the test cases follow.
// The first line of each test case contains an integer N - the number of towers
// The second line of each test case contains N space-separated integers H1,H2,…,HN denoting the initial heights of each of the towers from the ground.
// Output Format
// For each test case, output in a single line the maximum height achieved by Pushpa.

// Constraints
// 1≤T≤10
// 1≤N≤105
// 1≤Hi≤109
// Sample Input 1 
// 2
// 4
// 1 2 1 3
// 1
// 2
// Sample Output 1 
// 3
// 2
// Explanation
// Test case 1: If Pushpa chooses to start from tower at index 1 with height of 1 unit, then, the new heights will be [1,3,2,4]. He can then jump to the 3rd tower (with height 2 units). The updated heights of the towers is [2,4,2,5]. Pushpa is unable to make any more jumps.
// The optimal way to in this case is to take an initial jump at tower 4 with height 3. The maximum height Pushpa can reach is 3.
// Test case 2: There is only 1 tower so Pushpa reaches the maximum height of 2 units.


/* package codechef; // don't place package name! */

import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

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
            int n=s.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }

            Arrays.sort(arr);

            if(n==1)
            {
               System.out.println(arr[0]);
            }

            else{
            int max=arr[n-1];
            int max_count=0;
            int ans=0;

            for(int i=n-1;i>=0;i--)
            {
                if(arr[i]==max){
                    max_count++;
                }

                else{
                    if(ans<=max+max_count-1){
                        ans=max+max_count-1;
                    }

                    max=arr[i];
                    max_count=1;
                }

       
            }

            System.out.println(ans);
        }

        } 
	}
}
