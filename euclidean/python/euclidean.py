import sys

def euclidean(a, b):
    while(b != 0):
        a, b = b, a%b
    return a

print(euclidean(int(sys.argv[1]), int(sys.argv[2])))

