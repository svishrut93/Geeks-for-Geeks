<h1> Longest common subsequence </h2> 
LCS Problem Statement: Given two sequences, find the length of longest subsequence present in both of them. A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”. So a string of length n has 2^n different possible subsequences.<br>

I have used dynamic programming to solve this problem <br> 
Refer file LongestCommonSubsequence.java<br><br>

Output 
Enter first string : <br>
AGGTAB<br>
Enter second string : <br>
GXTXAYB<br>
<br>
0	0	0	0	0	0	0	0	<br>
0	0	0	0	0	1	1	1	<br>
0	1	1	1	1	1	1	1	<br>
0	1	1	1	1	1	1	1	<br>
0	1	1	2	2	2	2	2	<br>
0	1	1	2	2	3	3	3	<br>
0	1	1	2	2	3	3	4	<br>
<br>
 Length of longest common subsequence  = 4<br>


