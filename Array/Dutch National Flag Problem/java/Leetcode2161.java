class Leetcode2161 {
    public static int[] pivotArray(int[] nums, int pivot) {
        int left = 0, right = nums.length-1, mid = 0;
        while (mid <= right) {
            if(nums[mid] < pivot){
                System.out.println("=========================================");
                System.out.println("Before Swapping (mid < pivot)");
                for (int i : nums) {
                    System.out.print(i+" ");
                }
                System.out.println();
                
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                
                System.out.println("After Swapping");
                for (int i : nums) {
                    System.out.print(i+" ");
                }
                System.out.println();
                left++;
                mid++;
            }
            else if(nums[mid] == pivot) {
                mid++;
            }
            else {
                System.out.println("=========================================");
                System.out.println("Before Swapping (mid > pivot)");
                for (int i : nums) {
                    System.out.print(i+" ");
                }
                System.out.println();
                
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;

                System.out.println("After Swapping");
                for (int i : nums) {
                    System.out.print(i+" ");
                }
                right--;
                System.out.println("---- mid: "+mid+"\tright: "+right);
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,12,5,10,14,3,10};
        pivotArray(nums, 10);
        System.out.print("[");
        for (int i : nums) {
            System.out.print(i);
            if (i != nums[nums.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}