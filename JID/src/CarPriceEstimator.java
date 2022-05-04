import java.time.LocalDate;

public class CarPriceEstimator {
	
	public double getSalePrice(String makeAndModel, int yearManufactured, double milesDriven, 
			int airBagsCount, boolean hasAbs, boolean hasEbd,
			boolean hasRearViewCamera, boolean hasSunRoof, boolean hasAutoAC,
			boolean hasAccidentHistory) {
		
		double salePrice = getPrice(makeAndModel, yearManufactured);
		int currentYear = LocalDate.now().getYear();		
		int ageOfCar = currentYear - yearManufactured + 1;
		System.out.println("ageOfCar: " +  ageOfCar);
		
		if(ageOfCar <= 10) {
			salePrice = salePrice - (salePrice * ageOfCar * 0.05);
		
		}else {
			return salePrice *= 0.1;
		}
		
		System.out.println("salePrice after depreciation: " + salePrice);
		
		if(!(airBagsCount >= 2 && hasAbs && hasEbd)){
			salePrice -= 1000;
		}

		System.out.println("salePrice after accounting for security features: " + salePrice);
		
		if(hasRearViewCamera && (hasSunRoof || hasAutoAC)){
				salePrice += 500;
		}
		
		System.out.println("salePrice after accounting for comfort features: " + salePrice);
		
		if(hasAccidentHistory) {
			salePrice -= 500;
		}
		
		System.out.println("salePrice after accounting for past accidents: " + salePrice);
		
		double expectedMilesDriven = ageOfCar * 10000.0;
		double additionalMiles = milesDriven - expectedMilesDriven;
		
		  	if (additionalMiles > 1000 && additionalMiles <= 10000){
	            salePrice -= 500;
	        }
		  	if (additionalMiles > 10000 && additionalMiles <= 30000){
	            salePrice -= 1000;
	        }
		  	if (additionalMiles > 30000){
	            salePrice -= 1500;
	        }
		
		System.out.println("salePrice after accounting for miles driven: " + salePrice);
		
		return salePrice;
	}
	
	private double getPrice(String makeAndModel, int yearManufactured) {
		if (makeAndModel.equalsIgnoreCase("ford ecosport")) {
			return 20000.0;
		} else if (makeAndModel.equalsIgnoreCase("honda city")) {
			return 25000.0;
		} else if (makeAndModel.equalsIgnoreCase("toyota camry hybrid")) {
			return 30000.0;
		}
		return 20000.0;
	}

	public static void main(String[] args) {
		CarPriceEstimator carPriceEstimator = new CarPriceEstimator();
		double salesPrice = carPriceEstimator.getSalePrice("ford ecosport", 2018, 60000.0, 2, true, false, true, false, false, true);		
	} 
}
