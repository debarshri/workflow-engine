package schedule;

public class ScheduleConverter {
    public static String schedule(String easySchedule) throws ScheduleException {
        /**
         *   @daily 21h30m
         *   @hourly 45m
         *   @weekly wed 12h20m
         *   @weekly wed,thur,fri, sat 12h20m
         *   Todo later *   *
         *   @monthly dd/mm/yyyy 12h20m
         *   @monthly dd/mm/yyyy,dd/mm/yyyy,dd/mm/yyyy 12h20m   
         */

        //find schedule

        String[] split = easySchedule.split("\\ ");

        if (split.length > 1) {
            if (split.length == 2) {
                String schedule = split[0].toUpperCase();
                if (schedule.equals("@DAILY")) {
                    DayTime dayTime = dayTime(split[1]);
                    return String.format("0 %s %s 1/1 * ? *", dayTime.getMinute(), dayTime.getHour());
                } else if (schedule.equals("@HOURLY")) {
                    String minutes = split[1].substring(0, split[1].indexOf("m"));
                    return String.format("0 0/%s * 1/1 * ? *", minutes);
                } else if (schedule.equals("@WEEKLY")) {
                    String days = split[1].toUpperCase();
                    DayTime dayTime = dayTime(split[2]);
                    return String.format("0 %s %s ? * %s *", dayTime.getMinute(), dayTime.getHour(),days);
                }
            }
        } else {
            throw new ScheduleException();
        }
        throw new ScheduleException();
    }

    private static DayTime dayTime(String s) throws ScheduleException {
        String[] hs = s.split("h");
        if (hs.length == 2) {
            String hour = hs[0];
            if (Integer.valueOf(hour) > 23) {
                throw new ScheduleException();
            } else {
                String minutes = hs[1].substring(0, hs[1].indexOf("m"));
                return new DayTime(hour, minutes);
            }
        }
        throw new ScheduleException();
    }
}
