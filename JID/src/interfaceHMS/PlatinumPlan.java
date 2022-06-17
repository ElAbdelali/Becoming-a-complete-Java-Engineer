package interfaceHMS;

public class PlatinumPlan extends HealthInsurancePlan {
	private double coverage = .9;
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public double getCoverage() {
        return coverage;
    }
	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return salary * .08 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
	
}
