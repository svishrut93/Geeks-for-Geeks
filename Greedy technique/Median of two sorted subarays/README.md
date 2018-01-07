<h1>Find median of two sorted arrays of same size</h1>
Objective:  Given two sorted arrays of size n. Write an algo­rithm to find the median of combined <br>
array (merger of both the given arrays, size = 2n).<br> 

This code is for my own learning. 
Credits to http://algorithms.tutorialhorizon.com/find-median-of-two-sorted-arrays-of-same-size/  <br> 

Binary Approach: Compare the medians of both arrays<br>

Say arrays are array1[] and array2[].<br>
Calculate the median of both the arrays, say m1 and m2 for array1[] and array2[].<br>
If m1 == m2 then return m1 or m2 as final result.<br>
If m1 > m2 then median will be present in either of the sub arrays.<br>
Array1[] — from first element to m1.<br>
Array2[] – from m2 to last element.<br>
If m2 > m1 then median will be present in either of the sub arrays.<br>
Array1[] — from m1 to last element.<br>
Array2[] – from first element to m2.<br>
Repeat the steps from 1 to 5 recursively until 2 elements are left in both the arrays.<br>
Then apply the formula to get the median<br>
Median = (max(array1[0],array2[0]) + min(array1[1],array2[1]))/2<br>


