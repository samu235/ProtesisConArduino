package leapp;
import java.io.IOException;
import com.leapmotion.leap.*;
import com.leapmotion.leap.Gesture.State;
//Hilo H1 = new Hilo();
class LeapListener extends Listener{
	//SerialTest miSerial = new SerialTest();
	//miSerial.initialize();
	public int radio = 0;
	public int x = 80;
	public int y = 250;
	public int z = 0;
	public int r = 0;
	public int u;
	public int v;
	public int w;
	//public int posicion[] = new int [3];
	Vector pos;
	Vector dir;
	
	public void onInit(Controller controller){
		System.out.println("Initialized");
	}
	public void onConnect(Controller controller){
		System.out.println("Connected to Motion Sensor");
		controller.enableGesture(Gesture.Type.TYPE_SWIPE);
		controller.enableGesture(Gesture.Type.TYPE_CIRCLE);
		controller.enableGesture(Gesture.Type.TYPE_SCREEN_TAP);
		controller.enableGesture(Gesture.Type.TYPE_KEY_TAP);
	}
	public void onDisconnect(Controller controller){
		System.out.println("Disconnected to Motion Sensor");
	}
	public void onExit(Controller controller){
		System.out.println("Exited");
	}
	public void onFrame(Controller controller){
		//SerialTest miSerial = new SerialTest();
		//miSerial.initialize();
		Frame frame = controller.frame();
		/*System.out.println("frame id:  "+ frame.id()
							+ ", Timestamp:  "+ frame.timestamp()
							+ ", hands:  "+frame.hands().count()
							+ ",  fingers  "+ frame.fingers().count()
							+ ",  Tools:  "+ frame.tools().count()
							+ ",  Gestrues :"+frame.gestures().count());*/
		for(Hand hand :frame.hands()){
			String handType = hand.isLeft() ? "left Hand" : "mano derecha";
			/*System.out.println(handType +" ,  id:  "+ hand.id()
								+",  posicon de la palma: "+ hand.palmPosition()
								+",  Radio:  "+hand.sphereRadius());*/
			//miSerial.EnviarDatos(Integer.toString((int)hand.sphereRadius()));
			radio =(int) hand.sphereRadius();
			pos = hand.palmPosition();
			x = (int)pos.getX();
			y =(int)pos.getY();
			z =(int)pos.getZ();
			r =(int)hand.sphereRadius();
			dir = hand.direction();
			u = (int)(dir.getX()*1000);
			v =(int)(dir.getY()*1000);
			w =(int)(dir.getZ()*1000);
			System.out.print("x:");
			System.out.print(u);
			System.out.print("	y:");
			System.out.print(v);
			System.out.print("	z:");
			System.out.println(w);
			
		}
		
	}
	
	
}


public class LeapController {

	public static void main(String[] args) {
		int p=1;
		int Radio,x,y,z,r,u,v,w;
		Vector posicion;
		Hilo HSerial = new Hilo();
		HiloLeap HLeap = new HiloLeap();
		HSerial.start();
		HLeap.start();
		//SerialSH serial = new SerialSH();
		System.out.println("Press enter to quit");
		
	
		while(true){
			Radio=HLeap.listener.radio;
			//HSerial.setR(Radio);
			//HSerial.R=Radio;
			//System.out.println(HSerial.R);
			x = HLeap.listener.x;
			y = HLeap.listener.y;
			z = HLeap.listener.z;
			r = HLeap.listener.r;
			u = HLeap.listener.u;
			v = HLeap.listener.v;
			w = HLeap.listener.w;
			HSerial.setx(x);
			HSerial.sety(y);
			HSerial.setz(z);
			HSerial.setR(r);
			HSerial.setu(u);
			HSerial.setv(v);
			HSerial.setw(w);
			try{
				Thread.sleep(50);
			}catch(Exception e){}
			//HSerial.sety((int)posicion.getY());
			//HSerial.setz((int)posicion.getZ());
			
			
		}
		/*while(true){
			if(HLeap.listener.x != serial.x){
				//serial.x = HLeap.listener.x;
				//serial.actualizar();
				serial.setxCA(HLeap.listener.x);
			}
			if(HLeap.listener.y != serial.y){
				//serial.y = HLeap.listener.y;
				//serial.actualizar();
				serial.setyCA(HLeap.listener.y);
			}
			if(HLeap.listener.z != serial.z){
				//serial.z = HLeap.listener.z;
				//serial.actualizar();
				serial.setzCA(HLeap.listener.z);
			}
			if(HLeap.listener.radio != serial.R){
				//serial.y = HLeap.listener.y;
				//serial.actualizar();
				serial.setRCA(HLeap.listener.radio);
			}
			try{
				Thread.sleep(50);
			}catch(Exception e){}
		}*/
	}

	

}
