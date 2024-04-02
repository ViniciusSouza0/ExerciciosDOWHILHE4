package com.mycompany.exerciciosdowhile4;
import java.util.Scanner;
public class ExerciciosDOWHILE4 {
public static void main(String[] args) {
   
//Exiba todos os números primos até um limite fornecido pelo usuário.
//Dica: Use com IF-ELSE   
    
    
Scanner teclado = new Scanner(System.in); 

    
System.out.println("Digite um número limite");
int limite = teclado.nextInt();
int numero = 2;
boolean primo;

do { 
    
    primo = true; //Assume que o número é primo
    for (int i = 2; i <=numero / 2; i++) { 
    if (numero % i == 0){
    primo = false; //se o número for divisivel por outro//além de 1 e ele mesmo, não é primo
    
    break;
    
    }
    }
    if (primo){
        System.out.println(numero); }
    
numero++;
    
}while (numero <= limite);     
}
}
