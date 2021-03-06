package com.android.msahakyan.fma.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by msahakyan on 01/07/16.
 */

@Module
public class StorageModule {

    /**
     * Provides singleton instance of default shared preferences
     *
     * @param app The application instance
     * @return a default {@link SharedPreferences} instance from Preferences manager
     */
    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Application app) {
        return PreferenceManager.getDefaultSharedPreferences(app);
    }
}
