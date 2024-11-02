#to return all possible subset of the set nums

def subset(nums):

    solution = []

    index = 0

    tracking = []

    for i in range(2**len(nums)):
        tracking.append(bin(index)[2:])
        while len(tracking[i]) < len(nums):
            tracking[i] = "0" + tracking[i]
        index += 1

    for i in range(len(tracking)):
        num = []
        for j in range(len(tracking[i])):
            if tracking[i][j] == "1":
                num.append(nums[j])
            
        solution.append(num)

    return solution
