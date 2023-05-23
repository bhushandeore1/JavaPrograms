package Bhushan;

//Input: array = [1,2,3,4,5,3,1], target = 3
//Output: 2
//Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
public class FindinMountainArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,3,1};
		int target=3;
		System.out.println(find(arr,target));
	}

	private static int find(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		
		return start;
		
	}

}
