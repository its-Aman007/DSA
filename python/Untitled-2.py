def nextGreaterElement(arr,n):
    stack=[]
    nge=[-1]*n


    for i in range(n-1,-1,-1):
        while stack and stack[-1]<=arr[i]:
            stack.pop()

        if stack:
            nge[i]=stack[-1]

        stack.append(arr[i])
    return nge


arr1 = [1, 3, 2, 4]
n1 = len(arr1)
print(nextGreaterElement(arr1, n1))

arr2=[6,8,0,1,3]
n2=len(arr2)
print(nextGreaterElement(arr2,n2))

arr3=[10,20,30,50]
n3=len(arr3)
print(nextGreaterElement(arr3,n3))
arr4=[50,40,30,10]
n4=len(arr4)
print(nextGreaterElement(arr4,n4))


         