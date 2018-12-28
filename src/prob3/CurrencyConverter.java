package prob3;

public class CurrencyConverter {
	private static double Rate;
	
	public static double  toDollar(double won) {
	    return (won/Rate);
	   }
	   public static double  toKRW(double dollar) {
	      return (dollar*Rate);
	   }
	   public static void setRate(double r) {
	       Rate=r;
	   }

	   
}
