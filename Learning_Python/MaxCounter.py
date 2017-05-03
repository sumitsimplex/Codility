def solution_1(N, A):
    M=len(A)
    counters = [0]*N
    max_counter = 0
    for i in xrange(M):
        if A[i] == N+1:
            counters = [max_counter]*N
        elif 1 <= A[i] <= N:
            counters[A[i]-1] +=1
            max_counter = max(max_counter, counters[A[i]-1])
    return counters

def solution_2(N, A):
    M=len(A)
    counters = [0]*N
    max_counter = 0
    for a in A:
        if a == N+1:
            counters = [max(counters)]*N
        elif 1 <= a <= N:
            counters[a-1] +=1
    return counters