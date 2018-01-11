package leapp;

public class SerialSH {
	String aux;
	int R;
	int x=150;
	int y=-160;
	int z;
	int cont = 0;
	SerialTest miSerial = new SerialTest();
	
	public void SerialSH(){
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
	public void actualizar(){
		for(int i = 0; i < 4; i++){
			switch (i){
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
				cont=0;
				break;
			default:cont=0; 
				
			}
			miSerial.EnviarDatos(aux);
			try{
				Thread.sleep(50);
			}catch(Exception e){}
		
		}
	}
	public void setRCA(int R){
		this.R = R;
		aux="R"+Integer.toString(R);
	}
	public void setxCA(int x){
		this.x = x;
		aux="X"+Integer.toString(x);
	}
	public void setyCA(int y){
		this.y = y;
		aux="Y"+Integer.toString(y);
	}
	public void setzCA(int z){
		this.z = z;
		aux="Z"+Integer.toString(z);
	}
}
