<h1> Longest common subsequence </h2> 
LCS Problem Statement: Given two sequences, find the length of longest subsequence present in both of them. A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”. So a string of length n has 2^n different possible subsequences.

I have used dynamic programming to solve this..

the idea behind this is simple. 


Lets say we have 2 strings given : 

ACXGBT  and AZGCNT as the two strings to compare. 
