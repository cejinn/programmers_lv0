//직각삼각형 출력하기

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int ch=0; ch<n; ch++) {
            for(int kan=0; kan<=ch; kan++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
