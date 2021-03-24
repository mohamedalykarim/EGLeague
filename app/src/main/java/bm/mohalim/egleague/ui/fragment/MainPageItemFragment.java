package bm.mohalim.egleague.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import bm.mohalim.egleague.data.model.MainPageItem;
import bm.mohalim.egleague.databinding.RowMainItemBinding;
import bm.mohalim.egleague.ui.WebActivity;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MainPageItemFragment extends Fragment {

    private static final String ARGS = "args";

    public static MainPageItemFragment newInstance(Bundle args) {
        MainPageItemFragment fragment = new MainPageItemFragment();
        fragment.setArguments(args);
        return fragment;
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RowMainItemBinding binding = RowMainItemBinding.inflate(inflater, container,false);

        final MainPageItem item = (getArguments().getParcelable(ARGS));
        Picasso.get().load(item.getImage()).fit().centerInside().into(binding.imageView);
        binding.textView.setText(item.getTitle());

        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WebActivity.class);
                intent.putExtra(URL, item.getUrl());

                getActivity().startActivity(intent);
            }
        });

        return binding.getRoot();
    }
}
