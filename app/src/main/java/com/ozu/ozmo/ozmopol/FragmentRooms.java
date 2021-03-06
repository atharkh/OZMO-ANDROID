package com.ozu.ozmo.ozmopol;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.etsy.android.grid.StaggeredGridView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentRooms.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentRooms#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentRooms extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_rooms.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentRooms newInstance(String param1, String param2) {
        FragmentRooms fragment = new FragmentRooms();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentRooms() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rooms, container, false);



    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<String> myCards=new ArrayList<String>();

        myCards.add("HEy");
        myCards.add("HEy");
        myCards.add("HEy");
        myCards.add("HEy");
        myCards.add("HEy");
        myCards.add("HEy");
        myCards.add("HEy");
        myCards.add("HEy");
        myCards.add("HEy");
        myCards.add("HEy");
        myCards.add("HEy");

        RoomsAdapter pAdapter=new RoomsAdapter(getActivity(),myCards);

        StaggeredGridView gridView = (StaggeredGridView)getView().findViewById(R.id.grid_view);
        gridView.setAdapter(pAdapter);

    }





    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */


}
