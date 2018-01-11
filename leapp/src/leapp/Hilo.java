package leapp;

public class Hilo extends Thread {
	String aux;
	int R;
	int x=150;
	int y=-160;
	int z;
	int u,v,w;
	int cont = 0;
	SerialTest miSerial = new SerialTest();
	public void run(){
		while(true){
			switch (cont){
			case 0:aux="R"+Integer.toString(R);
			//System.out.println(R);
				cont++;
				break;
			case 1:aux="X"+Integer.toString(x);
				cont++;
				break;
			case 2:aux="Y"+Integer.toString(y);
				cont++;
				break;
			case 3:aux="Z"+Integer.toString(z);
				cont++;
				break;
			case 4: aux="U"+Integer.toString(u);
				cont++;
				break;
			case 5: aux="V"+Integer.toString(v);
				cont++;
				break;
			case 6: aux="W"+Integer.toString(w);
				cont = 0;
			break;
			default:cont=0; 
				
			}
			//aux="R"+Integer.toString(R);
			//System.out.println("se ejecuta");
			miSerial.EnviarDatos(aux);
			//System.out.println(R);
			try{
				Thread.sleep(50);
			}catch(Exception e){}
		}
	}
	public Hilo(){
		
		miSerial.initialize();
		
		
	}
	public void setR(int R){
		this.R = R;
	}
	public void setx(int x){
		this.x = x;
	}
	public void sety(int y){
		this.y = y;
	}
	public void setz(int z){
		this.z = z;
	}
	public void setu(int u){
		this.u = u;
	}
	public void setv(int v){
		this.v = v;
	}
	public void setw(int w){
		this.w = w;
	}
	

}