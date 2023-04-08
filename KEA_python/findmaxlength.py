names = ['Raul', 'Charlie', 'Peter', 'Carmen']
counts = [len(n) for n in names]
print(counts)

longest_name = None
max_count = 0

for i in range(len(names)):
    count = counts[i]
    if count > max_count:
        longest_name = names[i]
        max_count = count
    
print(longest_name)