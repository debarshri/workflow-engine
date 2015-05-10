package workflow;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import trigger.ExtTrigger;

import static org.quartz.JobBuilder.newJob;

public class BITWorkFlow {
    private JobDetail jobDetail;
    private ExtTrigger trigger;

    public BITWorkFlow(Class<? extends Job> job, ExtTrigger trigger) {

        jobDetail = newJob(job)
                .withIdentity("default", "default")
                .build();
        
        this.trigger = trigger;
    }

    public JobDetail getJobDetail() {
        return jobDetail;
    }

    public Trigger getTrigger() {
        return trigger.getTrigger();
    }
}
