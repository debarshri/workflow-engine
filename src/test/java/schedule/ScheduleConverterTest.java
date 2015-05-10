package schedule;


public class ScheduleConverterTest {
    
    public static void main(String[] args) throws Exception, ScheduleException {

        String convert = ScheduleConverter.schedule("@daily 12h31m");
        System.out.println(convert);

    }
}