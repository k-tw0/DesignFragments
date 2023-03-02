package com.example.designplataforms;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterFragment extends FragmentStateAdapter {

    //TITULO CONTENIDO DINAMICO DE LOS FRAGMENTS
    private String[] titles = new String[] {"Home", "Other"};

    public AdapterFragment(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    //retornar Los Menus
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new homeFragment();
            case 1:
                return new OtherFragment();
        }
        return new homeFragment();
    }

    @Override
    public int getItemCount() {
        //Obtener numero de string del objeto titles
        return titles.length;
    }
}
