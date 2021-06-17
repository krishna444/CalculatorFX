public class CalcHelper {
    /**
     * This value is always displayed on calculator display
     */
    private double result;
    //Second value to be operated on
    private double operand;

    public CalcHelper(){
        this.result=0.0;
        this.operand=0.0;
    }

    public void processDigit(int input){
        
    }



    /**
     * Gets the result to display
     * @return Result 
     */
    public double getResult(){
        return this.result;
    }
}
   
    