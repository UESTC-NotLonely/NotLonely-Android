package com.efan.notlonely_android.ui.mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.efan.basecmlib.activity.BaseFragment;
import com.efan.notlonely_android.R;
import com.efan.notlonely_android.view.BlurringView;

/**
 * Created by 一帆 on 2016/3/22.
 */
public class MineFragment extends BaseFragment {
    private BlurringView blurringView;

    @Override
    protected View inflaterView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
        return var1.inflate(R.layout.fragment_mine, var2, false);
    }

    @Override
    public void initView() {
        blurringView = (BlurringView) getActivity().findViewById(R.id.blurring_view);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onResume() {
        super.onResume();
        blurringView.invalidate();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden && blurringView instanceof BlurringView) blurringView.invalidate();
    }
}
