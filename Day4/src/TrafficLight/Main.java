package TrafficLight;

import java.util.Scanner;

import TrafficLight.TrafficLight.TrafficLights;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(TrafficLights tl :TrafficLights.values())
		{
			System.out.println(tl + ":" +tl.getValue());
		}
	
		
     //TrafficLights tl =TrafficLights.Yellow;
     
     /* switch(tl)
      {
      case Red:
      System.out.println("you must stop");
      break;
      case Green:
          System.out.println("Go");
          break;
      default:
          System.out.println("slow down and wait");
          break;
      
      
      }
   
      
      if (tl == TrafficLights.Red)
    	  System.out.println("you must stop");
      else  if (tl == TrafficLights.Green)
    	  System.out.println("Go");
      else  if (tl == TrafficLights.Yellow)
    	  System.out.println("slow down and wait");
      else 
    	  System.out.println("No need to wait are stop u can go still the signal appears");
    	  
	}*/

}
}
