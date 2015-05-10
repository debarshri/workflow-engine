package workflow;

public class Execution {
    
    private String output;
    private int statusCode;

    public Execution(String output, int statusCode) {
        this.output = output;
        this.statusCode = statusCode;
    }

    public String getOutput() {
        return output;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
