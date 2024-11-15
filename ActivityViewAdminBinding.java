// Generated by view binder compiler. Do not edit!
package com.example.cityinformation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cityinformation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityViewAdminBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView addplaces;

  @NonNull
  public final CardView card2;

  private ActivityViewAdminBinding(@NonNull LinearLayout rootView, @NonNull CardView addplaces,
      @NonNull CardView card2) {
    this.rootView = rootView;
    this.addplaces = addplaces;
    this.card2 = card2;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityViewAdminBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityViewAdminBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view_admin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityViewAdminBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addplaces;
      CardView addplaces = ViewBindings.findChildViewById(rootView, id);
      if (addplaces == null) {
        break missingId;
      }

      id = R.id.card2;
      CardView card2 = ViewBindings.findChildViewById(rootView, id);
      if (card2 == null) {
        break missingId;
      }

      return new ActivityViewAdminBinding((LinearLayout) rootView, addplaces, card2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
