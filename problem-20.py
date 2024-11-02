#to return the validity of an array of parentheses

class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []

        open = ["(", "[", "{"]
        closed = [")", "]", "}"]

        for char in s:
            if char in open:
                stack.append(char)
            if char in closed:
                index = closed.index(char)
                if len(stack) == 0:
                    return False
                else:
                    if stack[-1] == open[index]:
                        stack.pop()
                    else:
                        return False

        return len(stack) == 0