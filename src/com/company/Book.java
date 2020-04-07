package com.company;

import java.util.Arrays;

public class Book {

    public String BookName;
    public String Author;
    public String PublishedYear;
    public int SheetNumber;

        public String[] pageTurning ( int count){
            String[] page = new String[count];
            for (int i = 0; i < count; i++) {
                page[i] = (i + 1) + " стр.";
            }
            return page;
        }
    }

