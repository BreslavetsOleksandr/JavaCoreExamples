package ru.geekbrains.qa.java2.lesson2.HW;

public class MyArrayDataException extends Exception {
    public int row;
    public int column;

    public MyArrayDataException(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
