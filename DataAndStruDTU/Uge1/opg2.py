def FindMax(A, n):
    max = 0;
    for i in range(0, n-1):
        if(A[i] > A[max]):
            max = i;
    return max;

print(FindMax([1, 3, 7, 15, 17, 11, 2, 3, 6, 8, 7, 5, 9, 5, 23], 15))