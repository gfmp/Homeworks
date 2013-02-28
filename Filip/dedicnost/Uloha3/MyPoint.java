package Uloha3;

public class MyPoint {
	int x;
	int y;
	
	public MyPoint(){
		this.x=25;
		this.y=10;
	}
	
	public MyPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public void setX(int x){
		this.x=x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public void setXY(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public double distance(int x, int y){
		double distance;
		distance = Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
		return distance;
	}
	
	public double distance(MyPoint c){
		double distance;
		distance = Math.sqrt((this.x-c.x)*(this.x-c.x)+(this.y-c.y)*(this.y-c.y));
		return distance;
	}
	
}
