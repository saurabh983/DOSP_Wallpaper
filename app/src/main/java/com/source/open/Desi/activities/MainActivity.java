package com.source.open.Desi.activities;

import android.os.Bundle;

import com.dm.wallpaper.board.activities.WallpaperBoardActivity;
import com.source.open.Desi.licenses.License;

public class MainActivity extends WallpaperBoardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initMainActivity(savedInstanceState,
                License.isLicenseCheckerEnabled(),
                License.getRandomString(),
                License.getLicenseKey(),
                License.getDonationProductsId());
    }
}
