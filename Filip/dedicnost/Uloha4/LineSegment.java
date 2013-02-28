package Uloha4;

public class LineSegment {
	int x1;
	int y1;
	int x2;
	int y2;
	
	public LineSegment(MyPoint p, MyPoint p1){
		this.x1=p.x;
		this.y1=p.y;
		this.x2=p1.x;
		this.y2=p1.y;
	}
	
	public double distance(){
		double distance;
		distance = Math.sqrt((this.x1-this.x2)*(this.x1-this.x2)+(this.y1-this.y2)*(this.y1-this.y2));
		return distance;
	}
	
	public MyPoint center(){
		MyPoint p = new MyPoint();
		p.x = (this.x1+this.x2)/2;
		p.y = (this.y1+this.y2)/2;
		return p;
	}

}
