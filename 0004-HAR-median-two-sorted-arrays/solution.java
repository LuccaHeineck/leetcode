class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // first merge both, then get middle number
        int[] merged = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2))
            .toArray();

        int size = merged.length;

        if (size % 2 == 0) {
            return merged[size / 2];
        } else {
            int mid1 = merged[(size / 2) - 1];
            int mid2 = merged[size / 2];
            return (double) (mid1 + mid2) / 2.0;
        }
    }
}