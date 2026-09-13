function maxSubArray(nums: number[]): number {
    let currentSum: number = nums[0];
    let maxSum: number = nums[0];

    nums.forEach((num, i) => {
        if (i === 0) return;

        if (num > currentSum + num) {
            currentSum = num;
        } else {
            currentSum += num;
        }

        if (currentSum > maxSum) {
            maxSum = currentSum;
        }
    })

    return maxSum;
};