package hospitalManagementSystem;

public class HmsTest {

	public static void main(String[] args) {
		

		
		HealthInsurancePlan bronzePlan = new BronzePlan();
		Patient bronzePatient = new Patient();
		bronzePatient.setInsurancePlan(bronzePlan);
		
		HealthInsurancePlan silverPlan = new SilverPlan();
		Patient silverPatient = new Patient();
		silverPatient.setInsurancePlan(silverPlan);
		
		HealthInsurancePlan goldPlan = new GoldPlan();
		Patient goldPatient = new Patient();
		goldPatient.setInsurancePlan(goldPlan);
		
		
		HealthInsurancePlan platinumPlan = new PlatinumPlan();
		Patient platinumPatient = new Patient();
		platinumPatient.setInsurancePlan(platinumPlan);
		

		double[] bronzePayments = Billing.computePaymentAmount(bronzePatient, 950);
		System.out.printf("The Bronze insurance company is paying: %.2f "
				+ "%nPatient owes: %.2f%n", bronzePayments[0], bronzePayments[1]);
		
		double[] silverPayments = Billing.computePaymentAmount(silverPatient, 950);
		System.out.printf("%nThe Silver insurance company is paying: %.2f "
				+ "%nPatient owes: %.2f%n", silverPayments[0], silverPayments[1]);
		
		double[] goldPayments = Billing.computePaymentAmount(goldPatient, 950);
		System.out.printf("%nThe Gold insurance company is paying: %.2f "
				+ "%nPatient owes: %.2f%n", goldPayments[0], goldPayments[1]);
		
		double[] platinumPayments = Billing.computePaymentAmount(platinumPatient, 950);
		System.out.printf("%nThe Platinum insurance company is paying: %.2f "
				+ "%nPatient owes: %.2f%n", platinumPayments[0], platinumPayments[1]);
		
	}

}
