def add_two_numbers() -> int:
    num_list = input().split(",")
    result = 0
    for e in num_list:
        result += int(e)
    return result



# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
