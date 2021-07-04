

package com.example.android.goodnewsapp.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.loader.content.Loader;
import android.util.Log;

import com.example.android.goodnewsapp.News;
import com.example.android.goodnewsapp.NewsLoader;
import com.example.android.goodnewsapp.NewsPreferences;
import com.example.android.goodnewsapp.R;

import java.util.List;

public class EnvironmentFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = EnvironmentFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String environmentUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.environment));
        Log.e(LOG_TAG, environmentUrl);

        return new NewsLoader(getActivity(), environmentUrl);
    }
}
