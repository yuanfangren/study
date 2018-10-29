/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

	你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
	
	示例:
	
	给定 nums = [2, 7, 11, 15], target = 9
	
	因为 nums[0] + nums[1] = 2 + 7 = 9
	所以返回 [0, 1]
 */
package com.ren.leetcode.algorithm;

import java.util.HashMap;

/**
 * 两数之和
 * @author RYF
 *
 */
public class TwoSum {
	
	/**
	 * 找到两数之和为目标值的索引数组
	 * @param nums 要寻找的数组
	 * @param target 目标值
	 * @return 返回int数组
	 */
	public static int[] twoSum(int[] nums ,int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					return new int[]{i,j};
				}
			}
		}
		throw new IllegalArgumentException("没有找到数据");
	}
	
	public static int[] twoSum2(int[] nums,int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++) {
			 int temp = target - nums[i];
			 if(map.containsKey(temp) && map.get(temp) != i) {
				 return new int[] {i,map.get(temp)};
			 }
		}
		throw new IllegalArgumentException("没有找到数据");
	}
	
	public static int[] twoSum3(int[] nums,int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int temp = target - nums[i];
			if(map.containsKey(temp) && map.get(temp) != i) {
				return new int[] {map.get(temp),i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("没有找到数据");
	}
	
	public static void main(String[] args) {
		//int[] nums = {2, 7, 11, 15};
		//int target = 9;
		int[] nums = {1,3,2,3};
		int target = 6;
		int[] result = twoSum2(nums,target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
	
}
