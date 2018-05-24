package com.kaka.dbflowdemo;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.Database;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

import java.util.UUID;

@Table(database = AppDataBase.class)
public class User {
    @PrimaryKey
    UUID id;

    @Column
    String name;

    @Column
    int age;
}
