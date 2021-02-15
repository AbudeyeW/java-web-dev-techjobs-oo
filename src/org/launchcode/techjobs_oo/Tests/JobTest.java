package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    @Before
    public void CreateJobObj(){
        job1 = new Job();
        job2 = new Job();
    }
    @Test
    public void testSettingJobId(){
        assertEquals(job1,job2);
    }

}
