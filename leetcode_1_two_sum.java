import java.util.HashMap;
import java.util.Map;

public class leetcode_1_two_sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }
            prevMap.put(nums[i], i);
        }

        return new int[] {};  // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        le solution = new leetcode_1_two_sum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}


/*Step 1: Initialize a HashMap
Purpose: The HashMap (prevMap) is used to store numbers we've encountered so far and their corresponding indices.
Code:
java
Copy code
Map<Integer, Integer> prevMap = new HashMap<>();
Step 2: Loop Through the Array
Purpose: Iterate through each element in the array to check if its complement (i.e., the number needed to reach the target) has been seen before.
Code:
java
Copy code
for (int i = 0; i < nums.length; i++) {
    int diff = target - nums[i];
    ...
}
Step 3: Calculate the Complement
Purpose: For each number nums[i], calculate the difference (diff) between the target and the current number. This diff is the number needed to reach the target.
Code:
java
Copy code
int diff = target - nums[i];
Step 4: Check If the Complement Exists in the HashMap
Purpose: Check if the complement (diff) is already in prevMap. If it is, it means we've already encountered a number that, when added to nums[i], equals the target.
Code:
java
Copy code
if (prevMap.containsKey(diff)) {
    return new int[] { prevMap.get(diff), i };
}
Step 5: Store the Current Number and Its Index in the HashMap
Purpose: If the complement is not found in prevMap, store the current number nums[i] and its index i in the HashMap for future reference.
Code:
java
Copy code
prevMap.put(nums[i], i);
Step 6: Return the Indices of the Two Numbers
Purpose: When the complement is found, return an array containing the indices of the two numbers that add up to the target.
Code:
java
Copy code
return new int[] { prevMap.get(diff), i };
Step 7: Handle the Case Where No Solution Exists
Purpose: If no pair is found after looping through the entire array, return an empty array.
Code:
java
Copy code
return new int[] {};  // This line is optional depending on your problem constraints
Example Walkthrough:
Let's go through an example with nums = {2, 7, 11, 15} and target = 9.

Initialization: prevMap is empty at the start.
First Iteration (i = 0):
nums[0] = 2
Calculate diff = 9 - 2 = 7
7 is not in prevMap.
Store 2 in prevMap with its index: {2: 0}.
Second Iteration (i = 1):
nums[1] = 7
Calculate diff = 9 - 7 = 2
2 is found in prevMap at index 0.
Return indices [0, 1].
This procedure allows you to efficiently find the two numbers in the array that add up to the target, using a HashMap to track the numbers you've already seen.
*/