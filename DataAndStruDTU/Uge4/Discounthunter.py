# Author: Charlie Demasi
def insertion_sort(list_a):
    if len(list_a) <= 100000:
        #continue 
        indexing_length = range(1, len(list_a))
        for i in indexing_length:
            value_to_sort = list_a[i]
            if value_to_sort <= 50000:
                while list_a[i-1] < value_to_sort and i>0:
                    list_a[i], list_a[i-1] = list_a[i-1], list_a[i]
                    i = i-1
            else:
                print("pris over 50000")
    else:
        print("over varer 100000")

    return  list_a

#Her er jeg i gang med at teste og se om jeg kan splite min liste om i subliste ad 3 
def discount_hunt(prices_unsorted):


    prices = insertion_sort(prices_unsorted)
    total_discount = 0
    for i in range(2, len(prices), 3):
        total_discount = total_discount + prices[i]
    return total_discount

def discount_hunt2(prices):
    prices.sort(reverse=True)
    return sum(prices[2::3])

print(discount_hunt2([10, 200, 75, 5, 25, 50, 100]))
print(discount_hunt([1, 30]))