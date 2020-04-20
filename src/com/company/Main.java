package com.company;

import java.util.Arrays;
import static com.company.Book.generateChaptersBySheets;

public class Main {

    public static void main(String[] args) {

        Book TheGreatGatsby = new Book();
        TheGreatGatsby.setArr(TheGreatGatsby.pageTurning(174));
        System.out.println(Arrays.toString(TheGreatGatsby.getChapters()));
        String[][] result = generateChaptersBySheets(TheGreatGatsby.getArr(), 9);
        System.out.println("Книга разбита на главы");

        TheGreatGatsby.BookName = "The Great Gatsby";
        TheGreatGatsby.Author = "F.Scott Fitzgerald";
        TheGreatGatsby.PublishedYear = "1925";
        TheGreatGatsby.SheetNumber = 174;
    }
}
