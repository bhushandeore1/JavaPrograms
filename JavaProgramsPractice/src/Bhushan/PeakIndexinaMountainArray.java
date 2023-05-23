package Bhushan;

//
//Input: arr = [0,1,0]
//Output: 1
/*Input: arr = [0,2,1,0]
Output: 1*/
public class PeakIndexinaMountainArray {

	public static void main(String[] args) {
		int []arr= {0,1,2,1,0};
		System.out.println(findpeak(arr));
	}

	private static int findpeak(int[] arr) {
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
