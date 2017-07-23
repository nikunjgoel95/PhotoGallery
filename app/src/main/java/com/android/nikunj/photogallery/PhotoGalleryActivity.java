package com.android.nikunj.photogallery;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    public Fragment createFragment()
    {
        return PhotoGalleryFragment.newInstance();
    }
}
