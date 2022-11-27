public class programador extends pessoa{
    private String trabalho;
    private float salario;

    public programador(){
    }

    public void renovarContrato(){
        System.out.println(this.getNome() + ", seu contrato está renovado!");
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
        System.out.println("Desenvolvedor FullStack");
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
        System.out.println(12000f);
    }
}
