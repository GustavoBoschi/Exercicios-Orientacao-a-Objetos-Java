package exerciciosobrecarga03;

public class ExercicioSobrecarga03 {

    public static void main(String[] args) {

        Funcionario objF = new Funcionario();
        Gerente objG = new Gerente();

        objF.nome = "Jim Harper";
        objG.nome = "Michael Scott";

        System.out.println(objF.toString());
        System.out.println("");
        objG.atualizar(objF, "Vendedor");
        System.out.println(objF.toString());
        System.out.println("");
        objG.atualizar(objF, 4500);
        System.out.println(objF.toString());
        System.out.println("");

    }

}
