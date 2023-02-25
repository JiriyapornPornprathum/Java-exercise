import java.util.Scanner;

public class exercise3_1 {

      private Double cel;
      private Double fah;

      public void setCelcius(Double cel){
         this.cel = cel;
      }

      public void setFahrenheit(Double fah){
         this.fah = fah;
      }

      public void cal(){
         this.fah = (1.8 * this.cel) + 32;
      }
      
      public Double dis(){
         return this.fah;
      }   
}