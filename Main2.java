public class Main2 {
    public static void main(String[] args){
        for (int dan =2; dan<=9; dan++)/*2단부터 9단까지 1씩 증가하며 출력*/{
            System.out.println("==="+dan+"단===");//=== + 2~9단 + === 형식으로 1씩 증가 반복 출력
            for (int i=1; i<=9; i++)/*1에서 9까지 1씩 증가 출력*/{
                System.out.println(dan + "x"+i+"="+(dan*i));//dan(2-9단) + x(곱하기 기호) + i(1-9까지) + = + (단에 i씩 곱하기) 출력
            }
            System.out.println(); // 내용 출력,줄바꿈
        }
    }
}