import sys

dennevar = 0
list = ["hund", "kat", "hund", "combo"]
detup = {dennevar:list}
size = list
print(sys.getsizeof(detup))
print(sys.getsizeof(size))