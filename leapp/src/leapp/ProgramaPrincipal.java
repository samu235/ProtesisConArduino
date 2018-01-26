package leapp;

import java.io.IOException;
import com.leapmotion.leap.*;
import com.leapmotion.leap.Gesture.State;

//Hilo H1 = new Hilo();

public class ProgramaPrincipal {

	public static void main(String[] args) {
		int p = 1;
		int Radio, x, y, z, r, u, v, w;
		Vector posicion;
		Hilo HSerial = new Hilo();
		HiloLeap HLeap = new HiloLeap();
		HSerial.start();
		HLeap.start();
		// SerialSH serial = new SerialSH();
		System.out.println("Press enter to quit");

		while (true) {
			Radio = HLeap.listener.radio;
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
			try {
				Thread.sleep(50);
			} catch (Exception e) {
			}
			

		}
		
	}

}
