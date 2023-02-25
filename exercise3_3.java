
public class exercise3_3 {
    
        private int num, num1, num2, num3, num4;

        public void setNum(int num){
            this.num = num;
        }

        public void cal(){
            this.num1 = this.num / 1000;
            this.num2 = (this.num / 100) %10;
            this.num3 = (this.num / 10) %10;
            this.num4 = (this.num / 1) %10;
        }
        
        public void dis(){
            System.out.println(this.num1 + " " + this.num2 + " " + this.num3 + " " + this.num4);
        }
        
        
}
