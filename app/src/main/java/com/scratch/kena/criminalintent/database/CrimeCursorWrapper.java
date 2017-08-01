package com.scratch.kena.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.scratch.kena.criminalintent.Crime;
import com.scratch.kena.criminalintent.database.CrimeDbSchema.CrimeTable;

import java.util.Date;
import java.util.UUID;

/**
 * Created by kena on 8/1/17.
 * Taken from Android Programming: the Big Nerd Ranch 3.e
 */

public class CrimeCursorWrapper extends CursorWrapper {

    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeTable.Cols.SOLVED));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setIsSolved(isSolved != 0);

        return crime;
    }
}
