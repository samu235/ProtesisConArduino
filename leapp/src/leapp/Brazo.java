package leapp;

public class Brazo {
	double x,y;
	double l1 = 0.15;
	double l2 = 0.16;
	double Angulo1;
	double Angulo2;
	double Angulo3;
	
	public Brazo(){
		this.x=0.16;
		this.y=0.15;
	}
	public void setX(double x){
		this.x=x;
		
	}
	public void setY(double y){
		this.y=y;
		
	}
	public double setAngulo2(){
		double ang2 = Math.acos(Math.sqrt(((((x*x)+(y*y)-(l2*l2))/(l1*l1))+1)/2)-1)-1.5707;
		this.Angulo2=ang2;
		return ang2;
	}
	public double setAngulo3(){
		double ang2 = Math.acos(Math.sqrt(((((x*x)+(y*y)-(l2*l2))/(l1*l1))+1)/2)-1)-1.5707;
		//System.out.println(((x+l1*Math.sin(ang2+(Math.PI/2)))/l2)-1);
		double ang3 = Math.acos(((x+l1*Math.sin(ang2))/l2)-1)-ang2-1.5707;
		this.Angulo3=ang3;
		return ang3;
	}
	
	
	public static void main(String[] args) {
		Brazo brazo = new Brazo();
		System.out.println(brazo.setAngulo2());
		System.out.println(brazo.setAngulo3());
		
	}
}

