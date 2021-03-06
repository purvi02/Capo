package com.example.dimpychhabra.capo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
/*
*Project : CAPO, fully created by
* Dimpy Chhabra, IGDTUW, BTech, IT
* Second year (as of 2017)
* Expected Class of 2019
* Please do not circulate as your own
* Criticism is appreciated to work on memory leaks and bugs
* Contact Info : Find me on Linked in : linkedin.com/in/dimpy-chhabra
*
*/
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class getCapo_Frag2 extends Fragment implements View.OnClickListener{
    private static View view;
    private static TextView tv1;
    private static Button b1;
    private static FragmentManager fragmentManager;
    String data;

    public getCapo_Frag2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_get_capo__frag2, container, false);
        initViews();
        setListeners();

        final Bundle bdl = getArguments();

        String str = "";
        try {
            str = bdl.getString("rideId");
        } catch (final Exception e) {
            Log.e("!!!!!!!!!!!!!!!", " errrrr" + str);
        }

        //Bundle args = getArguments();
        //String value = args.getString("rideId");
        Log.e("!!!!!!!!!!!!!!!", "" + str);
        Toast.makeText(getActivity().getApplicationContext(), "  >>>>>> " + str, Toast.LENGTH_SHORT).show();
        return view;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void initViews() {
        fragmentManager = getActivity().getSupportFragmentManager();
        tv1 = (TextView)view.findViewById(R.id.tv1);
        b1 = (Button)view.findViewById(R.id.b1);
    }

    private void setListeners() {
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1:
                    Intent i = new Intent(getActivity(), MainActivity.class);
                    startActivity(i);
                break;
            case R.id.tv1:
                Log.e("ablah ", " ablhad ");
                break;
        }
    }
}


