# Yet another Java workflow-engine

This is a quartz scheduler based workflow engine with fluent APIs. More documentation will come soon.

It looks like this

```java
public class ExtScheduler {
    public static void main(String[] args) throws SchedulerException, ScheduleException {

        Engine engine = new Engine();

        BITWorkFlow bitWorkFlow1 = new BITWorkFlow(TestJob.class,
                new ExtTrigger("bit_2_hour", Schedule.EVERY_1_MINUTE));
        
        BITWorkFlow bitWorkFlow2 = new BITWorkFlow(TestJob.class,
                new ExtTrigger("bit_2_hour_2", schedule("@hourly 2m")));
                
        BITWorkFlow bitWorkFlow3 = new BITWorkFlow(TestJob.class,
                new ExtTrigger(schedule("@daily 17h57m")));

        engine.addFlow(bitWorkFlow1)
              .addFlow(bitWorkFlow2)
              .addFlow(bitWorkFlow3)
              .schedule()
              .start();
    }
}
```
