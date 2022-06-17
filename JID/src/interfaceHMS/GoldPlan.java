package interfaceHMS;

public class GoldPlan extends HealthInsurancePlan {
	private double coverage = .8;
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public double getCoverage() {
        return coverage;
    }
	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return salary * .07 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}