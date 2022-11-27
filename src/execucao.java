public class execucao {
    public static void main(String[] args){
        pessoa p1 = new pessoa();
        programador pro1 = new programador();

        p1.setNome("Darlison");
        p1.setIdade(24);



        pro1.setNome("Darlison");
        pro1.setIdade(24);
        pro1.setSalario(12000f);
        pro1.setTrabalho("Desenvolvedor FullStack");
        pro1.renovarContrato();

        System.out.println(p1.toString());
        System.out.println(pro1.toString());
    }
}
