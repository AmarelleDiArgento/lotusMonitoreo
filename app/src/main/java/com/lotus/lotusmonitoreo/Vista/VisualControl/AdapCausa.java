package com.lotus.lotusmonitoreo.Vista.VisualControl;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.lotus.lotusmonitoreo.Modelo.Tabs.Causa;
import com.lotus.lotusmonitoreo.R;

import java.util.List;

import static android.support.constraint.Constraints.TAG;

public class AdapCausa extends RecyclerView.Adapter<AdapCausa.ViewHolder> {
    public EditText eCodigo, eNombre;
    public  TextView eId;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Id, Nombre, Detalle;
        private ImageView icono;


        public ViewHolder(View itemView) {
            super(itemView);

            icono = (ImageView) itemView.findViewById(R.id.iv_Icono);
            Id = (TextView) itemView.findViewById(R.id.tv_Id);
            Nombre = (TextView) itemView.findViewById(R.id.tv_Nombre);
            Detalle = (TextView) itemView.findViewById(R.id.tv_Detalle);
        }
    }

    public List<Causa> causaList;

    public AdapCausa(List<Causa> causaList) {
        this.causaList = causaList;
    }



    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemslista,viewGroup,false);
        ViewHolder viewHolder =new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Log.d(TAG, "onBindViewHolder: called.");

        viewHolder.Id.setText(String.valueOf(causaList.get(i).getIdCau()));
        viewHolder.Nombre.setText(causaList.get(i).getNombreCau());
        viewHolder.Detalle.setText(causaList.get(i).getCodigoCau());
        viewHolder.icono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {

        return causaList.size();
    }


}
