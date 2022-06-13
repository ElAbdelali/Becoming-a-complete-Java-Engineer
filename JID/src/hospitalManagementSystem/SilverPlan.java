package hospitalManagementSystem;

public class SilverPlan extends HealthInsurancePlan {
	private double coverage = .7;
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public double getCoverage() {
        return coverage;
    }
}