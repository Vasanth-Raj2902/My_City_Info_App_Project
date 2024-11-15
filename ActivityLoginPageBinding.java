// Generated by view binder compiler. Do not edit!
package com.example.cityinformation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cityinformation.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginPageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextInputEditText lmail;

  @NonNull
  public final TextView logins;

  @NonNull
  public final TextInputEditText pass;

  @NonNull
  public final TextView signup;

  private ActivityLoginPageBinding(@NonNull LinearLayout rootView, @NonNull TextInputEditText lmail,
      @NonNull TextView logins, @NonNull TextInputEditText pass, @NonNull TextView signup) {
    this.rootView = rootView;
    this.lmail = lmail;
    this.logins = logins;
    this.pass = pass;
    this.signup = signup;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lmail;
      TextInputEditText lmail = ViewBindings.findChildViewById(rootView, id);
      if (lmail == null) {
        break missingId;
      }

      id = R.id.logins;
      TextView logins = ViewBindings.findChildViewById(rootView, id);
      if (logins == null) {
        break missingId;
      }

      id = R.id.pass;
      TextInputEditText pass = ViewBindings.findChildViewById(rootView, id);
      if (pass == null) {
        break missingId;
      }

      id = R.id.signup;
      TextView signup = ViewBindings.findChildViewById(rootView, id);
      if (signup == null) {
        break missingId;
      }

      return new ActivityLoginPageBinding((LinearLayout) rootView, lmail, logins, pass, signup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
