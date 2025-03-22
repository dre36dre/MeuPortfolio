public class Construtor{
    public static void main(String[] args){
        Aluno a = new Aluno(8,8,8);

    double mediaAluno=a.calcularMediaAluno();
    
    fi(mediaAluno < 6){
        a.situacaoAluno=STATUS.REPROVADO;
    }else{
        a.situacaoAluno=STATUS.APROVADO;
    }

System.out.println("Média: "+a.calcularMediaAluno()+ "e o aluno esta"+ a.STATUS)

//ENUM MATRICULA
A.situacaoAluno=MATRICULA.MATRICULADO;
System.out.println("O aluno esta: "+a.situacaoAluno);


    }main
}//classe