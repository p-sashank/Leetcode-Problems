class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int k = 0;
        for(int i=0;i<nums1.length;i++){
            arr[k] = nums1[i];
            k++;
        }
        for (int j=0;j<nums2.length;j++){
            arr[k] = nums2[j];
            k++;
        }
        Arrays.sort(arr);
        int len = arr.length;
        if (len%2 ==1){

            return arr[len / 2];
        }else{
            return (arr[len/2 -1]+ arr[len/2]) / 2.0;
        }
        
    }
}