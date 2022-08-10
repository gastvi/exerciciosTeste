package exercicio00;
import java.util.Scanner; // import the Scanner class
public class Exercicio00 {

  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);
    Integer Homem1;
    Integer Homem2;
    Integer Mulher1;
    Integer Mulher2;

    System.out.println("primeiro os Homens");
    System.out.println("entre com sua idade");
    Homem1 = myObj.nextInt();  

    System.out.println("entre com sua idade");
    Homem2 = myObj.nextInt();

    System.out.println("Agora as mulheres");
    System.out.println("entre com sua idade");
    Mulher1 = myObj.nextInt();  

    System.out.println("entre com sua idade");
    Mulher2 = myObj.nextInt();


    if(Homem1 > Homem2 and Mulher2 < Mulher1){

     Integer temp;

     temp = homem1 + Mulher2;

     System.out.println("a soma das idades do homem mais velho com a mulher mais nova é: "+ temp );

     } else if (Homem1 > Homem2 and Mulher1 < Mulher2) {

     Integer temp;

     temp = homem1 + Mulher1;

     System.out.println("a soma das idades do homem mais velho com a mulher mais nova é: "+ temp );

    } else if (Homem2 > Homem1 and Mulher2 < Mulher1) {

     Integer temp;

     temp = homem2 + Mulher2;

     System.out.println("a soma das idades do homem mais velho com a mulher mais nova é: "+ temp );

    } else if (Homem2 > Homem1 and Mulher1 < Mulher2) {

     Integer temp;

     temp = homem2 + Mulher1;

     System.out.println("a soma das idades do homem mais velho com a mulher mais nova é: "+ temp );

    }  

     if(Homem1 < Homem2 and Mulher2 > Mulher1){

     Integer temp;

     temp = homem1 * Mulher2;

     System.out.println("produto das idades do homem mais novo com a mulher mais velha é: "+ temp );

     } else if (Homem1 < Homem2 and Mulher1 > Mulher2) {

     Integer temp;

     temp = homem1 * Mulher1;

     System.out.println("produto das idades do homem mais novo com a mulher mais velha é: "+ temp );

    } else if (Homem2 < Homem1 and Mulher2 > Mulher1) {

     Integer temp;

     temp = homem2 * Mulher2;

     System.out.println("produto das idades do homem mais novo com a mulher mais velha é: "+ temp );

    } else if (Homem2 < Homem1 and Mulher1 > Mulher2) {

     Integer temp;

     temp = homem2 * Mulher1;

     System.out.println("produto das idades do homem mais novo com a mulher mais velha é: "+ temp );

    }    
   
  }
}
    

