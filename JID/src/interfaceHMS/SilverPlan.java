package interfaceHMS;

public class SilverPlan extends HealthInsurancePlan {
	private double coverage = .7;
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public double getCoverage() {
        return coverage;
    }
	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return (salary * .06) + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}