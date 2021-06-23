package com.example.sims.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.sims.entity.Student;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class StudentDao_Impl implements StudentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Student> __insertionAdapterOfStudent;

  public StudentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStudent = new EntityInsertionAdapter<Student>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `student` (`student_id`,`name`,`age`,`sex`,`tel`,`address`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Student value) {
        if (value.getStudent_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getStudent_id());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAge() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAge());
        }
        if (value.getSex() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSex());
        }
        if (value.getTel() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTel());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getAddress());
        }
      }
    };
  }

  @Override
  public void insert(final Student element) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfStudent.insert(element);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Student show(final int student_id) {
    final String _sql = "select * from student where student_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, student_id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfStudentId = CursorUtil.getColumnIndexOrThrow(_cursor, "student_id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
      final int _cursorIndexOfSex = CursorUtil.getColumnIndexOrThrow(_cursor, "sex");
      final int _cursorIndexOfTel = CursorUtil.getColumnIndexOrThrow(_cursor, "tel");
      final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
      final Student _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpStudent_id;
        if (_cursor.isNull(_cursorIndexOfStudentId)) {
          _tmpStudent_id = null;
        } else {
          _tmpStudent_id = _cursor.getInt(_cursorIndexOfStudentId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpAge;
        if (_cursor.isNull(_cursorIndexOfAge)) {
          _tmpAge = null;
        } else {
          _tmpAge = _cursor.getString(_cursorIndexOfAge);
        }
        final String _tmpSex;
        if (_cursor.isNull(_cursorIndexOfSex)) {
          _tmpSex = null;
        } else {
          _tmpSex = _cursor.getString(_cursorIndexOfSex);
        }
        final String _tmpTel;
        if (_cursor.isNull(_cursorIndexOfTel)) {
          _tmpTel = null;
        } else {
          _tmpTel = _cursor.getString(_cursorIndexOfTel);
        }
        final String _tmpAddress;
        if (_cursor.isNull(_cursorIndexOfAddress)) {
          _tmpAddress = null;
        } else {
          _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
        }
        _result = new Student(_tmpStudent_id,_tmpName,_tmpAge,_tmpSex,_tmpTel,_tmpAddress);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
