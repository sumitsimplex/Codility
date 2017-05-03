def solution(A):
    missing = 0
    N = len(A)
    for i in xrange(0,N):
        missing ^= i+1^A[i]
    if missing == 0:
        return 1
    else:
        return 0

def solution2(A):
    counter = [0] * len(A)
    limit = len(A)
    for element in A:
        if not 1 <= element <= limit:
            return 0
        else:
            if counter[element - 1] != 0:
                return 0
            else:
                counter[element - 1] = 1

    return 1