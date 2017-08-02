package com.scratch.kena.criminalintent;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by kena on 8/2/17.
 * Taken from Android Programming: the Big Nerd Ranch 3.e
 */

public class ImageDetailFragment extends DialogFragment {
    public static final String EXTRA_IMAGE_PATH = "com.scratch.kena.criminalintent.photo";
    public static final String TAG = "ImageDetailFragment";

    static ImageDetailFragment newInstance(String imagePath) {
        ImageDetailFragment f = new ImageDetailFragment();

        // Supply the image path as an argument
        Bundle args = new Bundle();
        args.putString(EXTRA_IMAGE_PATH, imagePath);
        f.setArguments(args);
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String imagePath = null;
        if (getArguments().containsKey(EXTRA_IMAGE_PATH)) {
            imagePath = (String) getArguments().getSerializable(EXTRA_IMAGE_PATH);

            View view = LayoutInflater.from(getActivity())
                    .inflate(R.layout.dialog_imageview, null);

            ImageView imageView = view.findViewById(R.id.crime_photo_detail);
            Bitmap bitmap = PictureUtils.getBitmap(imagePath);
            imageView.setImageBitmap(bitmap);
            return view;
        } else {
            Log.e(TAG, "onCreateDialog no image path in arguments!");
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        ViewGroup.LayoutParams params = getDialog().getWindow().getAttributes();
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = WindowManager.LayoutParams.MATCH_PARENT;
        getDialog().getWindow().setAttributes((android.view.WindowManager.LayoutParams) params);

        super.onResume();
    }
}
