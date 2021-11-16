package com.itca.crud_proyecto_final.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.itca.crud_proyecto_final.Delete_producto;
import com.itca.crud_proyecto_final.Lista_producto;
import com.itca.crud_proyecto_final.Producto;
import com.itca.crud_proyecto_final.R;
import com.itca.crud_proyecto_final.Registrar;
import com.itca.crud_proyecto_final.databinding.FragmentHomeBinding;
import com.itca.crud_proyecto_final.ui.Productos;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    Button registrarP, listaP, eliminarP;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        registrarP = root.findViewById(R.id.registrarP);
        listaP = root.findViewById(R.id.listaP);
       eliminarP = root.findViewById(R.id.eliminarP);

        registrarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrarP = new Intent(getContext(), Producto.class);
                startActivity(registrarP);
            }
        });

        listaP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listaP = new Intent(getContext(), Lista_producto.class);
                startActivity(listaP);
            }
        });

        eliminarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  eliminarP = new Intent(getContext(), Delete_producto.class);
                startActivity( eliminarP);
            }
        });


        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }




}