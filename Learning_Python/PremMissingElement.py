def solution(A):
    missing = 0
    N = len(A)
    for i in xrange(0,N):
        missing ^= i+1^A[i]
    missing^=N+1
    return missing