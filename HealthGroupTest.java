import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HealthGroupTest {

    
    @Test
    public void testGeneralGroup() {
        HealthGroup group = new HealthGroup(115, 90); 
        assertEquals("General", group.getHealthStatus()); 
    }

    @Test
    public void testRiskGroup() {
        HealthGroup group = new HealthGroup(130, 110); 
        assertEquals("Risk", group.getHealthStatus()); 
    }

    @Test
    public void testHighRiskLevel1() {
        HealthGroup group = new HealthGroup(150, 140); 
        assertEquals("High Risk Level 1", group.getHealthStatus()); 
    }

    @Test
    public void testHighRiskLevel2() {
        HealthGroup group = new HealthGroup(170, 160); 
        assertEquals("High Risk Level 2", group.getHealthStatus()); 
    }

    @Test
    public void testHighRiskLevel3() {
        HealthGroup group = new HealthGroup(190, 200);
        assertEquals("High Risk Level 3", group.getHealthStatus()); 
    }

  
    @Test
    public void testSetBloodPressure() {
        HealthGroup group = new HealthGroup(120, 110); 
        group.setBloodPressure(130); 
        assertEquals(130, group.bloodPressure); 
    }

   
    @Test
    public void testSetBloodSugar() {
        HealthGroup group = new HealthGroup(120, 110); 
        group.setBloodSugar(120); 
        assertEquals(120, group.bloodSugar);
    }
}
