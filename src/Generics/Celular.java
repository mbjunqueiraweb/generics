package Generics;

public class Celular implements Precedente<Celular>{

    Long numero;
    String proprietario;

    public Celular(Long numero, String proprietario) {
        this.proprietario = proprietario;
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public int precedeA(Celular t) {
        return this.numero.compareTo(t.numero);
    }

    @Override
    public String toString(){
        return  "Numero: " + this.numero;
    }
}
