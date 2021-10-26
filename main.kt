fun main() {
    val nums = readLine()!!.toString()
    var firstSum = 0;
    var secondSum = 0;
    for (i in 0..nums.length / 2 - 1) {
        firstSum += nums[i].digitToInt()
    }
    for (i in nums.length/2..nums.length-1) {
        secondSum += nums[i].digitToInt()
    }  
    if (firstSum == secondSum) println("YES") else println("NO") 
}
