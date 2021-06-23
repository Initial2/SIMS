// Generated by view binder compiler. Do not edit!
package com.example.sims.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.sims.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityStudentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button classmatesButton;

  @NonNull
  public final Button exitButton;

  @NonNull
  public final Button modifyButton;

  @NonNull
  public final Button personalFileButton;

  @NonNull
  public final Button scoreButton;

  @NonNull
  public final TextView textView2;

  private ActivityStudentBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button classmatesButton, @NonNull Button exitButton, @NonNull Button modifyButton,
      @NonNull Button personalFileButton, @NonNull Button scoreButton,
      @NonNull TextView textView2) {
    this.rootView = rootView;
    this.classmatesButton = classmatesButton;
    this.exitButton = exitButton;
    this.modifyButton = modifyButton;
    this.personalFileButton = personalFileButton;
    this.scoreButton = scoreButton;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStudentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStudentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_student, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStudentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.classmates_button;
      Button classmatesButton = rootView.findViewById(id);
      if (classmatesButton == null) {
        break missingId;
      }

      id = R.id.exit_button;
      Button exitButton = rootView.findViewById(id);
      if (exitButton == null) {
        break missingId;
      }

      id = R.id.modify_button;
      Button modifyButton = rootView.findViewById(id);
      if (modifyButton == null) {
        break missingId;
      }

      id = R.id.personal_file_button;
      Button personalFileButton = rootView.findViewById(id);
      if (personalFileButton == null) {
        break missingId;
      }

      id = R.id.score_button;
      Button scoreButton = rootView.findViewById(id);
      if (scoreButton == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = rootView.findViewById(id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityStudentBinding((ConstraintLayout) rootView, classmatesButton, exitButton,
          modifyButton, personalFileButton, scoreButton, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
