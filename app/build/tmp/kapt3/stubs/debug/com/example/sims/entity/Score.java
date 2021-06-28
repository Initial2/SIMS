package com.example.sims.entity;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"student_id", "course"}, tableName = "score")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ.\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/example/sims/entity/Score;", "", "student_id", "", "course", "", "score", "(ILjava/lang/String;Ljava/lang/Integer;)V", "getCourse", "()Ljava/lang/String;", "setCourse", "(Ljava/lang/String;)V", "getScore", "()Ljava/lang/Integer;", "setScore", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStudent_id", "()I", "setStudent_id", "(I)V", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Integer;)Lcom/example/sims/entity/Score;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Score {
    private int student_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String course;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "score")
    private java.lang.Integer score;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.sims.entity.Score copy(@androidx.annotation.NonNull()
    int student_id, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String course, @org.jetbrains.annotations.Nullable()
    java.lang.Integer score) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public Score(@androidx.annotation.NonNull()
    int student_id, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String course, @org.jetbrains.annotations.Nullable()
    java.lang.Integer score) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getStudent_id() {
        return 0;
    }
    
    public final void setStudent_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCourse() {
        return null;
    }
    
    public final void setCourse(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getScore() {
        return null;
    }
    
    public final void setScore(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}