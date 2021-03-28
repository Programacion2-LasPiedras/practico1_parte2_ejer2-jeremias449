import java.util.Scanner;
import java.util.Random;

public class Programa {
  Scanner sc=new Scanner(System.in);
	
	void iniciar(){
		
		int valor=generarAleatorio();
		int num;
		int resul;
    int nroazar;
		
		do{
			num=pedirNumero();
			resul=compararNumeros(num, valor);

		}while(resul!=0);
		System.out.println("Felicitaciones acertaste!!");
	}
	
	//devuelve un numero aleatorio entre 1 y 100
	int generarAleatorio(){
		int valor;
    Random rn = new Random();
    valor = rn.nextInt(101)+1;
    return valor;
	}
	
	//pide un nro por pantalla
	 int pedirNumero(){
		 Scanner entrada=new Scanner(System.in);
     System.out.println("Ingrese un número entre el 1 y 100:);
		 int num = sc.nextInt();
     return num;
		////completar aquí
		 
	 }
	
	 //compara dos enteros a y b. Devuelve un String indicando si es menor, mayor o igual
	 int compararNumeros(int a, int b){
		 if(a > b)
     {
       System.out.println("Demasiado Grande");
       return 1;
     }
     if(a < b)
     {
       System.out.println("Demasiado Chico");
       return 1;
     }
     if(a == b)
      System.out.println("");
       return 0;
	 
}

}