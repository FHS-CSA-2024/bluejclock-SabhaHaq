package src.main.java;


public class ClockDisplaySeconds
{
    private NumberDisplay hours; 
    private NumberDisplay minutes; 
    private NumberDisplay seconds; 
    private String display; 
    //Extend ClockDisplaySeconds to include a seconds field.
    //Update all methods and parameters to accomodate this change
        public void updateDisplay() {
        String newDisplay = " "; 
        newDisplay=newDisplay + hours.getDisplayValue(); 
        newDisplay=newDisplay + ":"; 
        newDisplay=newDisplay + minutes.getDisplayValue(); 
        newDisplay = newDisplay + ";"; 
        newDisplay+=seconds.getDisplayValue(); 
        display = newDisplay; 
    }
    public ClockDisplaySeconds() {
        hours = new NumberDisplay(24); 
        minutes = new NumberDisplay(60); 
        seconds = new NumberDisplay(60); 
        updateDisplay(); 
    }
    public ClockDisplaySeconds(int hour, int minute, int second) {
        hours = new NumberDisplay(24); 
        minutes = new NumberDisplay(60); 
        seconds = new NumberDisplay (60); 
        setTime(hour, minute, second); 
    }
    public void timeTick(){
    if (seconds.getDisplayValue().equals(0)) {
        minutes.increment(); 
    }
    
