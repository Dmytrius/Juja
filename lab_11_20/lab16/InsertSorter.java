package lab_11_20.lab16;
// Created by boykodm on 18.02.16.14:00
/*
Такая версия алгоритм сортировки вставками

public class InsertionSorter {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }
}
реализована не оптимально, так как внутренний цикл while
- ищет позицию для вставки, перебирая последовательно элементы, при этом он
- поэлементно "смещает" массив.

В целях оптимизации перепишите алгоритм:
1. Ищите позицию для вставки элемента бинарным поиском (Arrays.binarySearch(...)).
2. Найдя позицию - смещайте всю часть массива за один вызов (System.arraycopy(...)).
В моих экспериментах эти две оптимизации ускорили сортировку в 2.2-2.6 раза.
 */
public class InsertSorter {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            int counterShift = 0;

            while (location >= 0 && arr[location] > newElement) {
                counterShift++;
                location--;
            }

            int srcPos = location + 1;

            System.arraycopy(arr, srcPos, arr, srcPos + 1, counterShift);
            arr[srcPos] = newElement;
        }
    }
}