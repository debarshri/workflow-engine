package utils;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteStreamHandler;
import org.apache.commons.exec.PumpStreamHandler;
import workflow.Execution;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Os {

    public static Execution shell(String command) {
        CommandLine cmdLine = CommandLine.parse(command);
        int execute = 0;
        DefaultExecutor executor = new DefaultExecutor();
        ExecuteStreamHandler handler = executor.getStreamHandler();
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        PumpStreamHandler psh = new PumpStreamHandler(stdout);
        executor.setStreamHandler(psh);
        try {
            handler.setProcessOutputStream(System.in);
            execute = executor.execute(cmdLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Execution(stdout.toString(), execute);
    }
}
