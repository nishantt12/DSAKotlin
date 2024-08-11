
object MinSubArrayLength {

    fun minSubArrayLength(target: Int, nums: IntArray): Int {

        var left = 0;
        var currentSum = 0
        var min = Int.MAX_VALUE

        for (i in 0..nums.size-1){
            currentSum+=nums[i]
            while (currentSum>=target){
                min = minOf(i-left+1,min)
                currentSum-=nums[left]
                left++
            }
        }

        return if (min == Int.MAX_VALUE) 0 else min
    }

}