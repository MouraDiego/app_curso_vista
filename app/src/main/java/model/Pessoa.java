package model;

public class Pessoa {

    private String PrimeiroNome;

    private String Sobrenome;

    private String CursoDesejado;

    private String TelefoneContato;

    public Pessoa() {
    }

    public String getPrimeiroNome() {
        return PrimeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.PrimeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.Sobrenome = sobrenome;
    }

    public String getCursoDesejado() {
        return CursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.CursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return TelefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.TelefoneContato = telefoneContato;
    }


}

