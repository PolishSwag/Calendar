import java.awt.Graphics;


import javax.swing.*;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class calendar extends JComponent{
		int month;
		int year;
		
	  public calendar(int month, int year) {
		  this.month = month;
		  this.year = year;
	  }
	static int dayofweek(int d, int m, int y) 
	{ 
	    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
	    y -= (m < 3) ? 1 : 0; 
	    return ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7; 
	} 
 
	static int lastDayOfMonth(int m) 
	{
		if(m == 2) {
			return 29;
		}
		if(m == 1) {
			return 31;
		}
		if(m % 2 == 0) {
			return 30;
		}
		if(m % 2 != 0) {
			return 31;
		}
		
		return 0;
		
	} 
	
	
    public void paintComponent(Graphics g) {
    	
    	
    	String monthS = "";
    	
    	if(month == 1) {
    		monthS = "January";
    	}
    	if(month == 2){
    		monthS = "Febuary";
    	}
    	if(month == 3) {
    		monthS = "March";
    	}
    	
    	if(month == 4) {
    		monthS = "April";
    	}
    	
    	if(month == 5) {
    		monthS = "May";
    	}
    	if(month == 6) {
    		monthS = "June";
    	}
    	
    	if(month == 7) {
    		monthS = "July";
    	}
    	
    	if(month == 8) {
    		monthS = "August";
    	}
    	if(month == 9) {
    		monthS = "September";
    	}
    	if(month == 10) {
    		monthS = "October";
    	}
    	if(month == 11) {
    		monthS = "November";
    	}
    	if(month == 12) {
    		monthS = "December";
    	}
    	
    	
    	
    	
    	
    	
    	int calBoxSize = 120;
        int yCord = 20;
        	
        int drawDay = 1;

	    int firstDay = dayofweek(1, month, year); 
	    int lastMonthDay = lastDayOfMonth(month);
	    int lastDay = dayofweek(lastMonthDay, month, year); 
	    int p = 0;
	    
	   String displayTitle = monthS + ",  " +Integer.toString(year);
	    
        g.drawString(displayTitle, 450, yCord);
         
        yCord = 40;

	    
	    String dayList[] = {"Sun", "Mon", "Tue", "Wen", "Thu", "Fri", "Sat"};
    	for(int xCord = (calBoxSize/2); xCord <= (calBoxSize * 7) ; xCord += calBoxSize) {
    		
            g.drawString(dayList[p], xCord, yCord);
            p ++;
    	}
    	
    	yCord = 60;
       	for(int xCord = ((calBoxSize/2) + (calBoxSize * firstDay)); xCord <= (calBoxSize * 7) ; xCord += calBoxSize) {
    		g.drawRect (xCord, yCord, calBoxSize, calBoxSize); 
            g.drawString(Integer.toString(drawDay), (xCord + calBoxSize/15), (yCord + calBoxSize/8));
            drawDay += 1;
    		
    	}
    	yCord += calBoxSize;
        for(int i = 0; i < 3; i++) {
        	for(int xCord = (calBoxSize/2); xCord <= (calBoxSize * 7) ; xCord += calBoxSize) {
        		g.drawRect (xCord, yCord, calBoxSize, calBoxSize); 
                g.drawString(Integer.toString(drawDay), (xCord + calBoxSize/15), (yCord + calBoxSize/8));
                drawDay += 1;
        	}
        	yCord += calBoxSize;
        }
    	for(int xCord = (calBoxSize/2); xCord <= (calBoxSize * (lastDay + 1)) ; xCord += calBoxSize) {
    		g.drawRect (xCord, yCord, calBoxSize, calBoxSize); 
            g.drawString(Integer.toString(drawDay), (xCord + calBoxSize/15), (yCord + calBoxSize/8));
            drawDay += 1;
    	}
    }
}
