package trigger;

import org.quartz.CronScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.triggers.CronTriggerImpl;
import schedule.Schedule;

public class ExtTrigger extends CronTriggerImpl{

    private final String triggerName;
    private final String groupName;
    private final String schedule;

    public ExtTrigger( String groupName,String triggerName, Schedule schedule)
    {
        this.triggerName = triggerName;
        this.groupName = groupName;
        this.schedule = schedule.toString();
    }

    public ExtTrigger( String groupName,String triggerName, String schedule)
    {
        this.triggerName = triggerName;
        this.groupName = groupName;
        this.schedule = schedule;
    }
    
    public Trigger getTrigger()
    {
        return TriggerBuilder
                .newTrigger()
                .withIdentity(TriggerKey.triggerKey(triggerName))
                .withSchedule(CronScheduleBuilder.cronSchedule(schedule))
                .build();
        
    }
}
