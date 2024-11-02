#to add two strings represent 2 binary number into one binary number

def addBinary(self, a, b):
    first_num = int(a, 2)
    second_num = int(b,2)

    return format(first_num + second_num, "b")