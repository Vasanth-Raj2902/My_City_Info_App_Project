// Generated by view binder compiler. Do not edit!
package com.example.cityinformation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cityinformation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddPlacesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView images;

  @NonNull
  public final LinearLayout lau;

  @NonNull
  public final AppCompatButton next;

  @NonNull
  public final Spinner second;

  @NonNull
  public final Spinner spinner;

  private ActivityAddPlacesBinding(@NonNull LinearLayout rootView, @NonNull ImageView images,
      @NonNull LinearLayout lau, @NonNull AppCompatButton next, @NonNull Spinner second,
      @NonNull Spinner spinner) {
    this.rootView = rootView;
    this.images = images;
    this.lau = lau;
    this.next = next;
    this.second = second;
    this.spinner = spinner;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddPlacesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddPlacesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_places, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddPlacesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.images;
      ImageView images = ViewBindings.findChildViewById(rootView, id);
      if (images == null) {
        break missingId;
      }

      id = R.id.lau;
      LinearLayout lau = ViewBindings.findChildViewById(rootView, id);
      if (lau == null) {
        break missingId;
      }

      id = R.id.next;
      AppCompatButton next = ViewBindings.findChildViewById(rootView, id);
      if (next == null) {
        break missingId;
      }

      id = R.id.second;
      Spinner second = ViewBindings.findChildViewById(rootView, id);
      if (second == null) {
        break missingId;
      }

      id = R.id.spinner;
      Spinner spinner = ViewBindings.findChildViewById(rootView, id);
      if (spinner == null) {
        break missingId;
      }

      return new ActivityAddPlacesBinding((LinearLayout) rootView, images, lau, next, second,
          spinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
