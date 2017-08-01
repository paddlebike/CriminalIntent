package com.scratch.kena.criminalintent.database;

/**
 * Created by kena on 8/1/17.
 * Taken from Android Programming: the Big Nerd Ranch 3.e
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID   = "uuid";
            public static final String TITLE  = "title";
            public static final String DATE   = "date";
            public static final String SOLVED = "solved";
        }
    }
}
