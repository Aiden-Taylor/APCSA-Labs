public class Commission extends Hourly{
    double totalSales;
    double commis;
    double temp;
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comis){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commis = comis;
    }
    public void addSales(double tSales){
        totalSales += tSales;
    }
    public double tPay(){
        temp = totalSales;
        totalSales = 0;
        return(pay() + totalSales*commis);
    }
}