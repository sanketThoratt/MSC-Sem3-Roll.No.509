import java.io.*;
import java.util.logging.*;
public class MyLogger
{
    public static void main(String args[])
   	 {
        		Logger l=Logger.getLogger(MyLogger.class.getName());
       		 FileHandler fh;
        		try
      	       {
      		 fh=new FileHandler("mylogfile.log",true);
       		 l.addHandler(fh);
       		 l.setLevel(Level.ALL);
      		  SimpleFormatter sf=new SimpleFormatter();
        		fh.setFormatter(sf);
       		 l.info("My first log");
   	     }
   	 catch(SecurityException e)
 	   {
      		  e.printStackTrace();
 	   }
    	catch(IOException e)
 	   {
       		 e.printStackTrace();
   	 }
  	  l.info("Hi How r u?");
 	 }
     }
