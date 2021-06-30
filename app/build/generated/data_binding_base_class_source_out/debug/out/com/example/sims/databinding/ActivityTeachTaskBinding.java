// Generated by view binder compiler. Do not edit!
package com.example.sims.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.sims.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTeachTaskBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button4;

  @NonNull
  public final EditText courseID2;

  @NonNull
  public final EditText studentID2;

  @NonNull
  public final TextView textView44;

  @NonNull
  public final TextView textView45;

  @NonNull
  public final TextView textView46;

  private ActivityTeachTaskBinding(@NonNull ConstraintLayout rootView, @NonNull Button button4,
      @NonNull EditText courseID2, @NonNull EditText studentID2, @NonNull TextView textView44,
      @NonNull TextView textView45, @NonNull TextView textView46) {
    this.rootView = rootView;
    this.button4 = button4;
    this.courseID2 = courseID2;
    this.studentID2 = studentID2;
    this.textView44 = textView44;
    this.textView45 = textView45;
    this.textView46 = textView46;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTeachTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTeachTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_teach_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTeachTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button4;
      Button button4 = rootView.findViewById(id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.courseID2;
      EditText courseID2 = rootView.findViewById(id);
      if (courseID2 == null) {
        break missingId;
      }

      id = R.id.studentID2;
      EditText studentID2 = rootView.findViewById(id);
      if (studentID2 == null) {
        break missingId;
      }

      id = R.id.textView44;
      TextView textView44 = rootView.findViewById(id);
      if (textView44 == null) {
        break missingId;
      }

      id = R.id.textView45;
      TextView textView45 = rootView.findViewById(id);
      if (textView45 == null) {
        break missingId;
      }

      id = R.id.textView46;
      TextView textView46 = rootView.findViewById(id);
      if (textView46 == null) {
        break missingId;
      }

      return new ActivityTeachTaskBinding((ConstraintLayout) rootView, button4, courseID2,
          studentID2, textView44, textView45, textView46);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
