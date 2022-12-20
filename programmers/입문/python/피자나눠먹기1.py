def solution(n):
    answer = 0
    if n<=7:
        answer=1
        return answer
    elif n%7==0:
        answer=n/7
        return answer
    else:
        answer=n/7+1
        answer=int(answer)
        return answer
