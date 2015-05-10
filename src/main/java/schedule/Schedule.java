package schedule;

public enum Schedule {

    EVERY_1_MINUTE {
        @Override public String toString()
        {
            return "0 0/1 * 1/1 * ? *";
        }
    },
    EVERY_5_MINUTE {
        @Override public String toString()
        {
            return "0 0/5 * 1/1 * ? *";
        }
    },
    EVERY_15_MINUTE {
        @Override public String toString()
        {
            return "0 0/15 * 1/1 * ? *";
        }
    },
    EVERY_30_MINUTE {
        @Override public String toString()
        {
            return "0 0/30 * 1/1 * ? *";
        }
    },
    EVERY_45_MINUTE {
        @Override public String toString()
        {
            return "0 0/45 * 1/1 * ? *";
        }
    },
    EVERY_HOUR {
                @Override public String toString()
                {
                    return "0 0 0/1 1/1 * ? *";
                }
            },
    EVERY_2_HOUR {
        @Override public String toString()
        {
            return "0 0 0/2 1/1 * ? *";
        }
    },
    EVERY_3_HOUR {
        @Override public String toString()
        {
            return "0 0 0/3 1/1 * ? *";
        }
    },
    EVERY_4_HOUR {
        @Override public String toString()
        {
            return "0 0 0/4 1/1 * ? *";
        }
    },
    EVERY_5_HOUR {
        @Override public String toString()
        {
            return "0 0 0/5 1/1 * ? *";
        }
    },
    EVERY_6_HOUR {
        @Override public String toString()
        {
            return "0 0 0/6 1/1 * ? *";
        }
    },
    EVERY_7_HOUR {
        @Override public String toString()
        {
            return "0 0 0/7 1/1 * ? *";
        }
    },
    EVERY_8_HOUR {
        @Override public String toString()
        {
            return "0 0 0/8 1/1 * ? *";
        }
    },
    EVERY_9_HOUR {
        @Override public String toString()
        {
            return "0 0 0/9 1/1 * ? *";
        }
    },
    EVERY_10_HOUR {
        @Override public String toString()
        {
            return "0 0 0/10 1/1 * ? *";
        }
    },
    EVERY_11_HOUR {
        @Override public String toString()
        {
            return "0 0 0/11 1/1 * ? *";
        }
    },
    EVERY_12_HOUR {
        @Override public String toString()
        {
            return "0 0 0/12 1/1 * ? *";
        }
    },
    EVERY_WEEKDAY {
        @Override public String toString()
        {
            return "0 0 12 ? * MON-FRI *";
        }
    },
    EVERY_DAY {
        @Override public String toString()
        {
            return "0 0 0/24 1/1 * ? *";
        }
    }
}
