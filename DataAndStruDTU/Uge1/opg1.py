#initialize array
def Peak1(A, n):
#A = [2, 1, 3, 7, 3, 11, 1, 5, 7, 10];
#n = len(A);
#print(A);
    if A[0] >= A[1]: 
        return o;
    #print(0);
    for i in range(1, n-2):
        if A[i-1] <= A[i] >= A[i+1]:
            return i;
        #print(i);
    if A[n-2] <= A[n-1]:
        return n-1;
    #print(n-1);
print(Peak1([1, 3, 7, 15, 17, 11, 2, 3, 6, 8, 7, 5, 9, 5, 23], 15))
# 1.2 indekserne for alle toppunkterne: 0, 3, 5,9
# 1.3 toppunkterne er: 2, 7, 11 og 10
