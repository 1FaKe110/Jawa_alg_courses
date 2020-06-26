package com.company.HW;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //
        //	    Простейшие алгоритмы:
        //	       (не совсем понял суть задания)
        //         Линейный алгоритм Линейный алгоритм - это вид алгоритма, который не содержит условных и циклических операторов.
        //
        //
        //	    Простейшие алгоритмы сортировки:
        //	      *Сортировка слиянием — один из наиболее важных алгоритмов на сегодняшний день. Он базируется на сравнении элементов и использует подход «разделяй и властвуй» для более эффективного решения проблемы, которая когда-то решалась за время O (n^2). Алгоритм был изобретён математиком Джоном фон Нейманом в 1945 году.
        //        *Быстрая сортировка — другой подход к сортировке, чей алгоритм может базироваться как на in-place разделении, так и на «разделяй и властвуй». Проблема этой сортировки заключается в том, что она не является стабильной, но эффективна для сортировки массивов в оперативной памяти.
        //        *Пирамидальная сортировка — in-place алгоритм, использующий приоритетную очередь, за счёт которой уменьшается время поиска данных. Неустойчив.
        //

        int rand_int = (int) (Math.random() * 10) + 1;
        System.out.println("число: " + rand_int);
        getDegree(rand_int);


        int[] list_of_numbers = new int[rand_int];
        int elem;

        for (int i = 0; i < rand_int; i++) {
                                                                            // сложность n
            elem = (int) (Math.random() * 10);
            list_of_numbers[i] = elem;

        }
        System.out.println(Arrays.toString(list_of_numbers));
        getMinimum(list_of_numbers);
    }

    private static void getDegree(int value) {
        if (value % 2 == 0) {
            value *= value;                                         // сложность n
            System.out.println("четная степень равна: " + value);   //
        } else {
            System.out.println("степень не четная");
        }
    }


    private static void getMinimum(int[] Array) {
        int min_value = Array[0];
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {                                    // сложность 2n, так как в условие вложен цикл
            if (Array[i] < min_value) {
                min_value = Array[i];
            }
            sum += Array[i];
        }


        System.out.println("Минимальное значение в функции: " + min_value);
        System.out.println("Среднее арифметическое массива: " + sum / Array.length);
    }
}
