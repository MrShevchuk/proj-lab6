package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Book TheGreatGatsby = new Book();

        TheGreatGatsby.BookName = "The Great Gatsby";
        TheGreatGatsby.Author = "F.Scott Fitzgerald";
        TheGreatGatsby.PublishedYear = "1925";
        TheGreatGatsby.SheetNumber = 174;

        String[] arr = TheGreatGatsby.pageTurning(174);
        System.out.println(Arrays.toString(arr));
    }
}
