/*

An array A of length N is said to be pseudo-sorted if it can be made non-decreasing after performing the following operation at most once.

Choose an i such that 1≤i≤N−1 and swap Ai and Ai+1
Given an array A, determine if it is pseudo-sorted or not.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first line of each test case contains an integer N - the size of the array A.
The second line of each test case contains N space-separated integers A1,A2,…,AN denoting the array A.
Output Format
For each testcase, output YES if the array A is pseudo-sorted, NO otherwise.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
1≤T≤1000
2≤N≤105
1≤Ai≤109
Sum of N over all test cases do not exceed 2⋅105
Sample Input 1 
3
5
3 5 7 8 9
4
1 3 2 3
3
3 2 1
Sample Output 1 
YES
YES
NO
Explanation
Test case 1: The array is already sorted in non-decreasing order.

Test case 2: We can choose i=2 and swap A2 and A3. The resulting array will be [1,2,3,3], which is sorted in non-decreasing order.

Test case 3: It can be proven that the array cannot be sorted in non-decreasing order in at most one operation.

*/


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static boolean isSorted(int arr[]){
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i])
            {
                return false;
            }
        }

        return true;
    }
    
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
           
            if(isSorted(arr)){
                System.out.println("YES");
            }

            else{
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i+1]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    if(isSorted(arr))
                    {
                        System.out.println("YES");
                        break;
                    }

                    else{
                        System.out.println("NO");
                        break;
                    }
                }
            }
        }
    }


        }
	}

