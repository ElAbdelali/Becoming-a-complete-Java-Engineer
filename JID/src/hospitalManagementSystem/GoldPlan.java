package hospitalManagementSystem;

public class GoldPlan extends HealthInsurancePlan {
	private double coverage = .8;
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public double getCoverage() {
        return coverage;
    }
}