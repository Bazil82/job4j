package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book one = new Book("Harry Potter", 156);
        Book two = new Book("Green Mile", 345);
        Book three = new Book("Gone with the wind", 543);
        Book four = new Book("Maid", 429);

        Book[] cleanCode = new Book[4];

        cleanCode[0] = one;
        cleanCode[1] = two;
        cleanCode[2] = three;
        cleanCode[3] = four;

        for (int index = 0; index < cleanCode.length; index++) {
            Book thisBook = cleanCode[index];
            System.out.println("Book name:" + thisBook.getName() + ", page count:" + thisBook.getPages());
        }

        System.out.println();

        Book temp = cleanCode[0];
        cleanCode[0] = cleanCode[2];
        cleanCode[2] = temp;

        for (Book thisBook : cleanCode) {
            System.out.println("Book name:" + thisBook.getName() + ", page count:" + thisBook.getPages());
        }
    }

}
