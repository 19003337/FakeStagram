package com.vc19003337.fakestagram.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LocalImagesActivity extends AppCompatActivity
{
    private LocalImagesStoreFragment storeFragment = new LocalImagesStoreFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_images);
    }
}