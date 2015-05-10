import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import workflow.BITWorkFlow;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Engine {

    private Set<BITWorkFlow> workFlowList;

    public Engine() {
        workFlowList = new HashSet<BITWorkFlow>();
    }

    public Engine addFlow(BITWorkFlow bitWorkFlow) {
        if (workFlowList == null) {
            workFlowList = new HashSet<BITWorkFlow>();
        }
        workFlowList.add(bitWorkFlow);
        return this;
    }

    public Engine addFlow(List<BITWorkFlow> bitWorkFlow) {
        if (workFlowList == null) {
            workFlowList = new HashSet<BITWorkFlow>();
        }
        workFlowList.addAll(bitWorkFlow);
        return this;
    }

    public Scheduler schedule() throws SchedulerException {
        SchedulerFactory schedulerFactory=new StdSchedulerFactory();
            Scheduler scheduler= schedulerFactory.getScheduler();
            
            for(BITWorkFlow bitWorkFlow : workFlowList)
            {
                scheduler.scheduleJob(bitWorkFlow.getJobDetail(), bitWorkFlow.getTrigger());
            }



        return scheduler;
    }
}
