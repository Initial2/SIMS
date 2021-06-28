package com.example.sims.teacher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006)"}, d2 = {"Lcom/example/sims/teacher/ModifyScoreActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "inflate", "Lcom/example/sims/databinding/ActivityModifyScoreBinding;", "getInflate", "()Lcom/example/sims/databinding/ActivityModifyScoreBinding;", "setInflate", "(Lcom/example/sims/databinding/ActivityModifyScoreBinding;)V", "scoreDao", "Lcom/example/sims/dao/ScoreDao;", "getScoreDao", "()Lcom/example/sims/dao/ScoreDao;", "setScoreDao", "(Lcom/example/sims/dao/ScoreDao;)V", "scoreDatabase", "Lcom/example/sims/database/ScoreDatabase;", "getScoreDatabase", "()Lcom/example/sims/database/ScoreDatabase;", "setScoreDatabase", "(Lcom/example/sims/database/ScoreDatabase;)V", "studentDao", "Lcom/example/sims/dao/StudentDao;", "getStudentDao", "()Lcom/example/sims/dao/StudentDao;", "setStudentDao", "(Lcom/example/sims/dao/StudentDao;)V", "studentDatabase", "Lcom/example/sims/database/StudentDatabase;", "getStudentDatabase", "()Lcom/example/sims/database/StudentDatabase;", "setStudentDatabase", "(Lcom/example/sims/database/StudentDatabase;)V", "onClick", "", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ModifyScoreActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.Nullable()
    private com.example.sims.databinding.ActivityModifyScoreBinding inflate;
    @org.jetbrains.annotations.Nullable()
    private com.example.sims.dao.ScoreDao scoreDao;
    @org.jetbrains.annotations.Nullable()
    private com.example.sims.database.ScoreDatabase scoreDatabase;
    @org.jetbrains.annotations.Nullable()
    private com.example.sims.dao.StudentDao studentDao;
    @org.jetbrains.annotations.Nullable()
    private com.example.sims.database.StudentDatabase studentDatabase;
    
    public ModifyScoreActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.sims.databinding.ActivityModifyScoreBinding getInflate() {
        return null;
    }
    
    public final void setInflate(@org.jetbrains.annotations.Nullable()
    com.example.sims.databinding.ActivityModifyScoreBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.sims.dao.ScoreDao getScoreDao() {
        return null;
    }
    
    public final void setScoreDao(@org.jetbrains.annotations.Nullable()
    com.example.sims.dao.ScoreDao p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.sims.database.ScoreDatabase getScoreDatabase() {
        return null;
    }
    
    public final void setScoreDatabase(@org.jetbrains.annotations.Nullable()
    com.example.sims.database.ScoreDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.sims.dao.StudentDao getStudentDao() {
        return null;
    }
    
    public final void setStudentDao(@org.jetbrains.annotations.Nullable()
    com.example.sims.dao.StudentDao p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.sims.database.StudentDatabase getStudentDatabase() {
        return null;
    }
    
    public final void setStudentDatabase(@org.jetbrains.annotations.Nullable()
    com.example.sims.database.StudentDatabase p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
}