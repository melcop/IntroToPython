def discount_hunt2(prices):
    prices.sort(reverse=True)
    return sum(prices[2::3])

print(discount_hunt2(prices=input()))