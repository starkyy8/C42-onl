package Homework_20;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.*;

public class MyMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //useThreads();
        useThreadSort();
    }
    public static void useThreads() throws InterruptedException, ExecutionException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива (целые числа):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        if (size == 0) {
            System.out.println("Массив пуст, нечего искать.");
            return;
        }

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> maxTask = () -> {
            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        };

        Callable<Integer> minTask = () -> {
            int min = array[0];
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        };

        Future<Integer> maxFuture = executor.submit(maxTask);
        Future<Integer> minFuture = executor.submit(minTask);

        int max = maxFuture.get();
        int min = minFuture.get();

        executor.shutdown();

        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }

    public static void useThreadSort() throws InterruptedException, ExecutionException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] original = new int[size];
        System.out.println("Введите элементы массива (целые числа):");
        for (int i = 0; i < size; i++) {
            original[i] = scanner.nextInt();
        }
        scanner.close();

        if (size == 0) {
            System.out.println("Массив пуст, сортировать нечего.");
            return;
        }

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<int[]> insertionTask = () -> {
            int[] copy = Arrays.copyOf(original, original.length);
            insertionSort(copy);
            return copy;
        };

        Callable<int[]> selectionTask = () -> {
            int[] copy = Arrays.copyOf(original, original.length);
            selectionSort(copy);
            return copy;
        };

        Callable<int[]> bubbleTask = () -> {
            int[] copy = Arrays.copyOf(original, original.length);
            bubbleSort(copy);
            return copy;
        };

        Future<int[]> insertionFuture = executor.submit(insertionTask);
        Future<int[]> selectionFuture = executor.submit(selectionTask);
        Future<int[]> bubbleFuture = executor.submit(bubbleTask);

        int[] sortedByInsertion = insertionFuture.get();
        int[] sortedBySelection = selectionFuture.get();
        int[] sortedByBubble = bubbleFuture.get();

        executor.shutdown();

        System.out.println("\nИсходный массив: " + Arrays.toString(original));
        System.out.println("Сортировка вставками: " + Arrays.toString(sortedByInsertion));
        System.out.println("Сортировка выбором:   " + Arrays.toString(sortedBySelection));
        System.out.println("Сортировка пузырьком:  " + Arrays.toString(sortedByBubble));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


