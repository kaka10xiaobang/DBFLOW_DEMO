package com.kaka.dbflowdemo;

import com.raizlabs.android.dbflow.annotation.Database;
@Database(name = AppDataBase.NAME,version = AppDataBase.VERSION)
public class AppDataBase {
    public static final String NAME="AppDataBase";
    public static final int VERSION=3;


//    该@Database注释生成一个DatabaseDefinition现在引用名为“AppDatabase.db”的文件中的磁盘上的SQLite数据库。你可以在代码中引用它：
//    DatabaseDefinition db = FlowManager.getDatabase(AppDatabase.class);


}
