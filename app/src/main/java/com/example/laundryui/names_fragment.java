package com.example.laundryui;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link names_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class names_fragment extends Fragment {
    TextView question;
    TextView Answer;

    ImageView right;
    ImageView left;

    String[] questions;
    String[] answers;

    Integer counter = 1;
    Integer index = 1;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public names_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment names_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static names_fragment newInstance(String param1, String param2) {
        names_fragment fragment = new names_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

            question = getActivity().findViewById(R.id.textView31);
            Answer = getActivity().findViewById(R.id.textView41);

            right = getActivity().findViewById(R.id.imageView311);
            left = getActivity().findViewById(R.id.imageView111);

            questions = getResources().getStringArray(R.array.arabic);
            answers = getResources().getStringArray(R.array.english);

            question.setText(questions[0]);
            Answer.setText(answers[0]);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.names_fragment, container, false);



    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        question = getActivity().findViewById(R.id.textView31);
        Answer = getActivity().findViewById(R.id.textView41);

        right = getActivity().findViewById(R.id.imageView311);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter < 9) {
                    index++;
                    question.setText(questions[counter]);
                    Answer.setText("" + answers[index]);
                    counter++;
                } else {
                    Toast toast = Toast.makeText(getActivity(), "NAMES END", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }

        });

        left = getActivity().findViewById(R.id.imageView111);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter > 1) {
                    index--;

                    counter--;
                    question.setText(questions[counter - 1]);
                    Answer.setText("" + answers[index]);
                } else {
                    Toast toast = Toast.makeText(getActivity(), "NAMES END", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


        questions = getResources().getStringArray(R.array.arabic);
        answers = getResources().getStringArray(R.array.english);

        question.setText(questions[0]);
        Answer.setText(answers[0]);
    }



}