class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).toArray();
        Arrays.sort(merged);

        int size = merged.length;
        if (size % 2 == 0) {
            return (merged[size / 2 - 1] + (long) merged[size / 2]) / 2.0;
        } else {
            return merged[size / 2];
        }
    }
}