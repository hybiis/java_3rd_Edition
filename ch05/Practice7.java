package ch05;

public class Practice7 {
    public static void main(String args[])
    {

        int money =3170;
        System.out.println("money="+money);
        int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
        for(int i=0;i<coinUnit.length;i++) {
            int coinNum = 0;
            /* (1) . 아래의 로직에 맞게 코드를 작성하시오
            1. (money) (coinNum) . 금액 을 동전단위로 나눠서 필요한 동전의 개수 를 구한다
            2. coin coinNum . 배열 에서 만큼의 동전을 뺀다
            ( coin .) 만일 충분한 동전이 없다면 배열 에 있는 만큼만 뺀다
            3. (coinNum) . 금액에서 동전의 개수 와 동전단위를 곱한 값을 뺀다
            */
            coinNum=money/coinUnit[i];
            if(coinNum>coin[i]){
                coinNum=coin[i];
                coin[i]=0;
            }else{
                coin[i]-=coinNum;
            }
            money-=coinNum*coinUnit[i];
            System.out.println(coinUnit[i]+"원 : "+coinNum);
        }
        if(money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0); // . 프로그램을 종료한다
        }
        System.out.println("=남은 동전의 개수=");
        for(int i=0;i<coinUnit.length;i++) {
            System.out.println(coinUnit[i]+" :"+coin[i]);
        }
    } // main
}

