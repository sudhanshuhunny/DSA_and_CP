import java.util.ArrayList;
import java.util.*;
public class Solution {
    /*
    1920. Build Array from Permutation
    Easy

    734

    95

    Add to List

    Share
    Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

    A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).



    Example 1:

    Input: nums = [0,2,1,5,3,4]
    Output: [0,1,2,4,5,3]
    Explanation: The array ans is built as follows:
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
        = [0,1,2,4,5,3]
    Example 2:

    Input: nums = [5,0,1,2,3,4]
    Output: [4,5,0,1,2,3]
    Explanation: The array ans is built as follows:
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
        = [4,5,0,1,2,3]


    Constraints:

    1 <= nums.length <= 1000
    0 <= nums[i] < nums.length
    The elements in nums are distinct.


    Follow-up: Can you solve it without using an extra space (i.e., O(1) memory)?
     */
    public int[] buildArray(int[] nums) {

        int size = nums.length;
        int[] ans = new int[size];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    /*
    1929. Concatenation of Array
    Easy

    585

    145

    Add to List

    Share
    Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

    Specifically, ans is the concatenation of two nums arrays.

    Return the array ans.



    Example 1:

    Input: nums = [1,2,1]
    Output: [1,2,1,1,2,1]
    Explanation: The array ans is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
    - ans = [1,2,1,1,2,1]
    Example 2:

    Input: nums = [1,3,2,1]
    Output: [1,3,2,1,1,3,2,1]
    Explanation: The array ans is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
    - ans = [1,3,2,1,1,3,2,1]


    Constraints:

    n == nums.length
    1 <= n <= 1000
    1 <= nums[i] <= 1000
     */
    public int[] getConcatenation(int[] nums) {
        int size = nums.length * 2;
        int[] ans = new int[size];
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[k] = nums[i];
            k++;
        }
        return ans;
    }

    /*/
1365. How Many Numbers Are Smaller Than the Current Number
Easy

2581

53

Add to List

Share
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.



Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
Example 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]
Example 3:

Input: nums = [7,7,7,7]
Output: [0,0,0,0]



 */

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) { // All numbers smaller that particular number
                    count++;
                }

            }
            ans[i] = count;
        }
        return ans;
    }

/*
1470. Shuffle the Array
Easy

1886

160

Add to List

Share
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].



Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
Example 3:

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]


Constraints:

1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3


 */


    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int k = 0;
        for (int i = 0; i < n; i++) {
            ans[k] = nums[i];
            k += 2;
        }
        int m = 1;
        for (int j = n; j < nums.length; j++) {
            ans[m] = nums[j];
            m += 2;
        }
        return ans;
    }
/*
1480. Running Sum of 1d Array
Easy

2129

168

Add to List

Share
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.



Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */


    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;

        }
        return ans;
    }

    /*
    1512. Number of Good Pairs
    Easy

    1950

    127

    Add to List

    Share
    Given an array of integers nums, return the number of good pairs.

    A pair (i, j) is called good if nums[i] == nums[j] and i < j.



    Example 1:

    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
    Example 2:

    Input: nums = [1,1,1,1]
    Output: 6
    Explanation: Each pair in the array are good.
    Example 3:

    Input: nums = [1,2,3]
    Output: 0


    Constraints:

    1 <= nums.length <= 100
    1 <= nums[i] <= 100
     */
    public int numIdenticalPairs(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }

/*
1672. Richest Customer Wealth
Easy

991

137

Add to List

Share
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.



Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
Example 3:

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17


Constraints:

m == accounts.length
n == accounts[i].length
1 <= m, n <= 50
1 <= accounts[i][j] <= 100
 */

    public int maximumWealth(int[][] accounts) {

        int[] ar = new int[accounts.length];
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            ar[row] = sum;
        }
        int max = ar[0];
        for (int n : ar) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

/*
1431. Kids With the Greatest Number of Candies
Easy

1260

241

Add to List

Share
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.



Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false]
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]


Constraints:

n == candies.length
2 <= n <= 100
1 <= candies[i] <= 100
1 <= extraCandies <= 50
 */

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        ArrayList<Boolean> Ar = new ArrayList<Boolean>();
        for (int n : candies) {
            if (n > max) {
                max = n;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int credits = candies[i] + extraCandies;
            if (credits >= max) {
                Ar.add(true);
            } else {
                Ar.add(false);
            }
        }
        return(Ar);
    }
/*
1. Two Sum
Easy

27543

879

Add to List

Share
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public int[] twoSum(int[] nums, int target) {

    int[] ans=new int[2];
    int k=0;
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                ans[k]=i;
                ans[k+1]=j;

            }

        }
    }
    return ans;
}
/*
1732. Find the Highest Altitude
Easy

625

63

Add to List

Share
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.



Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.


Constraints:

n == gain.length
1 <= n <= 100
-100 <= gain[i] <= 100
 */
public int largestAltitude(int[] gain) {
    int size=gain.length+1;
    int[] ans=new int[size];
    ans[0]=0;
    for(int i=0;i<gain.length;i++){
        ans[i+1]=ans[i]+gain[i];
    }
    int max=0;
    for(int j:ans){
        if(j>max)
            max=j;
    }
    return max;
}
/*
1295. Find Numbers with Even Number of Digits
Easy

1006

93

Add to List

Share
Given an array nums of integers, return how many of them contain an even number of digits.



Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.


Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105
 */
public int findNumbers(int[] nums) {

    int digit=0;
    for(int i:nums){
        int count=0;
        while(i>0){
            int temp=i%10;
            count++;
            i=i/10;
        }
        if(count%2==0){
            digit++;
        }
    }
    return digit;
}
/*
34. Find First and Last Position of Element in Sorted Array
Medium

8550

263

Add to List

Share
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 */
public int[] searchRange(int[] nums, int target) {
    int size=nums.length;
    int mid=(size+1)/2;
    int start=0;
    int end=size;
    int [] ans=new int[2];
    if(target>=nums[mid]){

        if(mid!=start){
            if(nums[mid]==target){
                start=mid;
                ans[0]=start;
            }
            else{
               ans[0]=0;
            }}
        else{
            if(nums[mid]==target){
                end=mid;
                ans[1]=end;
            }
            else{
                ans[1]=-1;
            }
        }
        mid++;

    }
    else{
        start=0;
       // if(nums)
    }
    return ans;
}
/*
66. Plus One
Easy

3375

3834

Add to List

Share
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */
public int[] plusOne(int[] digits) {
    int size=digits.length;
    for(int i=size-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;

    }
    int[] ans=new int[size+1];
    ans[0]=1;
    return ans;

}
/*
2011. Final Value of Variable After Performing Operations
Easy

275

62

Add to List

Share
There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.



Example 1:

Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
Example 2:

Input: operations = ["++X","++X","X++"]
Output: 3
Explanation: The operations are performed as follows:
Initially, X = 0.
++X: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
X++: X is incremented by 1, X = 2 + 1 = 3.
Example 3:

Input: operations = ["X++","++X","--X","X--"]
Output: 0
Explanation: The operations are performed as follows:
Initially, X = 0.
X++: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
--X: X is decremented by 1, X = 2 - 1 = 1.
X--: X is decremented by 1, X = 1 - 1 = 0.


Constraints:

1 <= operations.length <= 100
operations[i] will be either "++X", "X++", "--X", or "X--".
Accepted
53,703
Submissions

 */


    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for(int i=0;i<operations.length;i++) {
            if(operations[i].charAt(1)=='+') sum++;
            else sum--;
        }
        return sum;
    }

/*
867. Transpose Matrix
Easy

972

366

Add to List

Share
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.





Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109
 */
public int[][] transpose(int[][] matrix) {
    int size = matrix.length;
    int row_size = matrix[0].length;
    int[][] transpose_matrix = new int[row_size][size];
    for (int j = 0; j < row_size; j++)
        for (int i = 0; i < size; i++)
            transpose_matrix[j][i] = matrix[i][j];
    return transpose_matrix;

}
/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.



Example 1:


Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:


Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]


Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
-1000 <= mat[i][j] <= 1000
1 <= r, c <= 300
 */
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int row = mat.length, col = mat[0].length;
        if (r*c != row*col)
            return mat;
        int[][] ans = new int[r][c];
        for (int i=0;i<r*c;i++)
            ans[i/c][i%c] = mat[i/col][i%col];
        return ans;

    }

/*
41. First Missing Positive
Hard

8046

1209

Add to List

Share
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
 */
public int firstMissingPositive(int[] nums) {
    int size= nums.length;

    for (int i = 0; i < size; i++) {
        if (nums[i] <= 0 || nums[i] > size) {
            nums[i] = size + 1;
        }
    }

    for (int i = 0; i < size; i++) {
        int x = Math.abs(nums[i]);
        if (x > size) {
            continue;
        }
        x--;
        if (nums[x] > 0)
        {
            nums[x] = -1 * nums[x];
        }
    }

    for (int i = 0; i < size; i++) {
        if (nums[i] >= 0) {
            return i + 1;
        }
    }
    return size + 1;
}

/*
26. Remove Duplicates from Sorted Array
Easy

5448

8903

Add to List

Share
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


Constraints:

0 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
 */

    public int removeDuplicates(int[] nums) {
        int ans = 0;
        for (int number : nums)
            if (ans == 0 || number > nums[ans-1])
                nums[ans++] = number;
        return ans;
    }
/*34. Find First and Last Position of Element in Sorted Array
    Medium

8610

        264

    Add to List

            Share
    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

    If target is not found in the array, return [-1, -1].

    You must write an algorithm with O(log n) runtime complexity.



    Example 1:

    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    Example 2:

    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]
    Example 3:

    Input: nums = [], target = 0
    Output: [-1,-1]


    Constraints:

            0 <= nums.length <= 105
            -109 <= nums[i] <= 109
    nums is a non-decreasing array.
*/
   /*     int size=nums.length;
        int mid=(size+1)/2;
        int start=0;
        int end=size;
        int [] ans=int[2]
        if(target>=nums[mid]){

            if(mid!=start){
            if(nums[mid]==target){
                start=mid;
                ans[0]=start;
            }
            else{
                ans[0]
            }}
            else{
                if(nums[mid]==target){
                    end=mid;
                    ans[1]=end;
                }
                else{
                    ans[1]=-1;
                }
            }
            mid++;

        }
        else{
           start=0;
           if(nums)
        }
    }*/
public int[] searchRangei(int[] nums, int target) {

    int[] ans = new int[2];
    ans[0] = findFirst(nums, target);
    ans[1] = findLast(nums, target);
    return ans;
}
private int findFirst(int[] nums, int target){
    int i = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] >= target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
        if(nums[mid] == target) i = mid;
    }
    return i;
}
    private int findLast(int[] nums, int target){
        int i = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) i = mid;
        }
        return i;
    }
/*
121. Best Time to Buy and Sell Stock
Easy

12949

457

Add to List

Share
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104
 */

    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int max=0;
        int min=prices[0];
        for(int i=0 ;i<prices.length;i++){

            if(prices[i]>min){
                max=Math.max(max,prices[i]-min);
            }
            else{
                min=prices[i];
            }
        }
        return max;
    }
    /*
    53. Maximum Subarray
Easy

17355

818

Add to List

Share
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104


Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
     */

        public int maxSubArray(int[] nums) {
            int max=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                max=Math.max(max,sum);
                if(sum<0){
                    sum=0;
                }
            }
            return max;
        }
/*
67. Add Binary
Easy

4315

483

Add to List

Share
Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            ans.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) ans.append(carry);
        return ans.reverse().toString();
    }
}

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.


Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 */

    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int i = 0;
        while( i <= end ) {
            if( nums[i] == 0 )
                swapy(nums, start++, i++);
            else if( nums[i] == 2)
                swapy(nums, end--, i);
            else
                i++;
        }
    }

    public void swapy(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.



Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.


Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105
 */

    public boolean canJump(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(i>ans) {return false;}
            ans = Math.max(nums[i]+i,ans);
        }
        return true;
    }

/*
189. Rotate Array
Medium

7337

1143

Add to List

Share
Given an array, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105


Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 */
public void rotate(int[] nums, int k) {

    if(nums == null || nums.length < 2){
        return;
    }

    k = k % nums.length;
    swap(nums, 0, nums.length - k - 1);
    swap(nums, nums.length - k, nums.length - 1);
    swap(nums, 0, nums.length - 1);

}

    private void swap(int[] nums, int i, int j){
        int temp = 0;
        while(i < j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.



Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.


Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 400
 */
public int rob(int[] nums) {
    if(nums.length==0)
    {
        return 0;
    }
    if(nums.length==1)
    {
        return nums[0];
    }
    int[] ans = new int[nums.length];
    ans[0]=nums[0];
    ans[1] = Math.max(nums[0], nums[1]);
    for(int i=2;i<nums.length;i++){
        ans[i] = Math.max(nums[i]+ans[i-2], ans[i-1]);
    }
    return ans[nums.length-1];
}
/*
238. Product of Array Except Self
Medium

10613

667

Add to List

Share
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.


Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */
public int[] productExceptSelf(int[] nums) {
    int size = nums.length;
    int[] ans = new int[size];
    ans[0] = 1;
    for (int i = 1; i < size; i++) {
        ans[i] = ans[i - 1] * nums[i - 1];
    }
    int right = 1;
    for (int i = size - 1; i >= 0; i--) {
        ans[i] *= right;
        right *= nums[i];
    }
    return ans;
}
    public int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        for (int[] row : image)
            for (int i = 0; i * 2 < size; i++)
                if (row[i] == row[size - i - 1])
                    row[i] = row[size - i - 1] ^= 1;
        return image;
    }
    public void setZeroes(int[][] matrix) {
        int x = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0)
                x = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (x == 0)
                matrix[i][0] = 0;
        }
    }

    public boolean isGoodArray(int[] nums) {
        int x = nums[0], y;
        for (int a: nums) {
            while (a > 0) {
                y = x % a;
                x = a;
                a = y;
            }
        }
        return x == 1;
    }
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i)
            ans[i] = i * 2 - n + 1;
        return ans;
    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans =new ArrayList<>();

        for(int i=num.length-1;i>=0;i--){
            int x=num[i];
            int sum=x+k;
            int rem=sum%10;
            ans.add(0,rem);
            k=sum/10;
        }

        while(k>0){
            ans.add(0,k%10);
            k/=10;
        }
        return ans;

    }
    public int maximumPopulation(int[][] logs) {
        int[] ans = new int[101];
        for(int[] n : logs){
            for(int i = n[0]; i < n[1]; i++){
                ans[i - 1950]++;
            }
        }
        int max = 0;
        int year = -1;
        for(int i = 0; i < 101; i++){
            if(ans[i] > max){
                max = ans[i];
                year = i + 1950;
            }
        }
        return year;
    }
}