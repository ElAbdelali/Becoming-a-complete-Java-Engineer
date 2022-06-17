package abstractHMS;

public class SilverPlan extends HealthInsurancePlan {
	private double coverage = .7;
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public double getCoverage() {
        return coverage;
    }
	@Override
	public double computeMonthlyPremium(double salary) {
		return salary * .06;
	}
}