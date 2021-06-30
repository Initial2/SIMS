package com.example.sims.entity;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"student_id", "course"}, tableName = "score")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/example/sims/entity/Score;", "", "student_id", "", "course", "score", "(IILjava/lang/Integer;)V", "getCourse", "()I", "setCourse", "(I)V", "getScore", "()Ljava/lang/Integer;", "setScore", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStudent_id", "setStudent_id", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lcom/example/sims/entity/Score;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Score {
    private int student_id;
    private int course;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "score")
    private java.lang.Integer score;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.sims.entity.Score copy(@androidx.annotation.NonNull()
    int student_id, @androidx.annotation.NonNull()
    int course, @org.jetbrains.annotations.Nullable()
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
    int student_id, @androidx.annotation.NonNull()
    int course, @org.jetbrains.annotations.Nullable()
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
    
    public final int component2() {
        return 0;
    }
    
    public final int getCourse() {
        return 0;
    }
    
    public final void setCourse(int p0) {
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