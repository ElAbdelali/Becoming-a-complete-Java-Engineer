package interfaceHMS;

public class BlueCrossBlueShield implements InsuranceBrand{
	private int id;
	private String name;
	
	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
		double total = 0;
		if(insurancePlan instanceof PlatinumPlan) {
			if(age > 55) {
				total += 200;
			}
			if(smoking == true) {
				total += 100;
			}
		}
		if(insurancePlan instanceof GoldPlan) {
			if(age > 55) {
				total += 150;
			}
			if(smoking == true) {
				total += 90;
			}
		}
		if(insurancePlan instanceof SilverPlan) {
			if(age > 55) {
				total += 100;
			}
			if(smoking == true) {
				total += 80;
			}
		}
		if(insurancePlan instanceof BronzePlan) {
			if(age > 55) {
				total += 50;
			}
			if(smoking == true) {
				total += 70;
			}
		}
		return total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
