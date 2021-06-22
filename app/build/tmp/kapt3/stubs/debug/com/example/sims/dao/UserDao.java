package com.example.sims.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\'J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/sims/dao/UserDao;", "", "deleteAll", "", "getAllByDateDesc", "", "Lcom/example/sims/entity/User;", "getAllStudents", "getStudnet", "user_id", "", "insert", "element", "login", "", "username", "password", "app_debug"})
public abstract interface UserDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.sims.entity.User element);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from user")
    public abstract java.util.List<com.example.sims.entity.User> getAllStudents();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from user where user_id = :user_id")
    public abstract com.example.sims.entity.User getStudnet(@org.jetbrains.annotations.NotNull()
    java.lang.String user_id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from user order by user_id desc ")
    public abstract java.util.List<com.example.sims.entity.User> getAllByDateDesc();
    
    @androidx.room.Query(value = "delete from User")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "select access_level from user where username = :username and password = :password")
    public abstract int login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
}