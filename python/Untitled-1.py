def nextSmallerElement(arr, n):
    result = []
    stack = []
    
    # Traverse from right to left
    for i in range(n - 1, -1, -1):
        
        while stack and stack[-1] >= arr[i]:
            stack.pop()
        
        
        if not stack:
            result.append(-1)
        else:
            result.append(stack[-1])
        
        
        stack.append(arr[i])
    
    
    return result[::-1]


n = 5
arr = [4, 2, 1, 5, 3]
print(nextSmallerElement(arr, n)) 

n = 6
arr = [5, 6, 2, 3, 1, 7]
print(nextSmallerElement(arr, n)) 

