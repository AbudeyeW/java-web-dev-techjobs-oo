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
    Job nonexistenJob;
    int delta = 1;
    @Before
    public void CreateJobObj(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        identicalJob1 = new Job("Full Stack Engineer", new Employer("Splitwise"), new Location("Rhode Island"), new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));
        identicalJob2 = new Job("Full Stack Engineer", new Employer("Splitwise"), new Location("Rhode Island"), new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));
        nonexistenJob = new Job("Full Stack Engineer", new Employer(""), new Location("Rhode Island"), new PositionType("Web - Full Stack"), new CoreCompetency("Ruby"));
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
    @Test
    public void testJobsForToString(){
        String testNewLine = "\n" + "ID: " + identicalJob1.hashCode() + "\n" + "Name: " + identicalJob1.getName() + "\n" + "Employer: " + identicalJob1.getEmployer() + "\n" + "Location: " + identicalJob1.getLocation() + "\n" + "Position Type: " + identicalJob1.getPositionType() + "\n" + "Core Competency: " + identicalJob1.getCoreCompetency() + "\n";
        assertEquals(testNewLine,identicalJob1.toString());

        String testFakeString = "\n" + "ID: " + nonexistenJob.hashCode() + "\n" + "Name: " + nonexistenJob.getName() + "\n" + "Employer: " +"Data not available" + "\n" + "Location: " + nonexistenJob.getLocation() + "\n" + "Position Type: " + nonexistenJob.getPositionType() + "\n" + "Core Competency: " + nonexistenJob.getCoreCompetency() + "\n";
        assertEquals(testFakeString,nonexistenJob.toString());

    }
}
