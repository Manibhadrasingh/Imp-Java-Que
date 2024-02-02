public class MaxProSubArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, -1, 0};
        int left = 0;
        int right = 1;
        int currSum = arr[left];
        int maxSum = Integer.MIN_VALUE;
        int count[] = new int[arr.length];

        while(right < arr.length){
            currSum = currSum * arr[right];

            if(currSum > maxSum){
                maxSum = currSum;
                right++;
            }
            else{
                count[left] = right;
                right ++;
            }
        }
        System.out.println(maxSum);
        System.out.println(count[left]);
    }
    
}
