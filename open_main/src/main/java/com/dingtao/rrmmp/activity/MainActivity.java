package com.dingtao.rrmmp.activity;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.dingtao.common.util.Constant;
import com.dingtao.rrmmp.main.R;

import com.dingtao.common.core.WDActivity;


@Route(path = Constant.ACTIVITY_URL_MAIN)
public class MainActivity extends WDActivity  {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {


    }
    @Override
    protected void destoryData() {

    }


}
