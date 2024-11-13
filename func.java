import java.util.ArrayList;

public class func {
    String nome;
    int idade;
    String setor;
    String email;
    String empresa;

    public func () {
        this.idade = idade;
        this.setor = setor;
        this.email = email;
        this.empresa = empresa;
        this.nome = nome;
    }

    public String getNome() {
        return "Nome: " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return "Idade: " + idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return "Email: " + email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetor() {
        return"Setor: "+setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEmpresa() {
        return "Empresa: " + empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String setNome() {
        return "Nome: " + nome;
    }

    public String setIdade() {
        return("Idade: " + idade);
    }

    public String setSetor() {
        return "Setor: " + setor;
    }

    public String setEmail() {
        return "Email: " + email;
    }

    public String setEmpresa() {
        return "Empresa: " + empresa;
    }
    public void add(ArrayList<func> listaFuncionarios) {
    }
    public String toString() {
        return "nome: "+nome+"\nIdade: "+idade+"\nSetor: "+setor+"\nEmail: "+email+"\nEmpresa: "+empresa;
    }

    public void listFuncionarios(ArrayList<func> listaFuncionarios) {
    }
}
