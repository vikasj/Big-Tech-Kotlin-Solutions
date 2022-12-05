/**
 * 121. Best Time to Buy and Sell Stock
 *
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
fun maxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    var maxProfit = 0
    prices.indices.forEach {
        val price = prices[it]
        when {
            price < minPrice -> minPrice = price
            price - minPrice > maxProfit -> maxProfit = price - minPrice
        }
    }
    return maxProfit
}
