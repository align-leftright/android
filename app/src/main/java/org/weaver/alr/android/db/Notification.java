package org.weaver.alr.android.db;

import android.provider.BaseColumns;

/**
 * Created by sec on 2016-06-22.
 */
public final class Notification {
    public Notification() {}

    public static abstract class Entry implements BaseColumns {
        public static final String TABLE_NAMES = "ELB, EC2, RDS, REPORT";
        public static final String TABLE_ELB = "ELB";
        public static final String TABLE_EC2 = "EC2";
        public static final String TABLE_RDS = "RDS";
        public static final String TABLE_REPORT = "REPORT";

        public static final String COLUMN_NAME_ID = "notiID";
        public static final String COLUMN_NAME_NOTIFICATION = "notiText";
    }
}