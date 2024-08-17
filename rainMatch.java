class Solution {
    public int maxArea(int[] height) {
        int max =0;
        int area=0;
        int h=0;
        int i,j;
        for( i=0;i<height.length;i++) {
            for( j=i+1;j<height.length;j++) {
                h=Math.min(height[i],height[j]);
                area=h*(j-i);
                max=Math.max(max,area);
            }
        }
        return max;
    }
}