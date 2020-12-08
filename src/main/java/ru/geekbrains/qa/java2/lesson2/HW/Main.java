package ru.geekbrains.qa.java2.lesson2.HW;

public class Main {
    public static void main(String[] args) {

        try {
            // Верный формат данных
            sumNumsFromArray(new String[][]{
                    {"0", "1", "2", "3"},
                    {"5", "7", "4", "5"},
                    {"0", "1", "2", "3"},
                    {"0", "5", "7", "9"}
            });

            // Неверный формат данных: MyArrayDataException
            sumNumsFromArray(new String[][]{
                    {"0", "cat", "2", "3"},
                    {"5", "7", "4", "5"},
                    {"0", "1", "2", "3"},
                    {"0", "5", "7", "9"}
            });

            // Неверный размер массива
            sumNumsFromArray(new String[][]{
                    {"5", "7", "4", "5"},
                    {"0", "1", "2", "3"},
                    {"0", "5", "7", "9"}
            });

        } catch (MyArraySizeException e) {
            System.out.println("Неверный размер массива!");
        } catch (MyArrayDataException e) {
            System.out.printf("Неверный формат данных в массиве! Номер строки: %d, номер колонки: %d \r\n", e.row, e.column);
        }

    }

    public static void sumNumsFromArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int rows = array.length;
        int columns = array[0].length;
        System.out.printf("rows: %d, columns: %d \r\n", rows, columns);
        if (rows != 4 || columns != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    int num = Integer.parseInt(array[i][j]);
                    sum = sum + num;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.printf("sum = %d \r\n", sum);
    }
}
