package task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i = 0;
            try {
                i = Integer.valueOf(br.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("Ошибка ввода");
                continue;
            }
            if (i<=0) {
                System.out.println("Значение меньше нуля");
                continue;
            }
            BigInteger answer = BigInteger.valueOf(1);
            for (int j = 1; j <= i; j++) {
                answer = answer.multiply(BigInteger.valueOf(j));

            }
            System.out.println(answer);

        }
    }

}
