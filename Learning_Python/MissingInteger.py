def solution(A):

    # We only care about the first N+1 positive integers.
    # occurrence[i] is for the integer i+1.
    occurrence = [False] * (len(A) + 1)
    for item in A:
        if 1 <= item <= len(A) + 1:
            occurrence[item-1] = True

    # Find out the missing minimal positive integer.
    for index in xrange(len(A) + 1):
        if occurrence[index] == False:
            return index + 1

    raise Exception("Should never be here.")
    return -1