// Generated by view binder compiler. Do not edit!
package com.example.cityinformation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cityinformation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContactcardBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView callview;

  @NonNull
  public final ImageView delete;

  @NonNull
  public final TextView details;

  private ContactcardBinding(@NonNull CardView rootView, @NonNull CardView callview,
      @NonNull ImageView delete, @NonNull TextView details) {
    this.rootView = rootView;
    this.callview = callview;
    this.delete = delete;
    this.details = details;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ContactcardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContactcardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.contactcard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContactcardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.callview;
      CardView callview = ViewBindings.findChildViewById(rootView, id);
      if (callview == null) {
        break missingId;
      }

      id = R.id.delete;
      ImageView delete = ViewBindings.findChildViewById(rootView, id);
      if (delete == null) {
        break missingId;
      }

      id = R.id.details;
      TextView details = ViewBindings.findChildViewById(rootView, id);
      if (details == null) {
        break missingId;
      }

      return new ContactcardBinding((CardView) rootView, callview, delete, details);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
