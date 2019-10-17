package com.example.fragementapp.Fragements;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragementapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    private int buttonTag;

    private TextView mTextView;
    private static final String KEY_BUTTONTAG =
"com.openclassrooms.myfragmentapp.Controllers.Fragments.DetailFragment.KEY_BUTTONTAG";




    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        // Inflate the layout for this fragment
        this.mTextView= (TextView) view.findViewById(R.id.fragment_detail_text_view);

        return(view);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // 5 - Restore last buttonTag if possible
        if (savedInstanceState != null) {
            int buttonTagRestored = savedInstanceState.getInt(KEY_BUTTONTAG, 0);
            // 6 - Update TextView
            this.updateTextView(buttonTagRestored);
        }
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // 4 - Save buttonTag in Bundle when fragment is destroyed
        outState.putInt(KEY_BUTTONTAG, buttonTag);
    }

    // 3 - Update TextView depending on TAG's button
    public void updateTextView(int tag) {
        this.buttonTag = tag;
        switch (tag) {
            case 10:
                this.mTextView.setText("You're a very good programmer !");
                break;
            case 20:
                this.mTextView.setText("I do believe that Jon Snow is going to die in next season...");
                break;
            case 30:
                this.mTextView.setText("Maybe Game of Thrones next season will get back in 2040 ?");
                break;
            default:
                break;
        }


    }

}