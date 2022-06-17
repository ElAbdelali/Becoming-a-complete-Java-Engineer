package interfaceHMS;

public class HmsTest {

	public static void main(String[] args) {
		

		User platinumStaff = new User();
		InsuranceBrand platinumBrand = new BlueCrossBlueShield();
		HealthInsurancePlan platinumPlan = new PlatinumPlan();
		platinumPlan.setOfferedBy(platinumBrand);
		platinumStaff.setInsurancePlan(platinumPlan);
		
		User goldStaff = new User();
		InsuranceBrand goldBrand = new BlueCrossBlueShield();
		HealthInsurancePlan goldPlan = new GoldPlan();
		goldPlan.setOfferedBy(goldBrand);
		goldStaff.setInsurancePlan(goldPlan);
		
		User silverStaff = new User();
		InsuranceBrand silverBrand = new BlueCrossBlueShield();
		HealthInsurancePlan silverPlan = new SilverPlan();
		silverPlan.setOfferedBy(silverBrand);
		silverStaff.setInsurancePlan(silverPlan);
		
		User bronzeStaff = new User();
		InsuranceBrand bronzeBrand = new BlueCrossBlueShield();
		HealthInsurancePlan bronzePlan = new BronzePlan();
		bronzePlan.setOfferedBy(bronzeBrand);
		bronzeStaff.setInsurancePlan(bronzePlan);
		
		double platinumPremium = platinumPlan.computeMonthlyPremium(5000, 56, true);
		double goldPremium = goldPlan.computeMonthlyPremium(5000, 56, true);
		double silverPremium = silverPlan.computeMonthlyPremium(5000, 56, true);
		double bronzePremium = bronzePlan.computeMonthlyPremium(5000, 56, true);

		System.out.printf("The platinumPremium is: %.2f", platinumPremium);
		System.out.printf("%nThe goldPremium is: %.2f", goldPremium);
		System.out.printf("%nThe silverPremium is: %.2f", silverPremium);
		System.out.printf("%nThe bronzePremium is: %.2f", bronzePremium);
	
		
	}

}
