package org.launchcode.techjobs.oo.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    public JobTest() {
        Job obj1 = new Job();
        Job obj2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        Job obj1 = new Job();
        Job obj2 = new Job();
        assertNotEquals(obj1.getId(), obj2.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job obj3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(obj3.getName() instanceof String);
        assertTrue(obj3.getEmployer() instanceof Employer);
        assertTrue(obj3.getLocation() instanceof  Location);
        assertTrue(obj3.getPositionType() instanceof PositionType);
        assertTrue(obj3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(obj3.getName(), "Product tester");
        assertEquals(obj3.getEmployer(), "ACME");
        assertEquals(obj3.getLocation(), "Desert");
        assertEquals(obj3.getPositionType(), "Quality control");
        assertEquals(obj3.getCoreCompetency(), "Persistence");

    }

    @Test
    public void testJobsForEquality() {
        Job obj4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job obj5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(obj4.equals(obj5));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job obj6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        int length = obj6.toString().length();

        assertEquals(obj6.toString().charAt(0), '\n');
        assertEquals(obj6.toString().charAt(length - 1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job obj7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + obj7.getId() + "\nName: " + obj7.getName() + "\nEmployer: " + obj7.getEmployer() +
                "\nLocation: " + obj7.getLocation() + "\nPosition Type: " + obj7.getPositionType() + "\nCore Competency: "
                + obj7.getCoreCompetency() + "\n", obj7.toString());
    }
}
