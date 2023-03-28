package pessoa;

public class Pessoa {
    String nome;
    Integer idade;
    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String GetNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer GetIdade(){
        return idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome:"+nome);
        sb.append(", Idade:"+idade);
        return sb.toString();
    }
}
