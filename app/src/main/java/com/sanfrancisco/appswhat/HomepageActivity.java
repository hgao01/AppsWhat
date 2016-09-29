package com.sanfrancisco.appswhat;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

//import com.sanfrancisco.appswhat.R;

public class HomepageActivity extends AppCompatActivity {


    /**
     * Created by hgao01 on 9/28/2016.
     */


    private RadioGroup mTabRg;

    private RadioButton mHomeBrb;
    private RadioButton mMessageBrb;
    private RadioButton mDiscoverBrb;
    private RadioButton mMeBrb;


    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        menuBarView();
        RadioButtonMenu();
    }

    private void menuBarView() {
        mTabRg = (RadioGroup) findViewById(R.id.rg_main_tab);
        mHomeBrb = (RadioButton) findViewById(R.id.brb_main_home);
        mMessageBrb = (RadioButton) findViewById(R.id.brb_main_message);
        mDiscoverBrb = (RadioButton) findViewById(R.id.brb_main_discover);
        mMeBrb = (RadioButton) findViewById(R.id.brb_main_me);

    }

    private void RadioButtonMenu() {

        mTabRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.brb_main_home:
                        //Toast.makeText(getApplicationContext(), "Main Button is clicked", Toast.LENGTH_LONG).show();
                        makeRecyclerView();

                        break;
                    case R.id.brb_main_message:
                        Toast.makeText(getApplicationContext(), "Mail Button is clicked", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.brb_main_discover:
                        Toast.makeText(getApplicationContext(), "Friend Button is clicked", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.brb_main_me:
                        Toast.makeText(getApplicationContext(), "ME Button is clicked", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }

    private void makeRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        Toast.makeText(getApplicationContext(), "Inside RecyclerView ", Toast.LENGTH_LONG).show();

    }


}


