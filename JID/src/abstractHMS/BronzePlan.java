package abstractHMS;

public class BronzePlan extends HealthInsurancePlan {
	private double coverage = .6;
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public double getCoverage() {
        return coverage;
    }
	@Override
	public double computeMonthlyPremium(double salary) {
		return salary * .05;
	}
}