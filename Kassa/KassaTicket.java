
/**
 *Write a description of class KassaTicket here.
 *
 *@author (your name)
 *@version (a version number or a date)
 */
public class KassaTicket
{
    //Instance variables - replace the example below with your own
    private int _intPrice;
    //Price of a ticket;
    private int _intAmount;
    //Number of Tickets;
    public KassaTicket(int intgivenPrice)
    {
        _intPrice = intgivenPrice;
        _intAmount = 0;
    }
   
    public int getPrice()
    {
        return _intPrice;
    }
    
    public void setAmount(int _Amount)
    {
        _intAmount = _Amount;
    }
    
    public int getAmount()
    {
        return _intAmount;
    }
    
    public int getTotal()
    {
        return _intPrice * _intAmount;
    }
    
    public void PrintTicket()
    {
        System.out.println("De toegang voor de wedstrijd bedraagt " + _intPrice + " EUR");
        System.out.println("");
        System.out.println("Aantal tickets: " + _intAmount);
        System.out.println("Totaal te betalen: " + (_intAmount * _intPrice) + " EUR");
    }
}