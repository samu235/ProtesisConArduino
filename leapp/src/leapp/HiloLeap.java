package leapp;

import java.io.IOException;

import com.leapmotion.leap.Controller;

public class HiloLeap extends Thread {
	String aux;
	int R;
	LeapListener listener = new LeapListener();
	Controller controller = new Controller();
	public void run(){
		try{
			System.in.read();
			
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
		controller.removeListener(listener);
		
	}
	public HiloLeap(){
		
		
		//SerialTest miSerial = new SerialTest();
		//miSerial.initialize();
		//String aux;
		
		controller.addListener(listener);
	}
	public int getR(){
		return this.R;
	}
	

} 
