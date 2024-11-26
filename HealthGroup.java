public class HealthGroup {

    private int bloodPressure;
    private int bloodSugar;

    public HealthGroup(int bloodPressure, int bloodSugar) {
        this.bloodPressure = bloodPressure;
        this.bloodSugar = bloodSugar;
    }

    public String getHealthStatus() {
        if (bloodPressure <= 120 && bloodSugar < 100) {
            return "General";
        } else if (bloodPressure <= 139 && bloodSugar <= 125) {
            return "Risk"; 
        } else if (bloodPressure <= 159 && bloodSugar <= 154) {
            return "High Risk Level 1"; 
        } else if (bloodPressure <= 179 && bloodSugar <= 182) {
            return "High Risk Level 2"; 
        } else if (bloodPressure >= 180 && bloodSugar >= 183) {
            return "High Risk Level 3"; 
        }
        return "Undefined"; 
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setBloodSugar(int bloodSugar) {
        this.bloodSugar = bloodSugar;
    }
}
