import org.quartz.SchedulerException;
import schedule.Schedule;
import schedule.ScheduleException;
import trigger.ExtTrigger;
import workflow.BITWorkFlow;
import workflow.TestJob;

import static schedule.ScheduleConverter.schedule;

public class ExtScheduler {
    public static void main(String[] args) throws SchedulerException, ScheduleException {

        BITWorkFlow bitWorkFlow1 = new BITWorkFlow(TestJob.class,
                new ExtTrigger("bit","bit_2_hour", Schedule.EVERY_1_MINUTE));

        BITWorkFlow bitWorkFlow2 = new BITWorkFlow(TestJob.class,
                new ExtTrigger("bit","bit_2_hour_2", schedule("@daily 12h31m")));

        Engine engine = new Engine();
        
        engine.addFlow(bitWorkFlow1)
                .addFlow(bitWorkFlow2)
                .schedule()
                .start();
    }
}