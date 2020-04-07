package br.mack.ps2.entidades;


public class Controle {
    private int tia;
    private String Horario_Saida;
    private String Horario_Entrada;
    private String nome;

    public Controle() {
    }

    public Controle(int tia, String Horario_Entrada, String Horario_Saida, String nome) {
        this.tia=tia;
        this.Horario_Entrada=Horario_Entrada;
        this.Horario_Saida=Horario_Saida;
        this.nome=nome;
    }

    public int getTia() {
        return tia;
    }

    public void setTia(int tia) {
        this.tia = tia;
    }

    public String getHorario_Saida() {
        return Horario_Saida;
    }

    public void setHorario_Saida(String horario_Saida) {
        this.Horario_Saida = horario_Saida;
    }

    public String getHorario_Entrada() {
        return Horario_Entrada;
    }

    public void setHorario_Entrada(String horario_Entrada) {
        this.Horario_Entrada = horario_Entrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return  " Nome: " + nome +
                " Tia:" + tia +
                " Horario de Entrada:" + Horario_Entrada +
                ", Horario de Saida: " + Horario_Saida + "]";
    }
}
