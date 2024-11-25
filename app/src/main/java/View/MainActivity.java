package View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.teste04.R;

import controller.PessoaController;
import model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    PessoaController controller;
    EditText PrimeiroNome, SobreNome, CursoDesejado, TelefoneContato;
    Button onclick, LIMPAR, SALVAR, FINALIZAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        controller = new PessoaController(MainActivity.this);
        controller.toString();
        controller.buscar(pessoa);


        PrimeiroNome = findViewById(R.id.editPrimeiroNome);
        SobreNome = findViewById(R.id.editSobreNome);
        CursoDesejado = findViewById(R.id.editCursoDesejado);
        TelefoneContato = findViewById(R.id.TelefoneContato);


        PrimeiroNome.setText(pessoa.getPrimeiroNome());
        SobreNome.setText(pessoa.getSobrenome());
        CursoDesejado.setText(pessoa.getCursoDesejado());
        TelefoneContato.setText(pessoa.getTelefoneContato());

        LIMPAR = findViewById(R.id.LIMPAR);

        SALVAR = findViewById(R.id.SALVAR);

        FINALIZAR = findViewById(R.id.FINALIZAR);


    FINALIZAR.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick ( View view){
            Toast.makeText(MainActivity.this,"volte sempre", Toast.LENGTH_LONG).show();
            finish();
        }
    });
    SALVAR.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            pessoa.setPrimeiroNome(PrimeiroNome.getText().toString());
            pessoa.setSobrenome(SobreNome.getText().toString());
            pessoa.setCursoDesejado(CursoDesejado.getText().toString());
            pessoa.setTelefoneContato(TelefoneContato.getText().toString());

            Toast.makeText(MainActivity.this,"Dados Salvos" + pessoa.toString(),Toast.LENGTH_LONG).show();

            controller.SALVAR(pessoa);
        }
         });
    LIMPAR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            PrimeiroNome.setText("");
            SobreNome.setText("");
            CursoDesejado.setText("");
            TelefoneContato.setText("");
            controller.limpar();
        }
    });
        Log.i("PooAndroid",pessoa.toString());
    }

}