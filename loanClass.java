package exercise;

public class loanClass {
    private double annualInterest;
    private int NumberOfYears;
    private double loanAmount;

    public loanClass(){
        this.annualInterest=2.5;
        this.NumberOfYears=1;
        this.loanAmount=100;


    }
    public loanClass(double annualInterest, int NumberOfYears,double loanAmount){
        this.annualInterest=annualInterest;
        this.NumberOfYears=NumberOfYears;
        this.loanAmount=loanAmount;
    }
    public double getAnnualInterest(){
        return annualInterest;
    }
    public int getNumberOfYears(){
        return NumberOfYears;
    }
    public double getLoanAmount(){
       return loanAmount;
    }

    public void setAnnualInterest(double annualInterest){
        this.annualInterest=annualInterest;
    }
    public void setNumberOfYears(int NumberOfYears){
        this.NumberOfYears=NumberOfYears;

    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount=loanAmount;
    }
    public double getmonthlypayment(){
        double monthly=annualInterest/100/12;
        int numberpayment =NumberOfYears*12;
        return loanAmount * monthly / (1 - Math.pow( 1 + monthly, - numberpayment));
    }
    public double getotal(){
        return getmonthlypayment() * NumberOfYears *12;
    }

}
class test1{
    public static void main(String[] args) {
        loanClass loan1=new loanClass(4.0,2,200);
        System.out.println(loan1.getmonthlypayment());
        System.out.println(loan1.getotal());

    }
}
