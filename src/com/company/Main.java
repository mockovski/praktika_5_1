package com.company;
//1.ТРЕУГОЛЬНАЯ ПОСЛЕДОВАТЕЛЬНОСТЬ (число n повторяется n раз)
public class Main {
    public static String recursion(int n)
    {
        int sum = 0;
        int j = 0;
        // Базовый случай
        if (n == 1)
        {
            System.out.print("1");
        }
        else
        {
            for (int i = 1; sum < n; i++)
            {
                sum += i;
                j = i;
            }
            // Шаг рекурсии
            System.out.print(recursion(--n) + " " + j);
        }
        return "";
    }
    public static void main(String[] args)
    {
        recursion(10); // вызов рекурсивной функции
    }
}