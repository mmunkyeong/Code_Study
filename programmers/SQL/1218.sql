SELECT a.CATEGORY, SUM(b.SALES) AS TOTAL_SALES
FROM BOOK a  join BOOK_SALES b on a.BOOK_ID=b.BOOK_ID
WHERE  DATE_FORMAT(b.SALES_DATE, '%Y-%m') = '2022-01'
GROUP BY a.CATEGORY
ORDER BY 1;
