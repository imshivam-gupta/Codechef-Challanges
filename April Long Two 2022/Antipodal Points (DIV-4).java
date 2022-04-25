/*
You are given a set of N distinct points P1,P2,P3,…,PN on a 2-D plane.

A triplet (i,j,k) is called a holy triplet if

1≤i<j<k≤N
Pi, Pj and Pk are non-collinear and
Any two of the points Pi, Pj and Pk are antipodal points of the circle that passes through all three of them.
Two points on a circle are said to be antipodal points of the circle if they are diametrically opposite to each other.

Find the total number of holy triplets.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first line of each test case contains an integer N - the number of points.
Each of the next N lines contains two space separated integers xi and yi, denoting the co-ordinates of i-th point Pi.
Output Format
For each test case output a single line denoting the number of holy triplets.

Constraints
1≤T≤10
3≤N≤2000
Sum of N over all test cases does not exceed 2000
−109≤xi,yi≤109
All points P1,P2,…,PN in each test case are distinct.
Sample Input 1 
1
4
0 1
0 -1
1 0
-1 0
Sample Output 1 
4
Explanation
Test case 1: The holy triplets in this case are
Holy Triplet(1,2,3)(1,2,4)(1,3,4)(2,3,4)1≤i<j<k≤N✓✓✓✓Non collinear✓✓✓✓Antipodal points1 and 21 and 23 and 43 and 4
*/
