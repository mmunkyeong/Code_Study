import java.lang.Math;
class Solution {
    public int solution(int price) {
        double sale=0;
        
        if(price>=100000&& price <300000){
            sale=0.05;
        }
        else if (price>=300000&& price <500000){
            sale=0.1;
        }
        else if (price>=500000 && price<=1000000){
            sale=0.2; 
        }
        
        sale=price*sale;
        price=(int)((double)price-sale);
        System.out.println(price);
        return price;
    }
}
