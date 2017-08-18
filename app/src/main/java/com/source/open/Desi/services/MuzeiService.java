package com.source.open.Desi.services;

import android.content.Intent;


import com.dm.wallpaper.board.services.WallpaperBoardMuzeiService;
import com.google.android.apps.muzei.api.RemoteMuzeiArtSource;

import om.source.open.Desi.R;

public class MuzeiService extends WallpaperBoardMuzeiService{

    private static final String SOURCE_NAME = "WallpaperBoard:MuzeiArtSource";

    public MuzeiService() {
        super(SOURCE_NAME);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startCommand(intent);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        initMuzeiService();
    }

    @Override
    protected void onTryUpdate(int reason) throws RemoteMuzeiArtSource.RetryException {
        String wallpaperUrl = getResources().getString(R.string.wallpaper_json);
        tryUpdate(wallpaperUrl);
    }
}
