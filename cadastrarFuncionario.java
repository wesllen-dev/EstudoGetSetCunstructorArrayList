public class cadastrarFuncionario {
    private String nome;
    private int idade;
    private String setor;
    private String email;
    private String empresa;
    public cadastrarFuncionario(String nome, int idade, String setor, String email, String empresa) {
        this.nome = nome;
        this.idade = idade;
        this.setor = setor;
        this.email = email;
        this.empresa = empresa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
