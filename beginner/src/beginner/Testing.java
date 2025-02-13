package beginner;

public class Testing {

	public static String Test(int [][] nums) {
		
		System.out.println(nums[0].length);
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.println(nums[i][j]);				
			}
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		int [][] nums = {{1, 2, 3}, {2, 3, 4}};
		Test(nums);
	}
	
}

