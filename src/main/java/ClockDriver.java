package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay ticktest1 = new ClockDisplay(3,32);
        String ticktest1Output=ticktest1.getTime();
        System.out.println(ticktest1Output); 
        ticktest1.timeTick();
        ticktest1Output=ticktest1.getTime(); 
        System.out.println(ticktest1Output); 
        
        ClockDisplay ticktest2 = new ClockDisplay(3,9);
        String ticktest2Output=ticktest2.getTime();
        System.out.println(ticktest2Output); 
        ticktest2.timeTick();
        ticktest1Output=ticktest2.getTime(); 
        System.out.println(ticktest1Output); 
        
        ClockDisplay ticktest3 = new ClockDisplay(1,59);
        String ticktest3Output=ticktest3.getTime();
        System.out.println(ticktest1Output); 
        ticktest3.timeTick();
        ticktest3Output=ticktest3.getTime(); 
        System.out.println(ticktest1Output); 
        
        ClockDisplay ticktest4 = new ClockDisplay(9, 59);
        String ticktest4Output=ticktest4.getTime();
        System.out.println(ticktest4Output); 
        ticktest4.timeTick();
        ticktest4Output=ticktest4.getTime(); 
        System.out.println(ticktest4Output); 
        
        ClockDisplay ticktest5 = new ClockDisplay(23,59);
        String ticktest5Output=ticktest5.getTime();
        System.out.println(ticktest5Output); 
        ticktest5.timeTick();
        ticktest5Output=ticktest1.getTime(); 
        System.out.println(ticktest1Output); 
        
        
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds test1 = new ClockDisplaySeconds(); 
        String test1output = test1.getTime(); 
        System.out.println(test1output); 
        
        ClockDisplaySeconds test2 = new ClockDisplaySeconds(2,45,26); 
        String test2output = test2.getTime(); 
        System.out.println(test2output); 
        
        ClockDisplaySeconds test3 = new ClockDisplaySeconds(5,1,8); 
        String test3output = test3.getTime(); 
        System.out.println(test3output); 
        
        ClockDisplaySeconds test4 = new ClockDisplaySeconds(3,32,59); 
        String test4output = test4.getTime(); 
        System.out.println(test4output); 
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}

}
