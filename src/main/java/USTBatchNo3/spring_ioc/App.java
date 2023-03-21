package USTBatchNo3.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Sim s= context.getBean(Sim.class);
    	s.calling();
    	s.dialing();
    }
}
