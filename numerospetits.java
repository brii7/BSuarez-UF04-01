package numerospetitssubv;
import java.util.Arrays;
import java.util.Scanner;
public class NumerosPetitsSUBV {
    
    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      int [] num = new int[10];
      
      for (int i=0; i<num.length;i++){
          System.out.println("Entra un numero");
          num[i] = lector.nextInt();
      }
      Arrays.sort(num);
      System.out.println("El número més petit és "+num[0]);
    }
    
}
