	
	public class CurrencyConverterMethodTypes {
	    double [] exchangeRates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};

		void setExchangeRates(double[] rates){
			exchangeRates = rates;
		}

		void updateExchangeRates(int arrayIndex, double updatedRate){ // a method that updates a value in the array with the
			exchangeRates[arrayIndex] = updatedRate;
		}
		double getExchangeRates(int arrayIndex){
			return exchangeRates[arrayIndex];
		}

		double computeTransferAmount(int arrayIndex, double amount){
			return amount * getExchangeRates(arrayIndex);
		}
		
		void printCurrencies() {
			System.out.println("\nrupee: " + exchangeRates[0]);
			System.out.println("dirham: " + exchangeRates[1]);
			System.out.println("real: " + exchangeRates[2]);
			System.out.println("chilean_peso: " + exchangeRates[3]);
			System.out.println("mexican_peso: " + exchangeRates[4]);
			System.out.println("_yen: " + exchangeRates[5]);
			System.out.println("$australian: " + exchangeRates[6]);
	 	}
		public static void main(String[] args) {
			CurrencyConverterMethodTypes cc = new CurrencyConverterMethodTypes();
			// Computed on Jan 1st
			int id = 1000;
			double[] rates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0}; // declaration statement
			cc.setExchangeRates(rates);

			cc.printCurrencies(); // object reference is needed in order to access the instance method

			rates = new double[]{65.0, 3.0, 3.0, 595.0, 20.0, 107.0, 2.0}; // assignment statement
			cc.setExchangeRates(rates);

			cc.printCurrencies(); 
			
			cc.updateExchangeRates(2, 32.0);

			cc.printCurrencies();

			double computedAmount = cc.computeTransferAmount(3, 1000.00);
			System.out.println("\nTransferred amount: $" + computedAmount);

		}
}