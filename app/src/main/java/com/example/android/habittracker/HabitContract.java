package com.example.android.habittracker;

import android.provider.BaseColumns;

/**
 * Created by XY on 3.6.2017.
 */

public final class HabitContract {

    private HabitContract() {}

    public  static final class HabitEntry implements BaseColumns {

        public final static String TABLE_NAME = "habits";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_HABIT_NAME = "name";
        public final static String COLUMN_HABIT_DESCRIPTION = "description";
        public final static String COLUMN_HABIT_FREQUENTCY_PER_DAY = "frequency_per_day";
    }
}