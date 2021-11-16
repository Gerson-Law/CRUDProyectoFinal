package com.itca.crud_proyecto_final.ui.gallery;

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

import com.itca.crud_proyecto_final.Agregar_cate;
import com.itca.crud_proyecto_final.Delete_cate;
import com.itca.crud_proyecto_final.Delete_producto;
import com.itca.crud_proyecto_final.Lista_cate;
import com.itca.crud_proyecto_final.Lista_producto;
import com.itca.crud_proyecto_final.Producto;
import com.itca.crud_proyecto_final.R;
import com.itca.crud_proyecto_final.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding binding;
    Button lista_cate, eli_cate, guarda_cate;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        lista_cate = root.findViewById(R.id.lista_cate);
        eli_cate = root.findViewById(R.id.eli_cate);
        guarda_cate = root.findViewById(R.id.guarda_cate);

        lista_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lista_cate = new Intent(getContext(), Lista_cate.class);
                startActivity(lista_cate);
            }
        });

        eli_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eli_cate = new Intent(getContext(), Delete_cate.class);
                startActivity(eli_cate);
            }
        });

        guarda_cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  guarda_cate = new Intent(getContext(), Agregar_cate.class);
                startActivity( guarda_cate);
            }
        });


        final TextView textView = binding.textGallery;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
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