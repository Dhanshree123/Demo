package SampleMaven.JavaPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
     
        String message = "Hello, World! Good Morning";
        LOG.debug(message+ " Will be printed on debug");
        LOG.info(message+ " Will be printed on debug");
        LOG.warn(message+ " Will be printed on debug");
        LOG.error(message+ " Will be printed on debug");
        LOG.fatal(message+ " Will be printed on debug");
        LOG.info("Appending string:{}.", message);
        System.out.println(message);
        
        
    }
}
