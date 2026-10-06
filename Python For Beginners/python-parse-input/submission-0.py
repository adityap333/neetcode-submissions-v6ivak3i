from typing import List

def read_integers() -> List[int]:
    str_numbers = input().split(",")
    int_numbers = []
    for x in str_numbers:
        int_numbers.append(int(x))
    return int_numbers
# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())
