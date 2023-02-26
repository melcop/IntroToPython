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
def discount_hunt(list_b):

    list_c = insertion_sort(list_b)
    #lengc = len(list_c)
    #chunks(list_c, lengc) 
    chunks= [list_c[x:x+3] for x in range(0, len(list_c), 100)]
    return chunks

#def chunks(lst, n):
#    """Yield successive n-sized chunks from lst."""
#    for i in range(0, len(lst), n):
#        yield lst[i:i + n]
    
#print(insertion_sort([10, 200, 75, 5, 25, 50, 100]))
print(discount_hunt([10, 200, 75, 5, 25, 50, 100]))