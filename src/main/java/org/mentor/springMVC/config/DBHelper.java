package org.mentor.springMVC.config;

import org.hibernate.cfg.Configuration;

public class DBHelper {

    private static DBHelper dbHelper;

    public static DBHelper getDbHelper() {
        if (dbHelper == null) {
            dbHelper = new DBHelper();

        }
        return dbHelper;
    }

    private DBHelper() {

    }

    public Configuration getConfiguration() {
        return DBConfigHibernate.getMySqlConfiguration();
    }
}
