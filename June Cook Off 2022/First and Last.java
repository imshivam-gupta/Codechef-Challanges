// You are given an array A=[A1,A2,…,AN] of length N.

// You can right rotate it any number of times (possibly, zero). What is the maximum value of A1+AN you can get?

// Note: Right rotating the array [A1,A2,…,AN] once gives the array [AN,A1,A2,…,AN−1]. For example, right rotating [1,2,3] once gives [3,1,2], and right rotating it again gives [2,3,1].

// Input Format
// The first line of input will contain a single integer T, denoting the number of test cases. The description of the test cases follows.
// The first line of each test case contains a single integer N, denoting the length of array A.
// The second line of each test case contains N space-separated integers A1,A2,…,AN — denoting the array A.
// Output Format
// For each test case, output on a new line the maximum value of A1+AN you can get after several right rotations.

// Constraints
// 1≤T≤1000
// 2≤N≤105
// 1≤Ai≤109
// The sum of N across all test cases does not exceed 105
// Sample Input 1 
// 3
// 2
// 5 8
// 3
// 5 10 15
// 4
// 4 4 4 4
// Sample Output 1 
// 13
// 25
// 8
// Explanation
// Test case 1: Whether you right rotate the array or not, you will always end up with A1+AN=13.

// Test case 2: It is optimal to right rotate the array once after which the array becomes [15,5,10] with A1+AN=25.

// Test case 3: No matter how much you right rotate the array, you will always obtain A1+AN=8.

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
            
            int max=arr[0]+arr[x-1];
            
            for(int i=0;i<x-1;i++){
                if(arr[i]+arr[i+1]>max){
                    max=arr[i]+arr[i+1];
                }
            }
            
            System.out.println(max);
            
            
        } 
	}
}
