package com.wqz.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.hc.library.view.CircleImageView;
import com.wqz.marketmodule.AboutActivity;
import com.wqz.marketmodule.LoginActivity;
import com.wqz.marketmodule.R;
import com.wqz.marketmodule.SettingActivity;


/**
 * Created by Administrator on 2016/8/4.
 */
public class MeFragment extends BaseFragment
{
    RelativeLayout rlAbout;
    RelativeLayout rlSetting;
    CircleImageView headView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState,int flag)
    {
        View view = inflater.inflate(R.layout.fragment_me, container, false);

        initUI(view);

        return view;
    }

    void initUI(View view)
    {
        rlAbout = (RelativeLayout)view.findViewById(R.id.rl_about);
        rlAbout.setOnClickListener(l);

        rlSetting = (RelativeLayout)view.findViewById(R.id.rl_setting);
        rlSetting.setOnClickListener(l);

        headView = (CircleImageView)view.findViewById(R.id.civ_head);
        headView.setOnClickListener(l);
    }

    View.OnClickListener l = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.rl_about:
                    startActivity(new Intent(MeFragment.this.getActivity(), AboutActivity.class));
                    break;

                case R.id.rl_setting:
                    startActivity(new Intent(MeFragment.this.getActivity(), SettingActivity.class));
                    break;

                case R.id.civ_head:
                    startActivity(new Intent(MeFragment.this.getActivity(), LoginActivity.class));
                    break;
            }
        }
    };
}
