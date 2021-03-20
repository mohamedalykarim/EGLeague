package bm.mohalim.egleague.ui.main;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bm.mohalim.egleague.R;
import bm.mohalim.egleague.databinding.FragmentMainBinding;
import bm.mohalim.egleague.ui.LeagueActivity;
import bm.mohalim.egleague.ui.WebActivity;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;


public class MainFragment extends Fragment{

    private MainViewModel mViewModel;
    FragmentMainBinding binding;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater,container,false);

        binding.league.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LeagueActivity.class);
                getActivity().startActivity(intent);

            }
        });

        binding.yalaKora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebActivity.class);
                intent.putExtra(URL, "https://www.yallakora.com/");
                getActivity().startActivity(intent);

            }
        });

        binding.koraOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), WebActivity.class);
                intent.putExtra(URL, "http://kora-online.tv/");
                getActivity().startActivity(intent);


            }
        });

        binding.kooora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), WebActivity.class);
                intent.putExtra(URL, "www.kooora.com");
                getActivity().startActivity(intent);


            }
        });

        binding.masrawy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebActivity.class);
                intent.putExtra(URL, "https://www.masrawy.com/channel/sports");
                getActivity().startActivity(intent);

            }
        });

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }


}
