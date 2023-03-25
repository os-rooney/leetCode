# Intuition
my initial thoughts would be to consider a brute-force approach using nested loops to compare every pair of numbers in the array. However, this approach would have a time complexity of O(n^2), where n is the size of the array, which is not efficient for large inputs.

To improve the time complexity, I would think of ways to reduce the number of comparisons needed. One approach would be to sort the array and then use two pointers to scan the array from both ends. If the sum of the numbers at the two pointers is greater than the target, we move the right pointer one step to the left. If the sum is less than the target, we move the left pointer one step to the right. This approach has a time complexity of O(n log n) due to the sorting operation.

Another approach that would have a time complexity of O(n) would be to use a hash table to store the numbers encountered so far in the array. For each number in the array, we check if its complement (i.e., the number that would sum up to the target with this number) is already present in the hash table. If the complement is present, we return the indices of the two numbers that add up to the target. If not, we add the current number to the hash table and continue iterating through the array.

# Approach
The approach used in this solution is to use a HashMap to keep track of the numbers encountered so far in the input array. For each number in the array, we calculate its complement (i.e., the number that would sum up to the target with this number) and check if the complement is already present in the HashMap. If the complement is present, we return the indices of the two numbers that add up to the target. Otherwise, we add the current number to the HashMap and continue iterating through the array.

By using a HashMap, we can lookup the complement of a number in constant time. Therefore, the time complexity of this solution is O(n), where n is the size of the input array. Additionally, we only use extra space to store the numbers and their indices in the HashMap, so the space complexity is also O(n).

# Complexity
- Time complexity: O(n)

- Space complexity: O(n)

# Code
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;    
    }
}
```
