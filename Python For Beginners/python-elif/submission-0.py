def check_range(num: int) -> str:
    if num < 0:
       s = "negative"
    elif num == 0:
        s = "zero"
    elif num > 0 and num < 10:
        s = "positive single digit"
    elif num >= 10:
        s= "positive multi digit"
    return s






  
# don't modify code below this line
print(check_range(-10))
print(check_range(0))
print(check_range(9))
print(check_range(1000))
