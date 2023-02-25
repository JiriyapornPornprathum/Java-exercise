
public class exercise3_2 {
    
        private float principal;
        private float interate ;
        private float deposit ;        
        
        public void setPrincipal(float principal){
            this.principal = principal;
        }

        public void setInterate(float interate){
            this.interate = interate;
        }

        public void cal(){
            this.interate += 1;
            for(int i = 1; i <= 5; i++){
                this.deposit = this.principal * this.interate;
                System.out.println("Deposit = " + this.deposit);
                this.principal = this.deposit;
            }
        }
    
        
}