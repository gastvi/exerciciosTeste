public class Exercicio01 {

    public static void main(String[] args) {

    System.out.println("Parte 2");
    System.out.println("Considerando as tabelas abaixo crie select de consolidação de dados");
   
 System.out.println("Montar select que retorne nome do departamento, quantidade de tarefas finalizadas e quantidade de tarefas não finalizadas:")
 
 System.out.println("select rd.Título, sum(CASE WHEN Finalizado = true THEN quantity ELSE 0 END) as Feita, sum(CASE WHEN Finalizado = false THEN quantity ELSE 0 END) as NaoFeitas
from tb_Registro_Tarefa rt, tb_Registro_Departamento rd
where rp.idDepartamento = rd.id and
GROUP BY rt.idDepartamento")

System.out.println("Montar select que retorne nome do departamento, quantidade de tarefas finalizadas e quantidade de tarefas não finalizadas:")

System.out.println("select rd.Título, sum(CASE WHEN Finalizado = true THEN quantity ELSE 0 END) as Feita, sum(CASE WHEN Finalizado = false THEN quantity ELSE 0 END) as NaoFeitas
from tb_Registro_Tarefa rt, tb_Registro_Departamento rd
where rp.idDepartamento = rd.id and
GROUP BY rt.idDepartamento")

System.out.println("Retornar a pessoa que mais gastou horas em janeiro de 2022":)

System.out.println("select rp.Nome, max(Duração) Tempo_Trabalho, rt.prazo
from tb_Registro_Tarefa rt, tb_Registro_pessoas rp
where rp.idPessoa = rp.id and
rt.Prazo between to_date('01-01-2022','DD-MM-YYYY') and to_date('31-01-2022','DD-MM-YYYY')")

System.out.println("Select que retorne título da tarefa, prazo, se tiver pessoa alocada na tarefa exibir como “Encaminhado para + nome do pessoa” caso contrário “Pendente” e total de horas que essa pessoa já gastou. Ordenar por prazo decrescente. 
:")

System.out.println("
select rt.Título, rt.Prazo, rt.Duração,
case rt.idPessoa
when 1 then 'Encaminhado para Camila'
when 2 then 'Encaminhado para Pedro'
when 3 then 'Encaminhado para Fabiano'
when 4 then 'Encaminhado para Raquel'
when 5 then 'Encaminhado para Patricia'
when 6 then 'Encaminhado para Joaquim'
ELSE 'pendente'
from tb_Registro_Tarefa rt
order by prt.razo DESC")

    }
}
