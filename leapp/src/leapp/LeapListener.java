package leapp;

import com.leapmotion.leap.Controller;
import com.leapmotion.leap.Frame;
import com.leapmotion.leap.Gesture;
import com.leapmotion.leap.Hand;
import com.leapmotion.leap.Listener;
import com.leapmotion.leap.Vector;

class LeapListener extends Listener {
	// SerialTest miSerial = new SerialTest();
	// miSerial.initialize();
	public int radio = 0;
	public int x = 80;
	public int y = 250;
	public int z = 0;
	public int r = 0;
	public int u;
	public int v;
	public int w;
	
	Vector pos;
	Vector dir;

	public void onInit(Controller controller) {
		System.out.println("Initialized");
	}

	public void onConnect(Controller controller) {
		System.out.println("Connected to Motion Sensor");
		controller.enableGesture(Gesture.Type.TYPE_SWIPE);
		controller.enableGesture(Gesture.Type.TYPE_CIRCLE);
		controller.enableGesture(Gesture.Type.TYPE_SCREEN_TAP);
		controller.enableGesture(Gesture.Type.TYPE_KEY_TAP);
	}

	public void onDisconnect(Controller controller) {
		System.out.println("Disconnected to Motion Sensor");
	}

	public void onExit(Controller controller) {
		System.out.println("Exited");
	}

	public void onFrame(Controller controller) {
		
		Frame frame = controller.frame();
	
		for (Hand hand : frame.hands()) {
			String handType = hand.isLeft() ? "left Hand" : "mano derecha";
		
			radio = (int) hand.sphereRadius();
			pos = hand.palmPosition();
			x = (int) pos.getX();
			y = (int) pos.getY();
			z = (int) pos.getZ();
			r = (int) hand.sphereRadius();
			dir = hand.direction();
			u = (int) (dir.getX() * 1000);
			v = (int) (dir.getY() * 1000);
			w = (int) (dir.getZ() * 1000);
			System.out.print("x:");
			System.out.print(u);
			System.out.print("	y:");
			System.out.print(v);
			System.out.print("	z:");
			System.out.println(w);

		}

	}

}

