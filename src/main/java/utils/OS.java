package utils;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteStreamHandler;
import org.apache.commons.exec.PumpStreamHandler;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Os {
    
    public static String shell(String command)
    {
        CommandLine cmdLine = CommandLine.parse(command);

        DefaultExecutor executor = new DefaultExecutor();
        ExecuteStreamHandler handler=executor.getStreamHandler();
        ByteArrayOutputStream stdout=new ByteArrayOutputStream();
        PumpStreamHandler psh=new PumpStreamHandler(stdout);
        executor.setStreamHandler(psh);
        try {
            handler.setProcessOutputStream(System.in);
        }
        catch (  IOException e) {
        }
        try {
            executor.execute(cmdLine);
        }
        catch (  Exception e) {
            
        }

        return stdout.toString();
    }
}
