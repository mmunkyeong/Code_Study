##문제
##상반기 아이스크림 총주문량이 3,000보다 높으면서 아이스크림의 주 성분이 과일인 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요.


select FLAVOR
from FIRST_HALF
where TOTAL_ORDER>3000 and FLAVOR in(select FLAVOR
                                 from ICECREAM_INFO
                                 where INGREDIENT_TYPE="fruit_based")
group by TOTAL_ORDER;

