package Exercicio03;
import java.util.Scanner; // import the Scanner class
public class Exercicio03 {

    public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);
    Integer tamanhoLista1;
    Integer tamanhoLista2;
    Integer i = 1;
    Boolean a1 = true;
    Integer temp;

    System.out.println("escolha a quantidade  de mumeros que deseja inserir no arry")

    tamanhoLista1= myObj.nextInt();

    System.out.println("escolha a quantidade  de mumeros que deseja inserir no segundo arry")

    tamanhoLista1= myObj.nextInt();

    Integer[] arryNumeros1 = new Integer [tamanhoLista1];
    Integer[] arryNumeros2 = new Integer [tamanhoLista2];

    System.out.println("vamos adionar os numeros na primeira array");

    do{
   
    System.out.println("adicione o " + i + "º numero: ");
    arryNumeros1[i] = myObj.nextInt(); 
    i++;
   }while(i<tamanhoLista1);
  
   System.out.println("vamos adionar os numeros na segunda array");

   do{ 
    System.out.println("adicione o " + i + "º numero: ");
    arryNumeros2[i] = myObj.nextInt();  
    i++;
   }while(i<tamanhoLista2);
   
   Integer[] vetorOrdenado = new Integer [arryNumeros1.length + arryNumeros2.length];
   
   for(int a = 0; a < vetorOrdenado.length;a++){
   arryNumeros1[a] = vetorOrdenado[a];
   arryNumeros1[a+1] = vetorOrdenado[a];
   }
   
   for(int a = 0; a < vetorOrdenado.length;a++){
        for(int j = 0; j < vetorOrdenado.length - 1; j++){
            if(vetorOrdenado[a] < vetorOrdenado[j]){
                int aux = vetorOrdenado[i];
                vetorOrdenado[a] = vetorOrdenado[j];
                vetorOrdenado[j] = aux;
            }
            }
            }
}
}
