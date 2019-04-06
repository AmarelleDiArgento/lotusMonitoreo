package com.lotus.lotusmonitoreo.Vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.lotus.lotusmonitoreo.Modelo.Tabs.Causa;
import com.lotus.lotusmonitoreo.Modelo.iCausas;
import com.lotus.lotusmonitoreo.R;
import com.lotus.lotusmonitoreo.Vista.VisualControl.AdapCausa;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {
    Causa c;
    iCausas iC;
    EditText Codigo, Nombre,Error;
    ImageButton Save;
    RecyclerView Lista;
    AdapCausa ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Codigo = (EditText)findViewById(R.id.et_Codigo);
        Nombre = (EditText)findViewById(R.id.et_Nombre);
        Error = (EditText)findViewById(R.id.et_Error);
        Save  = (ImageButton)findViewById(R.id.ib_Save);
        Lista = (RecyclerView)findViewById(R.id.rc_Lista);

        Lista.setLayoutManager(new LinearLayoutManager(this));
        List<Causa> lc = listarTodos();
        ac = new AdapCausa(lc);
        Lista.setAdapter(ac);



    }

    public void Registro(View view){
        if(Codigo.getText().toString() != null && Nombre.getText() != null ){
            c = new Causa();
            c.setCodigoCau(Codigo.getText().toString());
            c.setNombreCau(Nombre.getText().toString());
            try {

                iC = new iCausas();
                int val = iC.insert(c);
                if (val>0) {
                    Toast.makeText(this, "Registro de causa: " + c.getNombreCau() + "exitoso!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Registro de causa: " + c.getNombreCau() + "No exitoso!", Toast.LENGTH_LONG).show();
                }

            }catch (Exception e){
                Error.setText(e.toString());
                Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this,"Diligencia los campos solicitados",Toast.LENGTH_LONG).show();

        }
    }

    public List<Causa> listarTodos() {
        List<Causa> lc = new ArrayList<>();
        try {
            iC = new iCausas();
            lc = iC.all();
        } catch (Exception e) {
            Error.setText(e.toString());
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
        return lc;
    }
}
