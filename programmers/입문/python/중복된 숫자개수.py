def solution(array, n):
    answer = 0
    num=0

    for i in array:
        if n==i:
            num+=1
    print("%d이 %d개 있습니다."%(n,num))
    return num
