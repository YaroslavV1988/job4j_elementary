package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k) {
        int h = p / (2*(k+1));
        int l = h * k;
        int s= l * h;
        double rsl = -1;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result1);
    }
}
