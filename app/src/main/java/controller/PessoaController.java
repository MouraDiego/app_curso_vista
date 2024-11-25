package controller;

import android.content.SharedPreferences;
import android.util.Log;

import View.MainActivity;
import model.Pessoa;


public class PessoaController {

    SharedPreferences preferences;
    public static final String NOME_PREFERENCES = "pref_listvip";
    SharedPreferences.Editor listaVip;

    public PessoaController (MainActivity mainActivity){
       preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
       listaVip = preferences.edit();
    }


    @Override
    public String toString() {
        Log.d("mvc-controller", "CONTROLLER INICIADA");
        return super.toString();
    }
    public void  SALVAR(Pessoa pessoa) {
        Log.d("mvc-controller", "DADOS SALVOS: " + pessoa.toString());

        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobreNome", pessoa.getSobrenome());
        listaVip.putString("CursoDesejado", pessoa.getCursoDesejado());
        listaVip.putString("TelefoneContato",pessoa.getTelefoneContato());
        listaVip.apply();
    }

    public void limpar(){
        listaVip.clear();
        listaVip.apply();
    }

    public Pessoa buscar(Pessoa pessoa){
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome",""));
        pessoa.setSobrenome(preferences.getString("sobreNome",""));
        pessoa.setCursoDesejado(preferences.getString("CursoDesejado",""));
        pessoa.setTelefoneContato(preferences.getString("TelefoneContato",""));
        return pessoa;

    }
}
