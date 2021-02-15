package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    int delta = 1;
    @Before
    public void CreateJobObj(){
        job1 = new Job();
        job2 = new Job();
    }
    @Test
    public void testSettingJobId(){
        assertNotEquals(job1,job2);
        //Test below shows there is a difference of 1
        assertEquals(job1.hashCode(),job2.hashCode(),1);
    }

}
