package abstractHMS;

public class PlatinumPlan extends HealthInsurancePlan {
	private double coverage = .9;
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public double getCoverage() {
        return coverage;
    }
	@Override
	public double computeMonthlyPremium(double salary) {
		return salary * .08;
	}
}
