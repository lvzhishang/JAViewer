package io.github.javiewer.fragment;

import io.github.javiewer.network.AVMO;
import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * Project: JAViewer
 */
public class ReleasedFragment extends MovieFragment {
    @Override
    public Call<ResponseBody> newCall(int page) {
        return AVMO.INSTANCE.getReleased(page);
    }
}
