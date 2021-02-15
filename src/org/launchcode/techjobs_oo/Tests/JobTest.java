package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job identicalJob1;
    Job identicalJob2;
    int delta = 1;
    @Before
    public void CreateJobObj(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        identicalJob1 = new Job("Full Stack Engineer", new Employer("Splitwise"), new Location("Rhode Island"), new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));
        identicalJob2 = new Job("Full Stack Engineer", new Employer("Splitwise"), new Location("Rhode Island"), new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));

    }
    @Test
    public void testSettingJobId(){
        assertNotEquals(job1,job2);
        //Test below shows there is a difference of 1
        assertEquals(job1.hashCode(),job2.hashCode(),1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(job3.getName() instanceof String);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getCoreCompetency() instanceof  CoreCompetency);
        assertTrue(job3.getPositionType() instanceof  PositionType);
    }
    @Test
    public void testJobsForEquality(){
        assertNotEquals(identicalJob1.hashCode(),identicalJob2.hashCode());
    }

}
