package com.mondyxue.xrouter.demo.ui.fragment;

import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mondyxue.xrouter.XRouter;
import com.mondyxue.xrouter.constant.RouteType;
import com.mondyxue.xrouter.demo.R;
import com.mondyxue.xrouter.demo.data.UserInfo;
import com.mondyxue.xrouter.demo.navigator.DemoNavigator;

/**
 * <br>Created by MondyXue
 * <br>E-Mail: mondyxue@gmail.com
 */
@Route(path = DemoNavigator._UserInfoFragment, extras = RouteType.LoginFragment)
public class UserInfoFragment extends BaseFragment{

    @Override protected int getRootLayout(){
        return R.layout.fragment_userinfo;
    }

    @Override protected void initView(View rootView){
        UserInfo userInfo = XRouter.getRouter()
                                   .create(DemoNavigator.class)
                                   .getUserService()
                                   .getUserInfo();
        TextView tvText = (TextView) rootView.findViewById(R.id.tv_text);
        tvText.setText(userInfo.toString());
    }

}
