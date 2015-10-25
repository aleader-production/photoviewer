package com.photoviewer.presentation.navigation;

import android.content.Context;
import android.content.Intent;

import com.google.inject.Singleton;
import com.photoviewer.presentation.view.activity.PhotoDetailsActivity;

/**
 * Class used to navigate through the application.
 */
@Singleton
public class Navigator {

    /**
     * Goes to the photo details screen.
     *
     * @param context A Context needed to open the activity.
     */
    public void navigateToPhotoDetails(Context context, int photoId) {
        if (context != null) {
            Intent intentToLaunch = PhotoDetailsActivity.getCallingIntent(context, photoId);
            context.startActivity(intentToLaunch);
        }
    }
}
