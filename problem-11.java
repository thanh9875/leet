class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int low = 0;
        int high = height.length - 1;

        while (low < high){
            if (height[low] < height[high]){
                max_area = Math.max(max_area, height[low] * (high - low));
                low++;
            }else{
                max_area = Math.max(max_area, height[high] * (high - low));
                high--;
            }
        }
        return max_area;
    }
}
